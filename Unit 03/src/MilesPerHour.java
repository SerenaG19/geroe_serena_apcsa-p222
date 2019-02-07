//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/06/19
//Class - APCSA
//Lab  - Miles Per Hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	//initializes vars
	private int distance, hours, minutes;
	private double mph;

	
	//Default Constructor
	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0;
	}

	//Non-default / initializing constructor
	//uses local vars, is still defined as a public method
	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
	}

	//Modifier / accessor / setter method; sets global vars to local vars
	public void setNums(int dist, int hrs, int mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;
	}

	//Calculating method, calculates local var mph here using global vars distance and hours
	public void calcMPH()
	{
		mph = (double)distance/(hours+(minutes/60.0));
		
	  //Incorrect attempts:
		//double timeInMin = 60.0*(double)hours + (double)minutes;
		//double timeInHr = (double)timeInMin / 60.0;
		//mph = (double)distance / (double)timeInHr;
		
		//mph = (distance)/(hours + (minutes/60.0));
	}

	public void print()
	{
		//System.out.println("The speed in mph is " + mph);
		System.out.printf("%.0f\n", mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{			
		return distance + " miles in " + hours + " hours and " + minutes + " minutes = " + String.format("%.0f", mph) + " MPH.";
	}
}