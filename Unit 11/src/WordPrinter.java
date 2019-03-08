//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	
//	public static void printWord(String word, int times)
	public static String printWord(String word, int times)
	{
		String output = "";
		String[] words = new String[times];
		for(int i = 0; i < times; i++)
		{
			words[i] = word;
			output += words[i] + "\n";
		}
		return output;
	}
}