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
	private int lineNum;
	
	Coder()
	{
		coder = 'a';
		ind=lineNum=0;
	}
	
	public Coder(String wrd, int index, int lN)
	{
		coder = wrd.charAt(0);
		ind = index;
		lineNum = lN;
	}
	
	public String toString()
	{
		return "coder:: " + coder + " ; (ind, lineNum) :: (" + ind +", " + lineNum + ")";
	}
	
}