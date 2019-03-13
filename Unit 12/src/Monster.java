//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*; 

public interface Monster
{
	//On quiz, don't forget to implement ALL methods listed in interface
	public int getHowBig();
	public String getName();
	public boolean isBigger(Monster other);	
	public boolean isSmaller(Monster other);
	public boolean namesTheSame(Monster other);
}