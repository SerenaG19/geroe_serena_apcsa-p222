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
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output="";
		
		for(int i = amount; i > 0; i--)
		{
			for(int n = amount; n > 0; n--)
			{
				//output += "n = " + n + " i = " + i + "\n";
			
				output += alpha.substring(indexOf(letter), indexOf(letter) +1 );
			
			
			}
			
		}
		
		
		return output;
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = amount; i > 0; i--)
//		{
//			for(int n = amount; n > 0; n--)
//			{
//				output += letter + " " + ;
//			}
//			
//			output += "\n";
//			
//		}
		

	}
}