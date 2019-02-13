//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 	
		int pairNum = 0;

			for(int count = 1; count <= str.length()-1; count++)
			{
				
				if( str.substring(count-1,count).equals( str.substring(count,count+1) ) )
				{
					pairNum++;

				}

			}
			return pairNum;
		
	}
}

//for(char lookPairs : str.toCharArray() )
//{			
//	out.println(lookPairs);
//}