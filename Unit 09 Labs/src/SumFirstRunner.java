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
		test.add(32767);
		
		System.out.println( ListSumFirst.go(test) );
	}
}