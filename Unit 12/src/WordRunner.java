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
		Scanner file = new Scanner(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 12\\src\\words.dat")); //COMPUTER AT SCHOOL
//		Scanner file = new Scanner(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 12\\src\\words.dat")); //COMPUTER AT HOME
		// make sure to have two slashes

		int size = file.nextInt();
		file.nextLine();
		
//		ArrayList<Word>myWords = new ArrayList<Word>();
		Word[] myWords = new Word[size];
		
		//load words into list
		for(int i = 0; i < size; i++)
		{
			Word load = new Word(file.next());
			myWords[i] = load;
//			myWords.add(load);
//			System.out.println(i + ":: " +load);
		}
				
		//put list into order
		Arrays.sort(myWords);
		
		//print
		System.out.println(Arrays.toString(myWords));
		
//		for(int h = 0; h < size; h++)
//		{
//			for(int i = 0; i < size - 1; i++)
//			{
//				if(myWords[i].compareTo(myWords[i+1] > 0))
////				if(myWords.get(i).compareTo(myWords.get(i+1)) > 0)
//				{
//					Word temp = myWords[i];
//					myWords[i] = myWords[i+1];
//					myWords[i+1] = temp;
////					Word temp = myWords.get(i);
////					myWords.set(i, myWords.get(i+1));
////					myWords.set(i+1, temp);
//				}
//			}
//		}

		//print
//		for(int n = 0; n < myWords.size(); n++)
//		{
//			System.out.println(myWords.get(n));
//		}

	}
}