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
    	for(int r = 0; r < m.length; r++)
    		for(int c = 0; c < m[r].length; c++)
    			if( checkRight(word,r,c) || checkLeft(word,r,c) ||checkUp(word,r,c) ||
    				checkDown(word,r,c) || checkDiagUpRight(word,r,c) || checkDiagUpLeft(word,r,c) ||
    				checkDiagDownLeft(word,r,c) || checkDiagDownRight(word,r,c) )
						return true;
  
    	return false;
    }

    /*
     * This checking method may be faulty. Instead, you could try to check if first letters are
     * the same, then the next, until you reach the end of the String.
     */
    
    
    
	public boolean checkRight(String w, int r, int c)
    {
		String checkMe;
		if(w.length() > m[r].length-c) return false;
		for(int i = c; i < m[r].length; i++)
		{
			checkMe = "";
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
		String checkMe;
		if(w.length() > m[r].length-c) return false;
		for(int i = c; i > 0; i--)
		{
			checkMe = "";
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
		String checkMe;
		if(w.length() > m.length-r) return false;
		for(int i = r; i > 0; i--)	//within each row,
		{
			checkMe = "";
			for(int j = r; j < w.length(); j--)
			{
				if(j < 0) return false;
				checkMe += m[j][c];
				if(checkMe.equals(w)) return true;
			}
			
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
    {
		String checkMe;
		if(w.length() > m.length-r) return false;
		for(int i = r; i < m.length; i++)	//within each row,
		{
			checkMe = "";
			
			for(int j = r; j < w.length(); j++)
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
