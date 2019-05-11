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
	   super(x,y);
	   speed = 10;
	   //image?
	}

	public Ship(int x, int y, int s)
	{
	   super(x,y);
	   setSpeed(s);
	   //image?
	}

	public Ship(int x, int y, int w, int h, int s)//check out this exception handling - try printing stuff here
	{
		super(x, y, w, h);
		speed=s;

		try
		{
//			This probably won't work
//			URL url = getClass().getResource("/images/ship.jpg");
//			image = ImageIO.read(url);
			//FOR SCHOOL
//			image = ImageIO.read(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 17\\src\\ship.jpg"));
		
			//FOR HOME
			image = ImageIO.read(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 17\\src\\ship.jpg"));

		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Issue with ship image");
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if(direction.equals("LEFT"))
			setX(getX()-speed);
		if(direction.equals("RIGHT"))
			setX(getX()+speed);
		if(direction.equals("UP"))
			setY(getY()-speed);
		if(direction.equals("DOWN"))
			setY(getY()+speed);
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() +" " + getSpeed();
	}
}
