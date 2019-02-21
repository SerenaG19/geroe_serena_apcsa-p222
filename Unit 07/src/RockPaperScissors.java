//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Serena Geroe  

import java.util.Scanner;
import static java.lang.System.*;


//Typical FRQ question, given the runner
public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	//default constructor for user and computer
	public RockPaperScissors()
	{
		playChoice = compChoice = "";
	}

	//Sets user input to given input and compChoice to random choice
	public RockPaperScissors(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice)
		{
		case 0 : compChoice="R";break;
		case 1 : compChoice="P";break;
		case 2 : compChoice="S";break;
		}
		playChoice = player;
	}

//	public void setPlayers(String player)
//	{
//		//assigns person player
//		int num = 10*(int)Math.random();
//	}

	public String determineWinner()
	{
		String winner= "player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
		
		//if Computer wins
		if(compChoice == "P" && playChoice == "R")
			winner += "!Computer wins <<Paper Covers Rock>>!";
		if(compChoice == "R" && playChoice == "S")
			winner += "!Computer wins <<Rock Breaks Scissors>>!";
		if(compChoice == "S" && playChoice == "P" )
			winner = "!Computer wins <<Scissors Cut Paper>>!";
		
		//if user wins
		if(compChoice == "R" && playChoice == "P")
			winner += "!Player wins <<Paper Covers Rock>>!";
		if(compChoice == "S" && playChoice == "R")
			winner += "!Player wins <<Rock Breaks Scissors>>!";
		if(compChoice == "P" && playChoice == "S" )
			winner += "!Player wins <<Scissors Cut Paper>>!";
		
		//if it's a draw
		if(compChoice == playChoice)
			winner += "!Draw Game!";
			
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice;
		return output;
	}
}