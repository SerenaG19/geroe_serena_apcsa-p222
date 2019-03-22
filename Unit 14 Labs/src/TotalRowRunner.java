//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here			
		int[][] test1 = new int[][] {{1,2,3},{5,5,5,5}};
		System.out.println( "Row total are :: "+ TotalRow.getRowTotals(test1));
		
		int[][] test2 = new int[][] {{1,2,3},{5},{1},{2,2}};
		System.out.println( "Row total are :: "+ TotalRow.getRowTotals(test2));
		
		int[][] test3 = new int[][] {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println( "Row total are :: "+ TotalRow.getRowTotals(test3));
	}
}

//
//{{1,2,3},{5,5,5,5}}
//{{1,2,3},{5},{1},{2,2}};
//{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
