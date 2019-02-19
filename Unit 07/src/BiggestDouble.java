//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		if(one > two && one > three && one > four) return one;
		if(two > one && two > three && two > four) return two;
		if(three > one && three > two && three > four) return two;
		if(four > one && four > two && four > three) return four;
		else return 0;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + " \n" + "biggest = " + getBiggest();
	}
}