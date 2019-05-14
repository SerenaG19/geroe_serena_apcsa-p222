//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		super(x, y);
	}

	public Alien(int x, int y, int s)
	{
		this(x,y);
		setSpeed(s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		setSpeed(s);
		try
		{
//			URL url = getClass().getResource("/images/alien.jpg");
//			image = ImageIO.read(url);
			//FOR SCHOOL  
			image = ImageIO.read(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 17\\src\\alien.jpg"));
//			System.out.println("No issue with alien image");

			//FOR HOME
//			image = ImageIO.read(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 17\\src\\alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Issue with alien image");
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
	   setX(getX()+getSpeed());	   
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
