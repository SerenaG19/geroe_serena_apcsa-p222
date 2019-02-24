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

	public Triples()
	{
		//setNum(0);
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
		
	public int greatestCommonFactor(int a, int b, int c)
	{
		int max = Math.max(a, Math.max(b, c));
		for(int i = 2; i <= max/2; i++)
		{
			if(a%i ==0 && b%i ==0 && c% i ==0)
			{
				return i;
			}
		}
		
		return 1;		
	}
	
	public String toString()
	{
		String output = "";
		for(int a = 1; a <= number; a ++)
		{
			for(int b = 1; b <= number; b++)
			{
				for(int c = 1; c <= number; c++)
				{
					if((a*a + b*b == c*c) && 
							(a%2 != b%2) && 
							greatestCommonFactor(a,b,c) == 1 && 
							c%2 ==1 && 
							( !output.contains(a+"") || !output.contains(b+"") || !output.contains(c+"")  )	 )
						{
							output += a + " " + b + " " + c + "\n";
						}
				}
			}
		}
		return output+"\n";
	}
	
}