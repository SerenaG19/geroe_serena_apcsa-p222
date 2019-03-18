//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 12\\src\\words.dat")); 
		// make sure to have two slashes

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<String>myWords = new ArrayList();
		
		
//		for(int i = 0; i < size-1; i++)
		{
			for(int j = 0; j < size; j++)
			{
				String first = new String(file.next());
				file.nextLine();
				String second = new String(file.next());
				file.nextLine();
				
				if(first.compareTo(second) == 1 || first.compareTo(second) == 0)
				{
					myWords.add(j,first);
					myWords.add(j+1,second);
				}
				else
				{
					myWords.add(j,second);
					myWords.add(j+1,first);
				}
			}
		}
		
		for(int n = 0; n < myWords.size(); n++)
		{
			System.out.println(myWords.get(n));
		}

	}
}











////Comparable[] myWords = new Comparable[size];
//
//ArrayList<Comparable>myWords = new ArrayList<Comparable>();
//
//for(int i = 0; i < size; i++)
//{
////	myWords[i] = file.next();
//	myWords.add(file.next());
//	file.nextLine();
//}
//
////Arrays.sort(myWords);
////System.out.println(Arrays.toString(myWords));
//
//
//Collections.sort(myWords);
//System.out.println(myWords);
