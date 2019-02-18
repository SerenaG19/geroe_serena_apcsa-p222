//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class Word
{
	private String word, reverse;
	private char front, back;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		front = word.charAt(0);
		return front;
	}

	public char getLastChar()
	{
		back = word.charAt(word.length()-1);
		return back;
	}

	public String getBackWards()
	{
		reverse="";
		for(int i = word.length()-1; i >= 0; i--)
		{
			reverse += word.charAt(i);
		}
		return reverse;
	}

 	public String toString()
 	{
 		return String.valueOf(front) + "\n" + String.valueOf(back) + "\n" + reverse + "\n" + word;
	}
}