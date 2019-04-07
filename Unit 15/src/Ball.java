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
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y)
	{
		super(200,200);
		xSpeed = x;
		ySpeed = y;
	}
	
	public Ball(int xSp, int ySp, int xP, int yP)
	{
		super(xP,yP);
		xSpeed = xSp;
		ySpeed = ySp;
	}
	   
   //add the set methods
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