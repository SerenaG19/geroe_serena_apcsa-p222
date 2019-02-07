//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/06/19
//Class - APCSA
//Lab  - Distance Formula

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		
		//This is another way to test different cases		
		//Distance myDistance2 = new Distance(1,2,3,4);
		
		//create default object; all tests cases below use this object
		Distance myDistance = new Distance();

		//test case1 
		myDistance.setCoordinates(5, 6, 7, 8);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());
		
		//test case2
		myDistance.setCoordinates(2,7,10,2);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());
		
		
		//test case3; this inputs the myDistance object instead of printing as above;
		//the system looks for the toString() method
		myDistance.setCoordinates(10,40,3,2);
		myDistance.calcDistance();
		System.out.println(myDistance);
		
		//test case4
		myDistance.setCoordinates(1,1,2,1);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());
		
		//test case5
		myDistance.setCoordinates(1,1,-2,2);
		myDistance.calcDistance();																																																														
		System.out.println("My distance is: " + myDistance.getDistance());	
		
		//test case6
		myDistance.setCoordinates(1,1,0,0);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());		
		
	}
}