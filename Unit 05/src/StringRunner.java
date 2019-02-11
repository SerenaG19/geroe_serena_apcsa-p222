//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/11/19
//Class - APCSA
//Lab  - String Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{	
	public static void main ( String[] args )
	{		
		Scanner keyboard = new Scanner(System.in);
		
		StringOddOrEven test = new StringOddOrEven();
		
		for(int i = 0; i <=10; i++)
		{
			System.out.println("Enter a word to have its length analyzed. Enter Q to quit. \n");
			String input = keyboard.next();
			
			if(input == "Q")
			{
				System.out.println("Have a nice day");
				i = 10;
			}	
			
			else
			{				
				test.setString(input);
				test.isEven();		
				System.out.println(test);
			}
		
		}
	}
}