//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/11/19
//Class - APCSA
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
		wordOne = "";
		wordTwo = "";
		compare = 0;
	}

	public WordsCompare(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void compare()
	{
		wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		if( wordOne.compareTo(wordTwo) < 0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}