//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry");
		sorry.setCount(1);
		System.out.println(sorry);
		
		Toy jiGoe = new Toy("ji Goe");
		jiGoe.setCount(5);
		System.out.println(jiGoe);
	}
}