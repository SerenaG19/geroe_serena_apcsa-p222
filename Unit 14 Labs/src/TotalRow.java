//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> rowSums = new ArrayList<Integer>();
    	int sum = 0;
    	for(int i = 0; i < m.length; i++)
    	{
    		sum = 0;
    		
//    		System.out.println("\ni :: " +i);
    		
    		for(int j = 0; j < m[i].length; j++)
    		{
//    			System.out.println("sum before :: "+sum);
    			
    			sum+=m[i][j];
    			
//    			System.out.println("sum after :: "+sum);
    		}
    		rowSums.add(i,sum);
//			System.out.println("rowSums list :: "+rowSums);

    	}
		return rowSums;
    }
}
