//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/05/19
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

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

//	public MilesPerHour(int dist, int hrs, int mins)
//	{
//
//	}

	public void setNums(int dist, int hrs, int mins)
	{
		int dist = distance;
		int hrs = hours;
		int mins = minutes;
	}

	public void calcMPH()
	{
		double mph = distance / (double)(hours);
	}

	public void print()
	{
		System.out.println(mph);
	}
	
	//create a print or toString or both
	
//	public String toString()
//	{
//		return "";
//	}
//}