//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;
import java.util.Scanner;


public class TriangleOneRunner //Decreasing Word lab
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Q to quit");
		
		String input="";
		
		while(input.equals("Q") == false && input.equals("q") == false )
		{
			System.out.println("Enter a word");
			input = keyboard.nextLine();
		
			//add test cases
			TriangleOne test = new TriangleOne(input);
			System.out.println(test);
		} 
	}
}