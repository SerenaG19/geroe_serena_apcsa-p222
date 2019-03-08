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
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest1 = new int[] {10,9,8,7,6,5,4,3,2,1,-99};
		for(int i = 0; i < loadTest1.length; i++) test.add(loadTest1[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest2 = new int[] {0,20,30,40,50,-11818,40,30,20,10};
		for(int i = 0; i < loadTest2.length; i++) test.add(loadTest2[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest3 = new int[] {32767};
		for(int i = 0; i < loadTest3.length; i++) test.add(loadTest3[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest4 = new int[] {255,255};
		for(int i = 0; i < loadTest4.length; i++) test.add(loadTest4[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest5 = new int[] {9,10,-88,100,-555,2};
		for(int i = 0; i < loadTest5.length; i++) test.add(loadTest5[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest6 = new int[] {10,10,10,11,456};
		for(int i = 0; i < loadTest6.length; i++) test.add(loadTest6[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
	
		int[] loadTest7 = new int[] {-111,1,2,3,9,11,20,1};
		for(int i = 0; i < loadTest7.length; i++) test.add(loadTest7[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest8 = new int[] {9,8,7,6,5,4,3,2,0,-2,6};
		for(int i = 0; i < loadTest8.length; i++) test.add(loadTest8[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest9 = new int[] {12,15,18,21,23,1000};
		for(int i = 0; i < loadTest9.length; i++) test.add(loadTest9[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest10 = new int[] {250,19,17,15,13,11,10,9,6,3,2,1,0};
		for(int i = 0; i < loadTest10.length; i++) test.add(loadTest10[i]);		
			
		System.out.println( ListSumFirst.go(test) );
		
		test.clear();
		
		int[] loadTest11 = new int[] {9,10,-8,10000,-5000,-3000};
		for(int i = 0; i < loadTest11.length; i++) test.add(loadTest11[i]);		
			
		System.out.println( ListSumFirst.go(test) );		
	}
}