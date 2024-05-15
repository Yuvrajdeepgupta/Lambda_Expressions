/*Write a program that demonstrates a function returning another function,
where the inner function calculates the square of a number. Define a function
that returns another function. The inner function should calculate the square of a
given number. Demonstrate the use of the returned function to calculate squares.*/

import java.util.function.*;

public class prog_6 
{
    public static void main(String[] args) 
    {
        Function<Integer,Integer> squarefunction=createSquareFunction();

        int n=5;
        int square=squarefunction.apply(n);
        System.out.println("Square of "+n+" is:"+square);
    }

    public static Function<Integer,Integer> createSquareFunction() 
    {
        return (Integer x)->x*x;
    }
}

//Output:
//	Square of 5 is:25
