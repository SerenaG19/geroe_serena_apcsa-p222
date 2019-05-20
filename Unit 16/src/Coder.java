import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
/**
 * Coder objects s
 * @author Serena
 */


public class Coder
{
	private char coder;
	//index in line
	private int ind;
	
	Coder()
	{
		coder = 'a';
		ind=0;
	}
	
	public Coder(String wrd, int index)
	{
		coder = wrd.charAt(0);
		ind = index;
	}
	
	public int getNum()
	{
		return (int) coder % 10;
	}
	
	public String toString()
	{
		return "coder:: " + coder + " ; ind :: " + ind;
	}
	
}