//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.ArrayList;
import java.util.List;

/*
 * PROMPT-----------------------
 * Write a program that will search a list to find the first odd number. If an odd number is
 * found, then find the first even number following the odd number. Return the distance between the first odd
 * number and the LAST even number. Return -1 if no odd numbers are found or there are no even numbers
 * following an odd number.
 * ----------------------------
 */

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean hasOdd = false;
		int oddInd = 0;
		int firstOdd = -1;
		while(hasOdd == false && oddInd < ray.size() )
		{
			if(ray.get(oddInd) % 2 == 1)
			{
				firstOdd = ray.get(oddInd);
				hasOdd = true;				
				break;
			}
			oddInd++;
		}
		if(oddInd == ray.size() - 1 && hasOdd == false) return -1;
		
		
		
//		System.out.println("firstOdd: " + firstOdd + " " + oddInd);
		
		
		
		boolean hasEven = false;
		int evenInd = ray.size()-1;
		int lastEven = -1;
		while(hasEven == false && evenInd >= 0 )
		{
			if(ray.get(evenInd) % 2 == 0)
			{
				lastEven = ray.get(evenInd);
				hasEven = true;
				break;
			}
			evenInd--;
		}
		if(evenInd == 0 && hasEven == false) return -1;
		
		
		
//		System.out.println("lastEven: " + lastEven + " " + evenInd);

		
		
		
		
		return evenInd - oddInd;
		
	}
}