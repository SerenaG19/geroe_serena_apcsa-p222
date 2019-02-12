/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		/*.indexOf(int ch) returns index of specified character
		 * .indexOf(int ch, int fromIndex() returns index of specified character
		 * starting from fromIndex 
		 */
		
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method. Returns -1 if not found
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		
		int pos = sample.indexOf("slow");
		if(pos != -1)
		{
			System.out.println("slow\" is found at position " + pos);
		}		
		else
		{
			System.out.println("\"slow\" is not found");

		}
		
	}

}
