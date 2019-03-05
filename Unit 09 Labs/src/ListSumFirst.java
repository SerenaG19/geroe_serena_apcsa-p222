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
		
		int count = 0;
		for(int i = 0; i < ray.size(); i++)
			if(ray.get(i) > ray.get(0)) count += ray.get(i);

		if(count == 0) return -1;
		
		return count;
	}
}