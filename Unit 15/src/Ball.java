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
	
	public Ball(Color col)
	{
		super(200,200);
		setSpeed(3,1);
	}
	
	
	public Ball(int x, int y) //x and y correlating to xPos and yPos
	{
		super(x,y);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width)
	{
		super(x,y,width);
		setSpeed(3,1);
	}
	
	public Ball(int x, int y, int width, int height)
	{
		super(x,y,width,height);
		setSpeed(3,1);
	}
	
	
	Ball(int x, int y, int w, int h, Color col)
	{		
		super(x,y,w,h,col);
		setSpeed(3,1);
	}
	

	
	public Ball(int x, int y, int width, int height, Color col, int xSp)
	{
		super(x,y,width,height,col);
		setX(xSp);

	}
	   
	public Ball(int x, int y, int width, int height, Color col, int xSp, int ySp)
	{
		super(x,y,width,height,col);
		setSpeed(xSp,ySp);
		System.out.println("Constructing the ball");
		System.out.println(getXSpeed() + " , " + getYSpeed());
	}
	
	
   //add the set methods
	public void setSpeed(int x, int y)
	{
		xSpeed = x;
		ySpeed = y;
	}
		
	
	public void setXSpeed(int x)
	{
		xSpeed = x;
	}
	
	public void setYSpeed(int y)
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
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	
   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + getXSpeed() + " " + getYSpeed();
	}
}