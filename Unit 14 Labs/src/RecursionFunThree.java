//© A+ Computer Science  -  www.apluscompsci.com
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
		boolean firstTm = true;
		
		if(number > 0) 
		{
//			System.out.println(number);
//			System.out.println((number/10) % 10);
			
			if(firstTm = true)
			{
				firstTm = false;

				if(number % 10 == 3 && number > 10)
					return 1 + luckyThrees(number/10);
				else
					return 0 + luckyThrees(number/10);
			}
//			System.out.println("number > 0");
			
			else if(!firstTm && (number/10) % 10 == 3)
			{
//				System.out.println("number/10 == 3");
				
				return 1 + luckyThrees(number/10);
			}
			else if(!firstTm && (number/10) % 10 != 3)
			{
//				System.out.println("number/10 != 3");
				
				return 0 + luckyThrees(number/10);

			}
		}
			
		return 0;
	}
}