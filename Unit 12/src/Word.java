//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
//	public int getLength()
//	{
//		return word.length();
//	}
	
	public int compareTo( Word rhs )
	{	
		
		
		
		
		
		
		
		
		
		
		
		//		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//		
////		int indWord = 0;
////		int indOther = 0;
//		
//		char[] myWord = new char[word.length()];
//		for(int i = 0; i < word.length(); i++)
//		{
//			myWord[i] = word.charAt(i);
//		}
//		char[] otherRay = new char[rhs.getLength()];
//		for(int i = 0; i < otherRay.length; i++)
//		{
//			String other = (String) rhs;
//			other[i] = rhs.charAt(i);
//		}
//		if(word.length() > rhs.getLength()) return 1;
//		else if(word.length() < rhs.getLength()) return -1;
//		else
//		{
//			
////			for(int i = 0; i < alpha.length; i++)
////			{
////				if(word.charAt(0) == alpha[i]) indWord = i;
////				else if(((CharSequence) rhs).charAt(0) == alpha[i]) indOther = i;
////			}
//		}
		
		return 1;
//		return -1;
//		return 0;
	}

	public String toString()
	{
		return word;
	}
}