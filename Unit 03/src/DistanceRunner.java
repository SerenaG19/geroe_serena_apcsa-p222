//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		
		//Distance myDistance2 = new Distance(1,2,3,4);
		
		//create default object
		Distance myDistance = new Distance();

		//test case1 
		myDistance.setCoordinates(5, 6, 7, 8);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());
		
		//test case2
		myDistance.setCoordinates(2,7,10,2);
		myDistance.calcDistance();
		System.out.println("My distance is: " + myDistance.getDistance());
		
		
		//test case3
		myDistance.setCoordinates(10,40,3,2);
		myDistance.calcDistance();
		System.out.println(myDistance);
		
		
	}
}