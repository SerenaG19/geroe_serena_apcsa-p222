//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DownRunner
{
	public static void main( String args[] )
	{											
		ArrayList<Integer>test;
		test = new ArrayList<Integer>();
		
		int[] loadList = new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345};
		for(int n = 0; n < loadList.length; n++) test.add(loadList[n]);
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList1 = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		for(int n = 0; n < loadList1.length; n++) test.add(loadList1[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList2 = new int[] {10,20,30,40,50,-11818,40,30,20,10};
		for(int n = 0; n < loadList2.length; n++) test.add(loadList2[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList3 = new int[] {32767};
		for(int n = 0; n < loadList3.length; n++) test.add(loadList3[n]);		
		System.out.println(ListDown.go(test));
				
		test.clear();
		
		int[] loadList4 = new int[] {255,255};
		for(int n = 0; n < loadList4.length; n++) test.add(loadList4[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList5 = new int[] {9,10,-88,100,-555,1000};
		for(int n = 0; n < loadList5.length; n++) test.add(loadList5[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList6 = new int[] {10,10,10,11,456};
		for(int n = 0; n < loadList6.length; n++) test.add(loadList6[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList7 = new int[] {-111,1,2,3,9,11,20,30};
		for(int n = 0; n < loadList7.length; n++) test.add(loadList7[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList8 = new int[] {9,8,7,6,5,4,3,2,0,-2,-989};
		for(int n = 0; n < loadList8.length; n++) test.add(loadList8[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList9 = new int[] {12,15,18,21,23,1000};
		for(int n = 0; n < loadList9.length; n++) test.add(loadList9[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList10 = new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		for(int n = 0; n < loadList10.length; n++) test.add(loadList10[n]);		
		System.out.println(ListDown.go(test));
		
		test.clear();
		
		int[] loadList11 = new int[] {9,10,-8,10000,-5000,1000};
		for(int n = 0; n < loadList11.length; n++) test.add(loadList11[n]);		
		System.out.println(ListDown.go(test));
	}
}