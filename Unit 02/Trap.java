//© A+ Computer Science  -  www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/04/19
//Class - APCSP
//Lab  - Trapezoid Area

public class Trap
{
	public static double area( int base1, int base2, int height )
	{
		return (double)1/2*(base1+base2)*height;
		
		//The following code is an alternative to the code above that uses
		//object instantiation instead of using just the method
		
//		//setting the vars
//		private int base1, int base2, int height;
//		
//		//Constructor
//		public Trap(int b1, int b2, int h)
//		{
//			calculateArea(b1, b2, h);
//		}
//		
//		public void calculateArea(int b1, int b2, int h)
//		{
//			area=1/2*h*(double)(b1+b2);
//		}
	}
}