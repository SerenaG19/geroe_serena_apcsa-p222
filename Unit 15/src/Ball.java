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
	public Ball(int x, int y) //x and y correlating to xPos and yPos
	{
		super(x,y);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width)
	{
		this(x,y);
		super.setWidth(width);
	
	}
	
	public Ball(int x, int y, int width, int height)
	{
		this(x,y,width);
		super.setHeight(height);
	}
	
	public Ball(int x, int y, int width, int height, int xSp)
	{
		this(x,y,width,height);
		setX(xSp);

	}
	   
	public Ball(int x, int y, int width, int height, int xSp, int ySp)
	{
		this(x,y,width,height,xSp);
		setY(ySp);

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
		super.setPos(x, y);
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	  draw(window,Color.white);

      setX(getX()+xSpeed);
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window, super.getColor());

      
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
		return super.toString() + " " + getX() + " " + getY();
	}
}