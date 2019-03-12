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
		boolean alreadyHere = false;								//this will check that the Toy has not already been added to the cleaned List later on

  		String currentNm = toyList.get(0).getName();  		
  		int cnt = 0;
  		
  		for(int i = 0; i < toyList.size(); i++)						//loop thru all Toys in list
  		{
//  			System.out.println("loop sort ind :: " + i + "; sort, CURRENTNAME :: " + currentNm);
  			
  			currentNm = toyList.get(i).getName();
  			cnt = 0;												//restart count
  			alreadyHere = false;									//reset alreadyHere
  			for(int j = 0; j < toyList.size(); j++)					//loop thru all Toys within first loop to update count
  			{
  				if( currentNm.equals(toyList.get(j).getName()) )	//check if toy at i has same name as target
  	  			{
  					cnt++;
  	  			}
  			}
  			
  			
  			for(int n = 0; n < i; n ++)
  			{
//  				System.out.println("n :: " + n + " ; toyList.get(n) :: " + toyList.get(n) + " ; alreadyHere :: " + alreadyHere);
  				
  				if(toyList.get(n).getName().equals(currentNm))
  				{
  					alreadyHere = true;								//check that this Toy has not been added yet to cleaned
//  					System.out.print("  Here!");
  				}
  			}
  			
  			if(alreadyHere == false)
  			{
  				
  				System.out.println("toyList.get(i) :: " + toyList.get(i));
  				cleaned.add(toyList.get(i));						//add Toy at i to cleaned list
  	  			cleaned.get(i).setCount(cnt);						//update Toy's count
  			}
  		}
  		
  		toyList.clear();
  		for(int n = 0; n < cleaned.size(); n++)						//update toyList to cleaned list
  		{
  			toyList.add(cleaned.get(n));
  		}
  		
  		
  		
  		
  		
  		//TO DO: FIX CLEANED METHOD, IMPLEMENT SWAP BASED ON COUNT, THEN DO RATIONAL LAB
  		
  		
  		
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
  	}  
  	  
	public String toString()
	{
		return "" + toyList;
	}
}