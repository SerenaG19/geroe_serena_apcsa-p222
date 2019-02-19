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
		int div = number;
		int counter = 0;
		//sum starts as 1 bc all numbers are divisible by 2 
		int sum = 1;
		
		//now check if number is divisible by two
		if(number % 2 == 0)
		{
			sum =+2;
		}
		
		while(counter <= number/2)
		{
			if(div % 2 == 0)
			{
				div = number / 2;
				sum =+ div;
			}
			counter++;
		}
		
		sum *= 2;
		
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