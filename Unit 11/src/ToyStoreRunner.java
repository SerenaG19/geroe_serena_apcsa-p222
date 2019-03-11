//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter toy names :: ");
		String response = keyboard.nextLine();
		Scanner chop = new Scanner(response);
		
		ToyStore test = new ToyStore(); 	//must instantiate first!
		
//		int cnt = 0;
		
		String currentNm = "";
		while(chop.hasNext())
		{
			currentNm = chop.next();
			test.loadToys(currentNm);
			
//			cnt++;
//			System.out.println("runner iterations:: " + cnt);
		}

		test.sortToysByCount();
		
	
	
	}
}