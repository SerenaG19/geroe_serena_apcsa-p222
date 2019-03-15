//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 

public class Zombie implements Monster
{
	private String lastName;
	private int height;
	
	public Zombie()
	{
		lastName = "Hulk";
		height = 10;
	}
	
	public Zombie(String lName, int howTall)
	{
		lastName = lName;
		height = howTall;
	}
	
	public String getName()
	{
		return lastName;
	}
	
	public int getHowBig()
	{
		return height;
	}

	public boolean isBigger(Monster other)
	{
		return height > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return height < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other)
	{
		return lastName.equals(other.getName());
	}
	
	public String toString()
	{
		return lastName + " " + height;
	}
}
