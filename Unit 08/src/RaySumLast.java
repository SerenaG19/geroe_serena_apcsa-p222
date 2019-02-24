//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe
//Date - 02/24/19

public class RaySumLast
{	
	private int array[];
	
	public RaySumLast()
	{
		
	}
	
	public RaySumLast(int[] ray)
	{
		
	}
	
	public void setRay(int[] ray)
	{
		for(int i = 0; i < ray.length; i++)
		{
			array[i] = ray[i];
		}
	}

	public static int go(int[] ray)
	{
		if(ray.length == 0 )
		{
			return -1;
		}
		
		int last = ray[ray.length-1];
		int sum = 0;
		
		for(int i=0; i < ray.length-1; i++)
		{
			if( ray[i] > last )
				sum = sum+ray[i];
		}
		if(sum == 0)
			return -1;
		return sum;
	}
	
	public String toString()
	{
		String output = "";
		return output;
	}
}