//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		do
		{
			System.out.println("\nEnter a word :: ");
			String word = keyboard.next();
			
			System.out.println(TriangleWord.printTriangle(word));
			
			System.out.println("\nDo you want to enter more sample input?");
			response = keyboard.next();
		}while (response.equals("Y") || response.equals("y"));
	}
}