//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
 //add constructors   
   public Perfect()
   {
	   number = 0;
   }
   
   public Perfect(int num)
   {
	   setNum(num);
   }

	//add a set method
   public void setNum(int num)
   {
	   number = num;
   }
   
	public boolean isPerfect()
	{
		int counter = 1;
		int sum = 0;
				
		while(counter < number)
		{
			if(number % counter == 0)
			{
				sum += counter;
			}
			counter++;			
		}
		
		if(sum == number)
		{
			return true;
		}
		else
		{
			return false;	
		}
	}

	//add a toString
	public String toString()
	{
		if(isPerfect())
		{
			return number + " is perfect";
		}
		else
		{
			return number + " is not perfect";
		}
		
	}
	
}