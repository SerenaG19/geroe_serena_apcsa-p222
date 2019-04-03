//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		int spaceInd = 0;
		int ind = 0;
		
		for(int i = 0; i < sentence.length()-1; i++)
		{
			if(sentence.substring(ind).indexOf(" ") == 0)
				
		}
		
	}

	public void sort()
	{
		for(int i = 0; i < wordRay.length-1; i++)
		{
			if(wordRay[i].compareTo(wordRay[i+1]) > 0)
			{
				String temp = wordRay[i];
				wordRay[i] = wordRay[i+1];
				wordRay[i+1] = temp;
			}
		}

	}

	public String toString()
	{
		String output="";
		for (int i = 0; i < wordRay.length; i++)
			output+= wordRay[i] + "\n";
		return output+"\n\n";
	}
}