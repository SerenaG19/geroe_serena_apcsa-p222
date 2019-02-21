//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/21/19

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		boolean hasOdd = false;
		int oddInd = -1;
		int evenInd = -1;
		
		for(int i = 0; i < ray.length; i++)
		{
			if(ray[i] % 2 == 1) hasOdd = true; oddInd = i;
			if(ray[i] % 2 == 0 && i > oddInd) evenInd = i; i = ray.length-1;
		}
		
		if()
		return -1;
	}
}