/*Write a program that calculates factorial using a recursive lambda
expression. Define a recursive lambda expression to calculate factorial. Use the
lambda expression to calculate factorial of a given number.*/

@FunctionalInterface
interface FactorialCalculator {
    int factorial(int n);
}

public class prog_7 {
    public static void main(String[] args) 
    {   
        FactorialCalculator factorialCalculator = n -> 
        {
            if (n == 0 || n == 1) 
            {
                return 1;
            } 
            else 
            {
                return n * factorialCalculator.factorial(n - 1);
            }
        };

        
        int number = 5;
        int result = factorialCalculator.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

//Output:
//	Factorial of 5 is: 120
