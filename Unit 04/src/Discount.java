//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/09/19
//Class - APCSA
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

/* Prompt:
 * Determine the amount of discount a person should receive. If the bill is more than
 * 2000, then the person should receive a 15% discount. If the bill is 2000 dollars or
 *  less, the person does not receive a discount of any kind.  */


public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		if(bill > 2000.0) {
			bill = 0.85*bill;
		}
		else {
			bill = bill * 1.0;
		}
		
		return bill;
	}
}