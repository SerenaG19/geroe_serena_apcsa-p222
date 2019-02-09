//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/09/19
//Class - APCSA
//Lab  - Odd or Even

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if(num % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isEven( int num )
	{
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}	
}