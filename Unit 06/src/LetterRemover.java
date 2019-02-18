//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence, cleaned;
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
		String front = "";
		int loc = sentence.indexOf(lookFor);
		if(loc > 0)
		{
			front = sentence.substring(0,loc);
		}
		String end = sentence.substring(loc+1);
		cleaned = front+end;
		
		while (loc != -1)
		{
			
			cleaned = front+end;
			loc = cleaned.indexOf(lookFor);
			if(loc > 0)
				front = cleaned.substring(0,loc);		
			end = cleaned.substring(loc+1);		
		}
		
		return cleaned;
	}

	public String toString()
	{
		return "\"" + sentence + "\" - letter to remove \"" + lookFor + "\" = \'" + cleaned + "\'";
	}
}