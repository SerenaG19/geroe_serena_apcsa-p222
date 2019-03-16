//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Comparable[] myWords = new Comparable[size];
		for(int i = 0; i < size; i++)
		{
			myWords[i] = file.next();
			file.nextLine();
		}
		
		Arrays.sort(myWords);
		System.out.println(Arrays.toString(myWords));
		











	}
}