//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 

public class Skeleton implements Monster //Don't forget to IMPLEMENT!
{
	//add instance variables
	private String name;
	private int howBig;

	//add a constructor
	public Skeleton()
	{
		name = "not yet named";
		howBig = 0;
	}
	
	public Skeleton(String nm; int size)
	{
		name = nm;
		howBig = size;
	}

	//add code to implement the Monster interface
	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		return howBig<other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return howBig>other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other)
	{
		
	}

	//add a toString
	public String toString()
	{
		return name+" "+howBig;
	}
	
}