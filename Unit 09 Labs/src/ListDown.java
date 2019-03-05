//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	
	
//	
//	
//		FIX THIS --> WHILE LOOP?
//	
//	
//	
//	
	
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		boolean isDec = true;
		for(int i = 0; i < numArray.size()-1; i ++)
		{
			
			if(numArray.get(i) > numArray.get(i+1) == true) isDec = false;
			System.out.println(numArray.get(i) > numArray.get(i+1));
			System.out.println("current: " + numArray.get(i) + " and next: " + numArray.get(i+1) + " and isDec: " + isDec);
		}
		return isDec;
	}	
}