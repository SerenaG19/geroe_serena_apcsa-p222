//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();		//this tells the computer to allocate memory
	}

	public void loadToys( String toyName )
	{
		boolean alreadyHere = false;
		if(toyList.isEmpty())
		{
			Toy load = new Toy(toyName);
			toyList.add(load);
			load.setCount(1);
//			System.out.println("First toy:" + load);
		}
		else
		{
			for(int i = 0; i < toyList.size(); i++)
			{
				if(toyList.get(i).getName().equals(toyName))
				{
					alreadyHere = true;
					int cnt = toyList.get(i).getCount();
					cnt++;
					toyList.get(i).setCount(cnt);
//					System.out.println("i :: " + i + " , toyList.get(i) :: " + toyList.get(i) + "/ vs /" + toyName + " --> alreadyHere? :: " + alreadyHere);
				}
			}
		}
		
		if(alreadyHere == false && toyName != toyList.get(0).getName())
		{
			Toy load = new Toy(toyName);
			toyList.add(load);
			load.setCount(1);
//			System.out.println("LOADING..." + load);
		}
		//see String method split (makes an array)
	}
  	
  	public Toy getThatToy( String nm )
  	{   
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(toyList.get(i).getName().equals(nm))
  			{
  				return toyList.get(i);
  			}
  		}
  		return null;		//acts as an else statement 		
  	} 	
  	
  	public String getMostFrequentToy()
  	{  		
  		String output = "max == ";
  		int maxCnt = toyList.get(0).getCount();			//set max count to count of first object
  		int maxInd = 0;
  		for(int k = 0; k < toyList.size(); k++)			//loop through each toy in toyList
  		{
  			if(toyList.get(k).getCount() > maxCnt)		//Check if that toy has a greater count, then update vars
  			{
  				maxCnt = toyList.get(k).getCount();
  				maxInd = k;
  			}  			
  		}
  		output+= toyList.get(maxInd).getName();
  		
  		for(int n = 0; n < toyList.size(); n++)
  		{
  			if(toyList.get(n).getCount() == maxCnt && toyList.get(n).getName() != toyList.get(maxInd).getName())
  				output += ", " + toyList.get(n).getName();
  		}
  		
  		return output;
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp = new Toy();
  		
		for(int i = 0; i < toyList.size()-1; i++)
		{
			if(toyList.get(i).getCount() > toyList.get(i+1).getCount())
			{
				temp = toyList.get(i);				//Toy at i
				toyList.set(i, toyList.get(i+1));	//make Toy at i = Toy at i+1
				toyList.set(i+1, temp);				//set Toy at i+1 to original Toy at 1
			}
		}  	} 		  	  	  
	public String toString()
	{
		return "" + toyList;
	}
}