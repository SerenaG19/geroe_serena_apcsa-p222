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
		
		test.clear();

		int[] loadList1 = new int[] {11,9,8,7,6,5,4,3,2,1,-99,7};
		for(int n = 0; n < loadList1.length; n++) test.add(loadList1[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList2 = new int[] {10,20,30,40,5,41,31,20,11,7};
		for(int n = 0; n < loadList2.length; n++) test.add(loadList2[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList3 = new int[] {32767,70,4,5,6,7};
		for(int n = 0; n < loadList3.length; n++) test.add(loadList3[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList4 = new int[] {2,7,11,21,5,7};
		for(int n = 0; n < loadList4.length; n++) test.add(loadList4[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList5 = new int[] {7,255,11,255,100,3,2};
		for(int n = 0; n < loadList5.length; n++) test.add(loadList5[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList6 = new int[] {9,11,11,11,7,1000,3};
		for(int n = 0; n < loadList6.length; n++) test.add(loadList6[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList7 = new int[] {7,7,7,11,2,7,7,11,11,2};
		for(int n = 0; n < loadList7.length; n++) test.add(loadList7[n]);
		System.out.println(ListOddToEven.go(test));
		
		test.clear();
		
		int[] loadList8 = new int[] {2,4,6,8,8};
		for(int n = 0; n < loadList8.length; n++) test.add(loadList8[n]);
		System.out.println(ListOddToEven.go(test));
	}
}