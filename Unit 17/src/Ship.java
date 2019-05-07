//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
	}

	public Ship(int x, int y, int w, int h, int s)//check out this exception handling - try printing stuff here
	{
		super(x, y, w, h);
		speed=s;
		try
		{	//This probably won't work
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
			//Use this:
//			image = ImageIO.read(new File("/path"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
	}

	public int getSpeed()
	{
	   return 0;
	}

	public void move(String direction)
	{
		//add code here
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
