//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num, den;

	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}
	
	public Rational(int top, int bot)
	{
		setRational(top,bot);
	}
	
	//write a setRational method
	public void setRational(int top, int bot)
	{
		setNum(top);
		setDen(bot);
	}

	//write  a set method for numerator and denominator
	public void setNum(int top)
	{
		num = top;
	}
	
	public void setDen(int bot)
	{
		den = bot;
	}
	
	public void add(Rational  other)
	{
//		System.out.println("\n\nadd() before add --> num :: " + num + " and den :: " + den);
//		other.reduce();
//		reduce();
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = (num * other.getDen()) + (other.getNum() * den);
		den = den * other.getDen();
		reduce();
		
//		System.out.println("add() after add --> num :: " + num + " and den :: " + den);

		
		

	}

	private void reduce()
	{
//		System.out.println("reduce() before --> num :: " + num + " and den :: " + den);
//		System.out.println("Reduce : "+num+"/"+den);
//		if(num == den)
//		{
//			num = 1;
//			den = 1;
//		}
//		else
//		{
			int comDen = gcd(num,den);
			num /= comDen;
			den /= comDen;
//		}
		
//		System.out.println("reduce() after --> num :: " + num + " and den :: " + den);

	}

	private int gcd(int numOne, int numTwo)
	{
		for(int i = numOne; i > 1; i--)
			if(numOne%i == 0 && numTwo%i == 0) return i;
		return 1;
	}

	public Object clone ()
	{
		//return new rational object
		Rational clone = new Rational(num,den);
		return clone;
	}

	//ACCESSORS
	//write get methods for numerator and denominator
	public int getNum()
	{
		return num;
	}
	
	public int getDen()
	{
		return den;
	}
	
	
	public boolean equals( Object obj )
	{
		Rational myObj = (Rational) obj;
		
		return compareTo(myObj) == 0;
	//	reduce();
//		return myObj.getNum() == num && myObj.getDen() == den;
	}

	public int compareTo(Rational other)
	{
		double init = (double) num/den;
		double given = (double) other.getNum()/other.getDen();
		if(given > init) return -1;
		else if(given == init) return 0;
		else return 1;
	}

	//write  toString() method
	public String toString()
	{
		return num + "/" + den;
	}
	
	
}