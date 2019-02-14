//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class TriangleOne // Decreasing Word lab
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

//	public void print( )
//	{
//		
//	}
	
	public String toString()
	{
		String finalProd="";
		
		for(int i = 0; i<word.length(); i++)
		{
			finalProd += word.substring(0, word.length()-i) + "\n";
		}
		
		return finalProd;
	}
}