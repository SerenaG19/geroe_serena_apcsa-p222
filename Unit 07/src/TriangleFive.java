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
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{		
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String output="";
		
		//Looks through each letter in alpha
		for(int q = 0; q < alpha.length; q++)
		{
			//makes sure letter is found
			if(alpha[q] == letter)
			{	
				//ensures things are printed in amount number of lines
				for(int i = amount; i > 0; i--)
				{
					//prints letter and letters following letter in a decreasing fashion
					for(int n = 0; n < i; n++)
					{						
						//makes each char print amount of times - 1 per time
						for(int w = amount; w > n; w--)
						{
							//prints elements from alpha array starting at letter
							//also implements the wrap-around							
							if(q+n < alpha.length) output += alpha[q+n];
							else output += alpha[Math.abs(alpha.length-q-n)];
						}
						output += " ";
					}
					output += "\n";
				}
				
			}
		}

		return output;
	}
}