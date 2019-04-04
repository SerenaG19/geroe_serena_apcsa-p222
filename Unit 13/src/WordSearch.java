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
    	m = new String[size][size];
    	int ind = 0;
    	for(int h = 0; h < size; h++)
    	{
    		for(int i = 0; i < size; i++)
    		{
    			m[h][i] = str.substring(ind,ind+1);
    			ind++;
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
    			{
    				return true;
    			}
  
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
    {
		String checkMe="";
		for(int i = c; i < m[r].length; i++)
		{
			checkMe += m[r][i];
		}
		return checkMe.indexOf(w) != -1;

	}

	public boolean checkLeft(String w, int r, int c)
	{
		String checkMe= "";
		for(int i = c; i >= 0; i--)
		{
			checkMe += m[r][i];
		}
		return checkMe.indexOf(w) != -1;

	}

	public boolean checkUp(String w, int r, int c)
	{
		String checkMe= "";
		for(int i = r; i >= 0; i--)	//within each row,
		{
			checkMe += m[i][c];
		}
		return checkMe.indexOf(w) != -1;

	}

	public boolean checkDown(String w, int r, int c)
    {
		String checkMe= "";
		for(int i = r; i < m.length; i++)	//within each row,
		{
			checkMe += m[i][c];
		}
		return checkMe.indexOf(w) != -1;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String checkMe = "";
		int x = c; // columns
		for(int i = r; i >= Math.max(0,r - w.length()); i--)	//within each row,
		{
			checkMe += m[i][x];
			x++;
			if(checkMe.indexOf(w) != -1) return true;
			if(x >= m[i].length) return false;
		}
		return checkMe.indexOf(w) != -1;

	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String checkMe = "";
		int x = c; // columns
		for(int i = r; i >= Math.max(0,r - w.length()); i--)	//within each row,
		{
			checkMe += m[i][x];
			x--;
			if(checkMe.indexOf(w) != -1) return true;
			if(x < 0) return false;
		}
		return checkMe.indexOf(w) != -1;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String checkMe = "";
		int x = c; // columns
		for(int i = r; i < m.length; i++)	//within each row,
		{
			checkMe += m[i][x];
			x--;
			if(checkMe.indexOf(w) != -1) return true;
			if(x < 0) return false;
		}
		return checkMe.indexOf(w) != -1;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String checkMe = "";
		int x = c; // columns
		for(int i = r; i < m.length; i++)	//within each row,
		{
			checkMe += m[i][x];
			x++;
			if(checkMe.indexOf(w) != -1) return true;
			if(x >= m[i].length) return false;
		}
		return checkMe.indexOf(w) != -1;	}

    public String toString()
    {
    	return "";
    }
}
