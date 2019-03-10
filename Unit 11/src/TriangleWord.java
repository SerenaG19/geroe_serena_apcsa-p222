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

		for(int i = 0; i <= word.length()-1; i++)
		{
//			System.out.println("i:: " + i);
			
			int j = i;
			while(j >= 0)
			{
//				System.out.println("j (b4 dec) :: " + j);
				
				output += word.substring(0, i+1);
				
//				System.out.print("i+1 = ");
//				System.out.print(i+1);
//				System.out.println(";   i:: " + i);
				
				j--;
			}
			output+="\n";
		}
		return output;
	}
}