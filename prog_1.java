/*Create a functional interface Calculator with methods for addition,
subtraction, multiplication, and division. Implement these methods using
lambda expressions. Define the Calculator functional interface with methods for
arithmetic operations. Implement the interface methods using lambda
expressions for basic arithmetic operations.*/

import java.util.*;

@FunctionalInterface
interface Calculator
{
	int operation(int a,int b);
}

public class prog_1
{
	public static void main(String[] args) throws Exception
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int f=sc.nextInt();
			int s=sc.nextInt();
			
			System.out.println("Calculator:");
			System.out.println("Addition -> 1");
			System.out.println("Subtraction -> 2");
			System.out.println("Multiplication -> 3");
			System.out.println("Division -> 4");
			System.out.println("To Exit -> 0 \nEnter Choice:");
			int choice=sc.nextInt();
			switch (choice) 
			{
				case 1: 
				{
					Calculator add=(a,b)->a+b;
					System.out.println("Result:"+add.operation(f,s));
					break;
				}
				case 2:
				{
					Calculator subtract=(a,b)->a-b;
					System.out.println("Result:"+subtract.operation(f,s));
					break;
				}
				case 3:
				{
					Calculator multiplication=(a,b)->a*b;
					System.out.println("Result:"+multiplication.operation(f,s));
					break;
				}
				case 4:
				{
					try
					{
						Calculator divison=(a,b)->a/b;
						System.out.println("Result:"+divison.operation(f,s));
						break;						
					}
					catch(ArithmeticException e)
					{
						System.out.println(e);
						break;
					}
				}
				case 0:
				{
					System.exit(0);
				}
				default :
				{
					System.out.println("Wrong Choice!");
				}
			}
		}
	}
}

//Output:
//	Enter Two Numbers:
//		11
//		4
//		Calculator:
//		Addition -> 1
//		Subtraction -> 2
//		Multiplication -> 3
//		Division -> 4
//		To Exit -> 0 
//		Enter Choice:
//		3
//		Result:44