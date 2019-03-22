//� A+ Computer Science  -  www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/21/19
//Class - APCSA
//Lab  - Lucky Threes

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		if(number >= 1000) // because first digit does not matter
		{
			System.out.println(number/10);

			System.out.println("number >= 1000");
			if(number/10 == 3)
			{
				System.out.println("number/10 == 3");
				return 1 + luckyThrees(number/10);
			}
			else
			{
				System.out.println("number/10 != 3");
				return 0 + luckyThrees(number/10);

			}
		}
			
		return 0;
	}
}