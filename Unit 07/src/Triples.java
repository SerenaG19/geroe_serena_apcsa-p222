//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Serena Geroe

/*---PROMPT-----------------------------------------------------------------------------------------------------
 * Use nested loops to generate all of the Pythagorean triples from 1 up to a provided
 * number. For three numbers to be a triple, they have to satisfy several requirements. First, the three numbers
 * in the triple must satisfy the a 2 + b 2 == c 2 . Second, if a is odd, b must be even and if a is even, then b must be
 * odd, and c must be odd for either a / b combination. Lastly, the greatest common factor of a, b, and, c must
 * be no greater than 1.
 */


import static java.lang.System.*;

public class Triples
{
   private int number;
   private int one, two, three;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 2; i < number; i++)
		{
			//if()
		}


		return 1;
	}
	

	public String toString()
	{
		String output="";

		for(int i = 1; i < number; i++)
		{
			for(int j = 1; j < i; j++)
			{
				for(int k = 1; k < j; k++)
				{
					if((one*one + two*two == three*three) && (one%2 != two%2) )
					{
						output += one + " " + two + " " + three;
					}
				}
			}
		}
		return output+"\n";
	}
}