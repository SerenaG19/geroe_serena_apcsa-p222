//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		//char response;
		
		//add in a do while loop after you get the basics up and running
		//do
		//{	
			String player = "";
		
			System.out.println("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			
			//read in the player value
			player = keyboard.nextLine();
			RockPaperScissors game = new RockPaperScissors(player);
			game.determineWinner();
			
			System.out.println("\n\nDo you want to play again?\n\n");
		//}while(response == 'Y' || response == 'y')
			
			

			
			//out.print("type in your prompt [R,P,S] :: ");
			

			

			
	}
}



