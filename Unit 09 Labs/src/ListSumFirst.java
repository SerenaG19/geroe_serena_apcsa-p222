//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 03/04/19

import java.util.List;
import java.util.ArrayList;


public class ListSumFirst
{
	public static int go(List<Integer>ray)
	{
		ray = new ArrayList<Integer>();
		if(ray.size() == 0) return -1;
		
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
//			System.out.println("first val: " + ray.get(0) + " and val[i]:" + ray.get(i) );
			if(ray.get(i) > ray.get(0)) sum += ray.get(i);		
		}
	
		if(sum == 0) return -1;
		
		return sum;
	}
}