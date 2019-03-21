//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] loadMe = new String[] {"a","e","i","o"};
		Grid nittyGriddy = new Grid(5,5,loadMe);
		
//		System.out.println(nittyGriddy);
		System.out.println(nittyGriddy.findMax(loadMe) + nittyGriddy);
	}
}