//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/09/19
//Class - APCSA
//Lab  - Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5) + "\n" );
		
		System.out.println("111 is odd ::" + NumberVerify.isOdd(111) );
		System.out.println("111 is even ::" + NumberVerify.isEven(111) + "\n");
		
		System.out.println("2000 is odd ::" + NumberVerify.isOdd(2000) );
		System.out.println("2000 is even ::" + NumberVerify.isEven(2000) + "\n");	
	}
}