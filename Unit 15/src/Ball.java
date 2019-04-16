//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setSpeed(3,1);
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(x,y);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width, int height)
	{
		this(x,y);
		super.setWidth(width);
	
	}
	   
   //add the set methods
	public void setSpeed(int x, int y)
	{
		xSpeed = x;
		ySpeed = y;
	}
		
	
	public void setX(int x)
	{
		xSpeed = x;
	}
	
	public void setY(int y)
	{
		ySpeed = y;
	}
   
	public void setPos(int x, int y)
	{
		xSpeed = x;
		ySpeed = y;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location


      setX(getX()+xSpeed);
		//setY

		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		
		return getX() == other.getX() && getY() == other.getY();
	}   

   //add the get methods
	public int getX()
	{
		return xSpeed;
	}
	
	public int getY()
	{
		return ySpeed;
	}
	
	
   //add a toString() method
	public String toString()
	{
		return xSpeed+" "+ySpeed+", "
				+super.getY()+", "+super.getWidth()+", "+
				 super.getHeight()+", "+super.getColor();
	}
}