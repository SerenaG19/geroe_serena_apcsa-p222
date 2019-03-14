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
		num = top;
		den = bot;
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
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = (num * other.getDen()) + (other.getNum() * den);
		den = den * other.getDen();
		reduce();
	}

	private void reduce()
	{
//		System.out.println("num :: " + num + " and den :: " + den);
		num /= gcd(num,den);
		den /= gcd(num,den);
	}

	private int gcd(int numOne, int numTwo)
	{
		int smaller;
		if(numOne == 1 || numTwo == 1) return 1;
		else if(numOne <= numTwo) smaller = numOne;
		else smaller = numTwo;
		
		int factor = 1;
		for(int i = 2; i < (smaller+1)/2; i++)
		{
			if(smaller % i == 0 && i > factor) factor = i;
		}

		return factor;
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
		reduce();
		return myObj.getNum() == num && myObj.getDen() == den;
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
		return "Current number :: " + num + "/" + den;
	}
	
	
}