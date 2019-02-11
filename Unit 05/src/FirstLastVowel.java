//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Serena Geroe
//Date - 02/11/19


public class FirstLastVowel
{
   public static String go( String a )
	{
	
		String vowels = "AEIOUaeiou";
			
		int pos1 = vowels.indexOf( a.substring(0,1)  );
			
		int pos2 = vowels.indexOf( a.substring(a.length()-1 )  );
		
		if( pos1 > -1)
				return "yes";
		if( pos2 > -1)
			return "yes";
		return "no";
		
//		if( pos1 == 0)
//			return "yes";
//		if( pos2 == a.length()-1)
//			return "yes";
//		return "no";
	}
}