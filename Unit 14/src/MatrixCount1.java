//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    							{ 6, 7, 8, 9, 0},
    							{ 6, 7, 1, 2, 5},
    							{ 6, 7, 8, 9, 0},
 								{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
		//add code
		int cnt = 0;
		for(int[] row : m)
		{
			for(int num : row)
			{
				if(num == val) cnt++;
			}
		}
		return cnt;
    }
    
    public static String printM()
    {
    	String output = "Matrix values\n";
		for(int[] row : m)
		{
			for(int num : row)
			{
				output+=num+"  ";
			}
			output+="\n";
		}
		return output;
    }
}
