//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
	}

	
	//This is an initialization constructor
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		
	}

	public void calcDistance()
	{
		distance = sqrt((double)((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne)));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		out.println(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " +distance+;
	}
}