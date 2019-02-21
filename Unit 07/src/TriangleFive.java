//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter('c');
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		c = letter;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output="";
		for(int i = 1; i <= amount; i++)
		{
			for(int n = 1; n <= amount; n++)
			{
				output += alpha.substring(n, n+1);
			}
		}
		
		return output;
	}
}