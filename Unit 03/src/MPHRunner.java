//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/06/19
//Class - APCSA
//Lab  - Miles Per Hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		//Question: why use private vars here? How does the main method access them?
		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

//		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
//		test.calcMPH();
//		test.print();
		
		//add more test cases
		
		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		System.out.println(test);
	}
}