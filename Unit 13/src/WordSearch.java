//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int row = 0;
    	for(int h = 0; h < size; h++)
    	{
    		if(h == size) row++;
    		for(int i = 0; i < size; i++)
    		{
    			m[row][i] = str;
    		}
    	}
    }

    public boolean isFound( String word )
    {
//    	for(String[] row : m)
//    	{
//    		for(String wrd : row)
//    		{
//    			if(wrd.equals(word)) return true;
//    		}
//    	}
//    	return false;
    }

    /*
     * This checking method is faulty. Instead, check if first letters are
     * the same, then the next, until you reach the end of the String.
     */
    
    
    
	public boolean checkRight(String w, int r, int c)
    {
		String checkMe = "";
		if(m[r].length - w.length() <= 0) return false;
//		for(int i = c; i < m[r].length - w.length(); i++)
		for(int i = c; i < m[r].length; i++)
		{
			for(int j = 0; j < w.length(); j++)
			{
				checkMe += m[r][j];
			}
			if(checkMe.equals(w)) return true;
				
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String checkMe = "";
		for(int i = c; i > 0; i--)
		{
			for(int j = c; j < w.length(); j--)
			{
				if(j < 0) return false;
				checkMe += m[r][j];
			}
			if(checkMe.equals(w)) return true;
				
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String checkMe = "";
		for(int i = r; i > 0; i--)	//within each row,
		{
			checkMe += m[i][c];
			if(checkMe.equals(w)) return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
    {
		String checkMe = "";
		for(int i = r; i < m.length; i++)	//within each row,
		{
			checkMe += m[i][c];
			if(checkMe.equals(w)) return true;
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String checkMe = "";
		for(int i = r; i > 0; i++)	//within each row,
		{
			if(c > m[i].length)return false; 
			checkMe += m[i][c++];
			if(checkMe.contains(w)) return true;
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
