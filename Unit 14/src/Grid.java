//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
//		grid = new String[rows][cols];
//		int r = 0; // random index
//		
//		for(int i = rows-1; i >= 0; i--)
//		{
//			for(int j = cols-1; j >= 0; j--)
//			{
//				r = (int) (Math.random() * (j+1));
//				grid[i][j] = vals[r];
//				
//				vals[r] = vals[j];
//			}
//		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
//		int max = 0;
//		int cnt = 0;
//		int ind = 0;
//		String mostFreqStr = vals[0];
//		
//		for(String[] row : grid)
//		{
//			for(String word : row)
//			{
//				for(String innerWrd : row)
//				{
//					if(innerWrd.equals(vals[ind]))
//					{
//						cnt++;
//					}
//				}
//				if(cnt > max) max = cnt;
//				mostFreqStr = vals[ind];
//				ind++;
//			}
//		}
//		return mostFreqStr;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{


	//display the grid
	public String toString()
	{
//		String output="";
//		for(String[] row : grid)
//		{
//			for(String word : row)
//			{
//				output+= word + " ";
//			}
//			output+="\n";
//		}
//		return output;
	}
}