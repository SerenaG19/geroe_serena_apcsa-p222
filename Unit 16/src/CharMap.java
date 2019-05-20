import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class CharMap
{
	private ArrayList<Coder>charMap;
	
	CharMap()
	{
		charMap = new ArrayList<Coder>();
	}

	public ArrayList<Coder> setMap(Scanner file)
	{
//		int fileSize = file.nextInt();
//		System.out.println("fileSize :: " + fileSize);
		
		int x = 0;
		//COORDINATE SYSTEM
		//x:: word number within the line
		//y :: line number
		int y = 0;

			do
			{

				charMap.add( new Coder(file.next(), x++,y) );

			}while(file.hasNextLine());
		return charMap;
	}
	
	public String toString()
	{
		String output = "---------CHARMAP---------\n";
		for(Coder printMe : charMap)
		{
			output += printMe + "\n";
		}
		output += "--------------------------";
		return output;
	}
}