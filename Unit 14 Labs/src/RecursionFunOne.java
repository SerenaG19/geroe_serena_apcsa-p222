//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class RecursionFunOne

/*if ( num is greater than zero )
 * 	if the digit is even
 * 		return 1 plus a call with remaining digits
 * 	return 0 plus a call with remaining digits
 */
{			//should really be countEVENDigits, but functions as such
	public static int countOddDigits(int num)
	{
//		System.out.println("num :: "+num);
		if(num > 0)
		{
//			System.out.println("num > 0");
			if(num % 2 == 0)
			{
//				System.out.println("\nnum % 2 == 0; next :: ");
//				System.out.print(num/10);
				return 1 + countOddDigits(num/10);
			}
//			System.out.println("\nnum % 2 == 1; next :: ");
//			System.out.print(num/10);
			return 0 + countOddDigits(num/10);
		}
		else return 0;
	}
}