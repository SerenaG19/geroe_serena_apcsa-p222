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
   
	public boolean isPerfect()//REDO AND USE DO AND WHILE LOOPS
	{
		int arCount = 0;
		int[] divisor= {arCount};
		int sum=0;
		for(int i = 2; i < number/2; i++)
		{
			if(number % i == 0)
			{
				divisor[arCount] = i;
				System.out.println("divisor[" + arCount + "] = " + divisor[arCount] + " and i = " + i);
				arCount++;
			}
			
		}
		for(int counter = 0; counter < divisor.length; counter++)
		{
			sum =+ divisor[counter];
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