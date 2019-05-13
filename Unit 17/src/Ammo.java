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
	private Color col;
	
	public Ammo()
	{
		this(0,0);
	}

	public Ammo(int x, int y)
	{
		setPos(x,y);
	}

	public Ammo(int x, int y, int s, Color c)
	{
		this(x,y);
		setSpeed(s);
		col = c;
//		
//		try
//		{
//			This probably won't work
//			URL url = getClass().getResource("/images/ship.jpg");
//			image = ImageIO.read(url);
//			FOR SCHOOL
//			image = ImageIO.read(new File("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 17\\src\\ammo.jpg"));
//			
//			FOR HOME
//			image = ImageIO.read(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 17\\src\\ammo.jpg"));
//
//		}
//		catch(Exception e)
//		{
//			feel free to do something here
//			System.out.println("Issue with ammo image");
//		}
//		
	}

	public void setSpeed(int s)
	{
		speed = s;
	}
	
	public void setColor(Color c)
	{
		col = c;
	}


	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window)
	{
		window.setColor(col);
        window.fillRect(getX(), getY(), 10, 10); //add code to draw the ammo
    }
	
	
	public void move( String direction )
	{
		//add code to draw the ammo
		if(direction.equals("LEFT"))
			setX(getX()-speed);
		if(direction.equals("RIGHT"))
			setX(getX()+speed);
		if(direction.equals("UP"))
			setY(getY()-speed);
		if(direction.equals("DOWN"))
			setY(getY()+speed);
	}

	public String toString()
	{
		return super.toString() +" " + getSpeed();
	}
}
