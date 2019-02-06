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

	//this is the default constructor (no parameters)
	public Distance()
	{
	//set vars to 0	
		setCoordinates(0,0,0,0);

	}

	
	//This is an initializing / non-default constructor; has parameters
	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);
	}

	//this is a modifier / setter method
	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calcDistance()
	{
		distance = sqrt((double)((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne)));
	}
	
	//this is an accessor / getter method
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		out.println(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + distance;
	}
}