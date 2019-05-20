import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
/**
 * Coder objects 
 * @author Serena
 */


public class Coder
{
	private char coder;
	//index in line
	private int ind;
	private int lineNum;
	
	Coder()
	{
		coder = 'a';
		ind=lineNum=0;
	}
	
	public void setCoder(String wrd, int index, int lN)
	{
		coder = wrd.charAt(0);
		ind = index;
		lineNum = lN;
	}
	
	public char getCoder()
	{
		return coder;
	}
	
	public String toString()
	{
		return "coder:: " + coder + " ; (ind, lineNum) :: (" + ind +", " + lineNum + ")";
	}
	
}