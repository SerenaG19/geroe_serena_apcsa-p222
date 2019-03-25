//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown
	
	private static int getNumDigits(int number)
	{
		if(number < 0)
		return -1;
		else if(number < 10) return number;
		else
		{
			return number % 10;
		}
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int edit = number;
		int cnt = 0;
		while(edit > 0)
		{
			edit /= 10;
			cnt++;
		}
		
		int[] sorted= new int[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			sorted[i] = getNumDigits(number);
			number/=10;
		}
		
		Arrays.sort(sorted);	
		
		return sorted;
	}
}