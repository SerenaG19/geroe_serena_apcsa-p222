//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
		static int[] ray;
		static String rayStr;
	
	//make the random array from nums 1-10
	public static int[] makeLucky7Array( int size)
	{
		ray = new int[size];
		int r = (int) (Math.random() * (11)); // to make inclusive of 10
		
		for(int i = 0; i < size; i++)
		{
			 r = (int) (Math.random() * (11));
			 ray[i] = r;
			 
//			 System.out.println("r :: " + r+"; and ray now :: "+Arrays.toString(ray));
		}
		
		return ray;
	}
	
	//Selection sort
	
	public static String shiftEm(int[] makeLucky7Array)
	{
		rayStr = Arrays.toString(ray);

		
		int sevInd = 0;
		int swapInd = 0;
		
		boolean done = false;
		
		for(int i = 0; i < makeLucky7Array.length; i++)
		{
			swapInd = 0;
			sevInd = 0;
			done = false;
			
			if(makeLucky7Array[i] == 7)
			{
				sevInd = i;
				while(!done && swapInd < makeLucky7Array.length)
				{
					if(makeLucky7Array[swapInd] !=  7)
					{
						makeLucky7Array[sevInd] = makeLucky7Array[swapInd];
						makeLucky7Array[swapInd] = 7;
						done = true;
					}
					
					swapInd++;
				}
			}
		}
		
		rayStr += "\n" + Arrays.toString(ray);
		return rayStr;
	}

	
}