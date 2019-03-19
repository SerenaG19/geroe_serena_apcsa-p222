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
		
		ArrayList<String>myWords = new ArrayList<String>();
		
		//load words into list
		for(int i = 0; i < size; i++)
		{
			String load = file.next();
			myWords.add(load);
		}
		
		//put list into order
		for(int i = 0; i < size-1; i++)
		{
			for(int j = 0; j < size-1; j++)
			{
				
				System.out.println("\ni :: "+i+";\tj :: "+j);
				
				
				if(myWords.get(i).length() > myWords.get(i+1).length())
				{
					String temp = myWords.get(i);
					myWords.set(i, myWords.get(i+1));
					myWords.set(i+1, temp);
					System.out.println("myWords.get(i).length() > myWords.get(i+1).length()");
				}
				
				else if(myWords.get(i).length() < myWords.get(i+1).length())
				{
					i++;
					System.out.println("myWords.get(i).length() < myWords.get(i+1).length()");

				}
				else
				{
					if(myWords.get(i).compareTo(myWords.get(i+1)) > 0)
					{
						String temp = myWords.get(i);
						myWords.set(i, myWords.get(i+1));
						myWords.set(i+1, temp);
					}
					else i++;
				}
		
				System.out.println("myWords.get(i) :: " + myWords.get(i) + "\t myWords.get(i+1) :: " + myWords.get(i+1));
				System.out.println("myWords.get(i).compareTo(myWords.get(i+1)) :: "+myWords.get(i).compareTo(myWords.get(i+1)));				
				System.out.println("Current myWords list :: " + myWords + "\n");
			}
			
		}
	
		for(int n = 0; n < myWords.size(); n++)
		{
			System.out.println(myWords.get(n));
		}

	}
}
