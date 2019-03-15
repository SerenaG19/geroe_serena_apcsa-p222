//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name1 = keyboard.nextLine();
		System.out.println("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		keyboard.nextLine();     //remove whitespace
		
		//instantiate monster one
		Skeleton monster1 = new Skeleton(name1,size1);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.nextLine();
		System.out.println("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		keyboard.nextLine();     //remove whitespace
		
		//instantiate monster two
		Skeleton monster2 = new Skeleton(name2,size2);
		
		System.out.println("\nMonster 1 - "+monster1);
		System.out.println("Monster 2 - "+monster2+"\n");

		System.out.println(monster1.isSmaller(monster2));
		System.out.println(monster1.namesTheSame(monster2));
	
	}
}