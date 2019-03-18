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
//		Scanner file = new Scanner(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 12\\src\\words.dat")); //COMPUTER AT SCHOOL
		Scanner file = new Scanner(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 12\\src\\words.dat")); //COMPUTER AT HOME
		// make sure to have two slashes

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<String>myWords = new ArrayList();
		
		String first = "";
		String second = "";
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < (size+1)/2; j++) // bc loading two words at once
			{
				first = file.next();
				file.nextLine();
				second = file.next();
				file.nextLine();
			
				if(first.compareTo(second) < 0 || first.compareTo(second) == 0)
				{
					myWords.add(Math.abs(size - j),first);
					myWords.add(Math.abs(size - j+1),second);
				}
				else
				{
					myWords.add(Math.abs(,second);
					myWords.add(Math.abs(size - j+1),first);
				}
			
				System.out.println("\nj :: "+j);
				System.out.println("First :: " + first + "\t Second :: " + second);
				System.out.println("first.compareTo(second) :: "+first.compareTo(second));				
				System.out.println("Current myWords list :: " + myWords + "\n");
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
