//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		Perfect test = new Perfect(496);
		test.isPerfect();
		System.out.println(test + "\n");
		
		test.setNum(45);
		System.out.println(test + "\n");
		
		test.setNum(6);
		System.out.println(test + "\n");
		
		test.setNum(14);
		System.out.println(test + "\n");
		
		test.setNum(8128);
		System.out.println(test + "\n");
		
		test.setNum(1245);
		System.out.println(test + "\n");
		
		test.setNum(33);
		System.out.println(test + "\n");
		
		test.setNum(28);
		System.out.println(test + "\n");
		
		test.setNum(27);
		System.out.println(test + "\n");
		
		test.setNum(33550336);
		System.out.println(test + "\n");
		
	}
}