//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/25/19

/*Prompt:
 * Write a program that will go through an array to see if the numbers are decreasing.
 * You must combine variables, ifs, and a loop to create a working method. There will always be at least one
 * item in the array. Each prior number has to be greater than the following number for the array to be
 * considered going down. 
 */

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	

	
	public static boolean go(int[] numArray)
	{	
		boolean dec = true;
//		for(int i = 0; i < numArray.length-1; i++)
//		{
//			if(numArray[i] > numArray[i+1]) dec = true;
//			System.out.println(numArray[i] + "i: " + i + " . dec : " + dec);
//		}
		
		int i = 0;
		while(dec == true && i < numArray.length-1)
		{
			if(numArray[i] < numArray[i+1]) dec = false;
			if(numArray[i] == numArray[i+1]) dec = false;
			//System.out.println(numArray[i] + "i: " + i + " . dec : " + dec);
			i++;
		}
		if(i != numArray.length-1) dec = false;
		return dec;
	}	
}