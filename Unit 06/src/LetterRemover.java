//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover(sentence, lookFor);
	}

	//add in second constructor
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		char sentArray[] = sentence.toCharArray();
		for(int i = 0; i<sentArray.length; i++)
		{
			if(sentArray[i] == lookFor)
			{
				sentArray[i] = sentArray[i+1];
			}
			System.out.print(sentArray[i]);
			//System.out.print("i = " + i);
		}
	
		String cleaned = new String(sentArray);
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + " = ";
	}
}