//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/09/19
//Class - APCSA
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt) + "\n" );
		
		out.print("Enter the original bill amount :: ");
		double amt1 = keyboard.nextDouble();
		
		System.out.println("Bill after discount :: " + Discount.getDiscountedBill(amt1) );
		
		
		
	}
}