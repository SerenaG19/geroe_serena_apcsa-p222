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
		toyList = toyList;
	}

	public void loadToys( String toyName )
	{
		Toy load = new Toy(toyName);
		toyList.add(load);
	}
  
  	public Toy getThatToy( String nm )
  	{    		
  		Toy getThis = toyList.get(0);
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(toyList.get(i).getName().equals("nm"))
  			{
  				getThis = toyList.get(i);
  			}
  		}
  		return getThis;
  	}
  
  	public String getMostFrequentToy()
  	{
  		ArrayList<Toy>cleaned = new ArrayList<Toy>();
  		
  		String currentNm = toyList.get(0).getName();
  		int cnt = 0;
  		
  		for(int i = 0; i < toyList.size(); i++)						//loop thru all Toys in list
  		{
  			currentNm = toyList.get(i).getName();
  			cnt = 0;												//restart count
  			for(int j = 0; j < toyList.size(); j++)					//loop thru all Toys within first loop
  			{
  				if( currentNm.equals(toyList.get(j).getName()) )	//check if toy at i is the same as the target
  	  			{
  	  				cnt++;
  	  			}
  			}
  			cleaned.add(toyList.get(i));							//add Toy at i to cleaned list
  			cleaned.get(i).setCount(cnt);							//update Toy's count
  		}
  		
  		toyList.clear();
  		for(int n = 0; n < cleaned.size(); n++)						//update toyList to cleaned list
  		{
  			toyList.add(cleaned.get(n));
  		}
  		
  		int maxCnt = toyList.get(0).getCount();						//NOW loop thru to find most frequent
  		int maxInd = 0;
  		for(int k = 0; k < toyList.size(); k++)
  		{
  			if(toyList.get(k).getCount() > maxCnt)
  			{
  				maxCnt = toyList.get(k).getCount();
  				maxInd = k;
  			}  			
  		}
  		
  		return "max == " + toyList.get(maxInd).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp = new Toy();
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(toyList.get(i).getCount() > toyList.get(i+1).getCount() )
  			{
  				temp = toyList.get(i);
  				toyList.set(i, toyList.get(i+1));
  				toyList.set(i+1, temp);
  			}
  		}
  	}  
  	  
	public String toString()
	{
		String output = "[";
		for(int i = 0; i<toyList.size();i++) output += toyList.get(i).getName() + " " + toyList.get(i).getCount() + ", ";
		output+="]";
		return output;
	}
}