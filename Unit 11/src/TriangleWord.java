//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
//	public static void printTriangle(String word)
	
	public static String printTriangle(String word)
	{
		String output = "";
		
		for(int i = 0; i < word.length()-1; i++)
		{
			System.out.println("i: " + i);
			for(int j = 0; j <= i; j++)
			{
				System.out.println("j: " + j);
				output += word.substring(0, i+1) + "\n";
			}
		}
		
		return output;
	}
}