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
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		test.removeLetters();
		System.out.println(test + "\n");
	
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		test.removeLetters();
		System.out.println(test + "\n");
				
		test.setRemover("qwertyqwertyqwerty", 'a');
		test.removeLetters();
		System.out.println(test + "\n");
		
		test.setRemover("abababababa", 'b');
		test.removeLetters();
		System.out.println(test + "\n");
		
		test.setRemover("abaababababa", 'x');
		test.removeLetters();
		System.out.println(test);
		
//		Try to use user input in a loop--------------------------		
//		String inputSent="";
//		String inputR="";
//		
//		System.out.println("Enter Q to quit.");
//		
//		while( !inputSent.equals("Q") && !inputSent.equals("q") );
//		{
//			System.out.println("Enter a string\n");
//			inputSent = keyboard.nextLine();
//			
//			System.out.println("Enter a char to remove");
//			inputR = keyboard.next();
//			char inputChar = inputR.charAt(0);
//		
//			LetterRemover test = new LetterRemover(inputSent, inputChar);
//			test.removeLetters();
//			System.out.println(test);
//		}
		
	}
}