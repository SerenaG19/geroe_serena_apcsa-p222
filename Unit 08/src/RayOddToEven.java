//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/25/19

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		boolean hasOdd = false;
		boolean hasEven = false;
		int oddInd = -1;
		int evenInd = -1;
		int i = 0;
		int output;
		
		//look for first odd index
		while(hasOdd == false && i < ray.length)
		{
			if(ray[i] % 2 == 1)
			{
				oddInd = i;
				hasOdd = true;
			}
			
			i++;
		}

		//need to reset index, starting at oddInd
		if(oddInd < ray.length && oddInd != -1)	i = oddInd;
		else i = 0;
		
		//look for first even index
		while(hasEven == false && i < ray.length)
		{
			if(ray[i] % 2 == 0)
			{
				evenInd = i;
				hasEven = true;
			}
			
			i++;
		}
		
		if(oddInd == -1 || evenInd == -1 || evenInd < oddInd) output = -1;
		else output = evenInd - oddInd;
			
		
		return output;
	}
}