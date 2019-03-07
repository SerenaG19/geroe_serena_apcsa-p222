//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SumFirstRunner
{
	public static void main( String args[] )
	{						
		ArrayList<Integer>test;
		test = new ArrayList<Integer>();

		int[] loadTest = new int[] {-99,1,2,3,4,5,6,7,8,9,10,5};
		for(int i = 0; i < loadTest.length; i++) test.add(loadTest[i]);		
			
//		System.out.println(test);
		System.out.println( ListSumFirst.go(test) );
	}
}