//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

import java.util.Scanner;


public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		//add test cases		
		
		String inputSent;
		String inputR;
				
		System.out.println("Enter a string");
		inputSent = keyboard.nextLine();
		System.out.println("Enter a char to remove");
		inputR = keyboard.next();
		char inputChar = inputR.charAt(0);
		
		LetterRemover test = new LetterRemover(inputSent, inputChar);
		
		//System.out.println(test);
		test.removeLetters();
	}
}