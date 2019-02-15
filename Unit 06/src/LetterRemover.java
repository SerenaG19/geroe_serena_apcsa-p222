//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

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
		int loc = sentence.indexOf(lookFor);
		String front = sentence.substring(0,loc);
		String end = sentence.substring(loc+1);
		String cleaned = front+end;
		
		while (loc != -1)
		{
			cleaned = front+end;
			
			loc = cleaned.indexOf(lookFor);
			front = cleaned.substring(0,loc);		
			end = cleaned.substring(loc+1);		
		}
		
		

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}

//char sentArray[] = sentence.toCharArray();
//for(int i = 0; i<sentArray.length; i++)
//{
//	char tryNext = sentArray[i+1];
//	for(int counter = 0; counter < sentArray.length; counter++)
//	{
//		if(sentArray[i] == lookFor && sentArray[i] != sentArray[i+1])
//		{
//			sentArray[i] = tryNext;
//		}
//		else
//		{
//			tryNext = sentArray[i++];
//		}
//	}
//}

//String cleaned = new String(sentArray);

//if(sentArray[i] == lookFor)
//{
//	sentArray[i] = sentArray[i+1];
//}
//System.out.print(sentArray[i]);
////System.out.print("i = " + i);




//if(sentArray[i] == lookFor && sentArray[i+1] != lookFor)
//{
//	sentArray[i] = sentArray[i+1];
//}
//else
//{
//	for(int counter = 0; counter < sentArray.length; counter++)
//	{
//		
//	}
//}