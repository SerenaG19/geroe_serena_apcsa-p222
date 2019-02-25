//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/25/19

public class RayOddToEven
{
	public static String go(int[] ray)
	{
		boolean hasOdd = false;
		boolean hasEven = false;
		int oddInd = -1; // maybe try 0
		int evenInd = -1;
		int i = 0;
		
		//int output;
		String output = "";
		
		//look for first odd index
		while(hasOdd == false && i < ray.length)
		{ System.out.println("i in odd while : " + i);
			if(ray[i] % 2 == 1)
			{
				oddInd = i;
				output += oddInd + " : " + ray[i];
				hasOdd = true;
			}
			
			i++;
		}

		//need to reset index, starting at oddInd
		if(oddInd < ray.length)	i = oddInd;
		else i = 0;//return -1 here
		output += " i : " + i + "     "; 
		
		//look for first even index
		System.out.println("i b4 even while" + i + " and oddInd : " + oddInd);
		while(hasEven == false && i < ray.length)
		{System.out.println("i in even while" + i);
			if(ray[i] % 2 == 0)
			{
				//output += " |i in Even while loop : " + i + "|     ";
				evenInd = i;
				output += " " + evenInd + " : " + ray[i];
				hasEven = true;
			}
			
			i++;
		}
		
		if(oddInd == -1) output += "  No odds!"; // make this return -1
		if(evenInd == -1) output += "  No evens!";
		
//		if(oddInd == -1 || evenInd == -1 || evenInd < oddInd) output = -1;
//		else output = evenInd - oddInd;
//			
		
		return output;
	}
}