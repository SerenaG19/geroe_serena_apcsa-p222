//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases

		System.out.println( NumberShifter.shiftEm(  NumberShifter.makeLucky7Array(20) ) +"\n");
		
		System.out.println( NumberShifter.shiftEm(  NumberShifter.makeLucky7Array(3) ) +"\n");

		System.out.println( NumberShifter.shiftEm(  NumberShifter.makeLucky7Array(37) ) +"\n");

		System.out.println( NumberShifter.shiftEm(  NumberShifter.makeLucky7Array(19) ) +"\n");

		System.out.println( NumberShifter.shiftEm(  NumberShifter.makeLucky7Array(24) ) );

	}
}



