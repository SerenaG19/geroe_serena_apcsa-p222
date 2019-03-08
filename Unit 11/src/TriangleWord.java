//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
//	public static void printTriangle(String word)
	
	public static String printTriangle(String word)
	{
		String output = "";
		int i = 2;
		do
		{
			for(int j = i - 1; j > 1; j --) output += word.substring(0,i);			
			i++;
		}while(output.length() < word.length() * word.length() );
				
		return output;
	}
}