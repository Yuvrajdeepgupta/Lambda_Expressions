/*Write a program that demonstrates lazy evaluation by creating a lazy
sequence of prime numbers. Define a lazy sequence using lambda expressions
that generates prime numbers. Demonstrate lazy evaluation by printing the first
few prime numbers from the lazy sequence.*/

import java.util.*;
import java.util.stream.*;

public class prog_3 
{
    public static void main(String[] args) 
    {
        IntStream.iterate(2, n -> n + 1)
            .filter(prog_3::isPrime)
            .limit(10)
            .forEach(System.out::println);
    }

    public static boolean isPrime(int n) 
    {
        return n > 1 && IntStream.range(2, (int) Math.sqrt(n) + 1)
        		.noneMatch(i -> n % i == 0);
    }
}

//Output
//2
//3
//5
//7
//11
//13
//17
//19
//23
//29

