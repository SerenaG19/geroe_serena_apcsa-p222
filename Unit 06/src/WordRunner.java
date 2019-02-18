//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
//		add test cases
		Word test = new Word("Hello");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		System.out.println(test + "\n\n");
		
		
		test.setString("World");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		System.out.println(test + "\n\n");
		
		test.setString("Jukebox");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		System.out.println(test + "\n\n");
		
		test.setString("TCEA");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		System.out.println(test + "\n\n");
		
		test.setString("UIL");
		test.getFirstChar();
		test.getLastChar();
		test.getBackWards();
		System.out.println(test);

	}
}