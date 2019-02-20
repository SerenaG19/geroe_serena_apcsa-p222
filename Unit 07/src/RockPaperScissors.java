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

	public RockPaperScissors()
	{
		playChoice = compChoice = "";
	}

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

	public void setPlayers(String player)
	{
		//assigns person player
		int num = 10*(int)Math.random();
		
	}

	public String determineWinner()
	{
		String winner="";
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}