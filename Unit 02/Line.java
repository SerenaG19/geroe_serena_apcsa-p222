//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/04/19

public class Line
{
	//setting the vars
	private int xOne, xTwo, yOne, yTwo;
	private double slope;
	
	//this is the Constructor
	public Line(int x1, int x2, int y1, int y2)
	{
		//call setCoordinates method; called the "setter"
		setCoordinates(x1, x2, y1, y2);
	}
	
	public void setCoordinates(int x1, int x2, int y1, int y2)
	{
		//sets "private instance variables"
		xOne=x1;
		xTwo=x2;
		yOne=y1;
		yTwo=y2;
	}
	
	public void calculateSlope()
	{
		//uses "casting" to make calculation accurate and compatible
		slope=(double)(yTwo-yOne)/(xTwo-xOne);
	}
	
	
	public void print()
	{
		//string uses two decimal pts (see slide deck)
		System.out.printf("the slope is %.2f\n", slope);
	}
	
//  given code:	
//	public static double getSlope( int x1, int y1, int x2, int y2 )
//	{
//		return 0;
//	}

}