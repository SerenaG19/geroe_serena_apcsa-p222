//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/11/19
//Class - APCSA
//Lab  - String Odd or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	//instance variable declaration
	private String word;

	//default constructor
	public StringOddOrEven()
	{
		word = "";
	}

	//initialization constructor (not default, has a parameter)
	public StringOddOrEven(String s)
	{
		setString(s);
	}

	//modifier method
	public void setString(String s)
	{
		word = s;
	}

	//modifier / return method
 	public boolean isEven()
 	{
 		if(word.length() % 2 != 0) {
 			return false;
 		}
 		else {
 			return true;
 		}
	}

 	public String toString()
 	{
 		String output;
 		
 		if(isEven() == true) {
 			
 			output = "\"" + word + "\" has an even number of characters.\n";
 		}
 		else {
 			output =  "\"" + word + "\" has an odd number of characters.\n";
 		}
 		
 		return output;
	}
}