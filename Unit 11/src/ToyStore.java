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
		Toy load = new Toy(toyName);
		toyList.add(load);
		
		//see String method split (makes an array)
	}
  	
  	public Toy getThatToy( String nm )
  	{   
  		int cnt = 0;
  		int toyInd = 0;
  		
  		for(int i = 0; i < toyList.size(); i++)
  		{
  			if(toyList.get(i).getName().equals(nm))
  			{
  				toyInd = i;
  				cnt++;
  			}
  		}
  		
  		toyList.get(toyInd).setCount(cnt);
  		return toyList.get(toyInd);  		
  	}
  
  	
  	
  	public String getMostFrequentToy()
  	{  		
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
  		
  		return "max == " + toyList.get(maxInd).getName();
  	}  
  
  	
  	
  	public void sortToysByCount()
  	{
		ArrayList<Toy>cleaned = new ArrayList<Toy>();				//this List will hold the updated and cleaned Toys
//  		boolean alreadyHere = false;								//this will later check if the Toy has already been added to the list
		String currentNm = toyList.get(0).getName();  		
  		int cnt = 0;
  		
  		for(int i = 0; i < toyList.size(); i++)						//loop thru all Toys in list
  		{ 			
  			currentNm = toyList.get(i).getName();
  			cnt = 0;												//restart count
  			
  			for(int j = 0; j < toyList.size(); j++)					//loop thru all Toys within first loop to update count
  			{
  				if( currentNm.equals(toyList.get(j).getName()) )	//check if toy at i has same name as target
  	  			{
  					cnt++;											//update Toy's count
  	  			}
  			}
  			toyList.get(i).setCount(cnt);							//set new count to count in actual list
   		}
  		
  		for(int outer = 0; outer < toyList.size(); outer++)						//update toyList to cleaned list
  		{
  			for(int inner = 0; inner < toyList.size(); inner++)
  			{
//  				if( toyList.get(outer).getName().equals( toyList.get(inner).getName() ) )
//  	  			{
//  	  				alreadyHere = true;
//  	  			}
  				if( !toyList.get(outer).getName().equals( toyList.get(inner).getName() ) )
  				{
  					cleaned.add(toyList.get(inner));
  				}
  			}
  		}

  		toyList.clear();
  		for(int n = 0; n < cleaned.size(); n++)						//update toyList to cleaned list
  		{
  			toyList.add(cleaned.get(n));
  		}   } 		  		
  		
  		
  		
  		//TO DO: FIX CLEANED METHOD (LOOPS), IMPLEMENT SWAP BASED ON COUNT, THEN DO RATIONAL LAB
  		
  		
  		
//  		Toy temp = new Toy();
//
//  		
//  		//IMPLEMENT SWAP...
//  		int currentCnt = 0;
//  		
//  		for(int i = 0; i < toyList.size(); i++)		//for each element in toyList
//  		{
//  			for(int j = 1; j < toyList.size(); j++)
//  			{
//  				if(toyList.get(i).getName().equals(toyList.get(j)) )
//  	  			{
//  	  				currentCnt++;
//  	  			}
//  			}
//  			
//  		}
//  		

//----------ATTEMPT ONE*****************************************************************************
//			System.out.println("toyList.size() = " + toyList.size());
//  		for(int i = 0; i < toyList.size(); i++)
//  		{
//  			
//  			System.out.println("toyList.get(i).getCount() = " + toyList.get(i).getCount());
//  			System.out.println("i:: " + i);
//  			
//  			if(toyList.get(i).getCount() > toyList.get(i+1).getCount() )
//  			{
//  				temp = toyList.get(i);
//  				toyList.set(i, toyList.get(i+1));
//  				toyList.set(i+1, temp);
//  			}
//  		}
//----------ATTEMPT ONE***************************************************************************** 		
    
  	  
	public String toString()
	{
		return "" + toyList;
	}
}