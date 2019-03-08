//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Arrays;

public class Doggies
{
	//pups is an array of references to Dog objects
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		if(spot < pups.length)	pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		String output = "";
		
		int maxAge = pups[0].getAge();
		for(int i = 0; i < pups.length-1; i++)
		{
			if(pups[i].getAge() < pups[i+1].getAge() )	maxAge = pups[i+1].getAge();
		}
		
		for(int n = 0; n < pups.length; n++)
		{
			if(pups[n].getAge() == maxAge) output += " " + pups[n].getName();
		}
		return output;
	}

	public String getNameOfYoungest()
	{
		String output = "";
		
		int minAge = pups[0].getAge();
		for(int i = 0; i < pups.length-1; i++)
		{
			if(pups[i].getAge() > pups[i+1].getAge() )	minAge = pups[i+1].getAge();
		}
		
		for(int n = 0; n < pups.length; n++)
		{
			if(pups[n].getAge() == minAge) output += " " + pups[n].getName();
		}
		return output;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}