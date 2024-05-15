/*Create a functional interface Shape with a method double area() and a
default method void printArea(). Implement the interface using lambda
expressions for different shapes. Define the Shape functional interface with an
area method. Implement the interface for shapes like circle, square, and
rectangle using lambda expressions. Use the default method to print the area of
each shape*/

import java.util.*;

@FunctionalInterface
interface Shape
{
	double area();
	
	default void printArea()
	{
		System.out.println("Area:"+area()+"\n");
	}
}

public class prog_4 
{
	public static void main(String[] args) 
	{
		System.out.println("Circle:");
		Shape Circle=()->Math.PI*Math.pow(15,2);
		Circle.printArea();
		
		System.out.println("Square:");
		Shape Square=()->Math.pow(4,2);
		Square.printArea();
		
		System.out.println("Rectangle:");
		Shape Rectangle=()->4*3;
		Rectangle.printArea();
	}
}

//output:
//		Circle:
//		Area:706.8583470577034
//
//		Square:
//		Area:16.0
//
//		Rectangle:
//		Area:12.0


