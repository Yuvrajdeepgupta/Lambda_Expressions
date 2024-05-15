/*Write a program that sorts a list of strings based on their lengths in
descending order. Define a custom comparator using a lambda expression that
compares strings based on their lengths. Use the custom comparator to sort the
list of strings in descending order of length.*/

import java.util.*;
public class prog_2 
{
	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("Satyam","Sunny","Sachinjha","Adi");
		
		System.out.println("Original List:\n"+list);
		
		Collections.sort(list,(a,b)->b.length()-a.length());
		
		System.out.println("Sorted List:\n"+list);
	}
}

//Output
//Original List:
//[Satyam, Sunny, Sachinjha, Adi]
//Sorted List:
//[Sachinjha, Satyam, Sunny, Adi]
