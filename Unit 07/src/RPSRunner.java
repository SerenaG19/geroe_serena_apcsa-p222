//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = ' ';
		
		RockPaperScissors game = new RockPaperScissors();
		
		//add in a do while loop after you get the basics up and running
		do
		{	
			System.out.println("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			String player = "";
			//read in the player value
			player = keyboard.nextLine().toUpperCase();
			game.setPlayers(player);
			System.out.println(game.determineWinner() );
			
			System.out.println("\n\nDo you want to play again?\n\n");
			response = keyboard.nextLine().charAt(0);
			
			System.out.println("\n\n");
			
		}while(response == 'Y' || response == 'y');
			
			

			
			//out.print("type in your prompt [R,P,S] :: ");
			

			

			
	}
}



