//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer>test;
		test = new ArrayList<Integer>();
		
		int[] loadList = new int[] {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		for(int n = 0; n < loadList.length; n++) test.add(loadList[n]);
		System.out.println(ListOddToEven.go(test));
		
	}
}