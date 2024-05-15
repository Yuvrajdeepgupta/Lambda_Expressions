/*Write a program that reads a list of strings, converts them to uppercase,
filters out the strings starting with a vowel, and then prints the remaining
strings*/

import java.util.*;
public class prog_5 
{
    public static void main(String[] args) 
    {
        List<String> strings = Arrays.asList("yuvraj","sachin","sanket","om","adi");
        
        strings.stream()
            .map(String::toUpperCase) 
            .filter(s -> !startsWithVowel(s)) 
            .forEach(System.out::println); 
    }

    public static boolean startsWithVowel(String s) 
    {
        String firstLetter = s.substring(0, 1);
        return "AEIOU".contains(firstLetter);
    }
}

//Output:
//	YUVRAJ
//	SACHIN
//	SANKET
