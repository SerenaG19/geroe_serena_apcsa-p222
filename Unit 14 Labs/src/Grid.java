import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		int r; // random index		
		for(int i = 0; i < rows; i++)
		{
//			System.out.println("\ni :: "+i);
	
			for(int j = 0; j < cols; j++)
			{
//				System.out.println("j :: "+j);				

				r = (int) (Math.random() * (vals.length));
				
//				System.out.println("r :: " +r);
				
				grid[i][j] = vals[r];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		ArrayList<String> myWords = new ArrayList<String>();
		ArrayList<String> maxWords = new ArrayList<String>();		
		
		String maxWrd = grid[0][0];
		int maxCnt = 0;
		
		for(String[] rows : grid)
		{
			for(String word : rows)
			{
				if(!myWords.contains(word)) myWords.add(word);
			
				if(countVals(word) > maxCnt)
				{
					maxWrd = word;
					maxCnt = countVals(word);
					maxWords.add(word);
				}
				else if(countVals(word) == maxCnt && !maxWords.contains(word)  && maxWords.get(0) != grid[0][0])
				{
					maxWrd += " and " + word;
					maxWords.add(word);
				}
				System.out.println("maxWords :: " + maxWords);
				System.out.println("myWords :: " + myWords);	

			}
				
		}
		
		for(String myWrd : myWords)
			System.out.println("countvals :: " + myWrd + " occurs "+countVals(myWrd) +" times.");

			
		if(maxWords.size() == 1)
		{
			maxWrd += " occur the most.\n\n";
			System.out.println("Multiple max words!");
		}
		else 
		{
			maxWrd += " occurs the most.\n\n";
			System.out.println("One max word!");

		}
		
		return maxWrd;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int cnt = 0;
		for(String[] row : grid)
		{
			for(String word : row)
			{
				if(word.equals(val)) cnt++;
			}
		}
		return cnt;
	}

	//display the grid
	public String toString()
	{
	  	String output = "\n";
    	for(String[] row : grid)
		{
			for(String word: row)
			{
				output+=word+"  ";
			}
			output+="\n";
		}
		return output;
	}
}