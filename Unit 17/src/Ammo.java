//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	//adding this
	private Image image;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		setPos(x,y);
	}

	public Ammo(int x, int y, int s)
	{
		this(x,y);
		setSpeed(s);
		
		try
		{
//			This probably won't work
//			URL url = getClass().getResource("/images/ship.jpg");
//			image = ImageIO.read(url);
			//FOR SCHOOL
//			image = ImageIO.read(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 17\\src\\ammo.jpg"));
			
			//FOR HOME
			image = ImageIO.read(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 17\\src\\ammo.jpg"));

		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Issue with ammo image");
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

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	
	
	public void move( String direction )
	{
		//add code to draw the ammo,FIX THIS?
		setY(getY()-speed);
	}

	public String toString()
	{
		return super.toString() +" " + getSpeed();
	}
}
