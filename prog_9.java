/*Write a program that implements the producer-consumer problem using
lambda expressions and threads. Define a bounded buffer class that implements
a queue. Create producer and consumer classes that use lambda expressions to
produce and consume items from the bounded buffer. Create and start multiple
producer and consumer threads to demonstrate the producer-consumer problem*/

import java.util.LinkedList;
import java.util.Queue;

class BoundedBuffer<T> {
    private Queue<T> buffer;
    private int capacity;

    public BoundedBuffer(int capacity) {
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(T item) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait(); // Wait if buffer is full
        }
        buffer.offer(item);
        notifyAll(); // Notify waiting consumers
    }

    public synchronized T consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait if buffer is empty
        }
        T item = buffer.poll();
        notifyAll(); // Notify waiting producers
        return item;
    }
}

class Producer implements Runnable {
    private BoundedBuffer<Integer> buffer;

    public Producer(BoundedBuffer<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.produce(i);
                System.out.println("Produced: " + i);
                Thread.sleep(1000); // Simulate production time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BoundedBuffer<Integer> buffer;

    public Consumer(BoundedBuffer<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int item = buffer.consume();
                System.out.println("Consumed: " + item);
                Thread.sleep(1500); // Simulate consumption time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class prog_9 {
    public static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(5); // Bounded buffer with capacity 5

        // Create and start producer threads
        for (int i = 0; i < 3; i++) {
            Thread producerThread = new Thread(new Producer(buffer));
            producerThread.start();
        }

        // Create and start consumer threads
        for (int i = 0; i < 3; i++) {
            Thread consumerThread = new Thread(new Consumer(buffer));
            consumerThread.start();
        }
    }
}

