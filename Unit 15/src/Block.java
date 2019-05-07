//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos=yPos=width=height=0;
		color = Color.BLACK;
	}
	
	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, int w)
	{
		setX(x);
		setY(y);
		setWidth(w);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
	

	
   //add the other set methods
   public void setPos(int x, int y)
   {
	   setX(x);
	   setY(y);
   }
	
   public void setX(int x)
   {
	   xPos = x;
   }
   
   public void setY(int y)
   {
	   yPos = y;
   }

   public void setWidth(int w)
   {
	   width = w;
   }
   
   public void setHeight(int h)
   {
	   height = h;
   }
   
   public void setColor(Color col)
   {
	   color  = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block other = (Block) obj;
		return getX() == other.getX() && getY() == other.getY() &&
				getWidth() == other.getWidth() && getHeight() == other.getHeight() && 
				getColor().equals(other.getColor());
	}   

   //add the other get methods
	  public int getX()
	  {
		  return xPos;
	  }    
	  
	  public int getY()
	  {
		  return yPos;
	  }

	  public int getWidth()
	  {
		  return width;
	  }
	  
	  public int getHeight()
	  {
		  return height;
	  }
	  
	  public Color getColor()
	  {
		  return color;
	  }
   //add a toString() method  - x , y , width, height, color
	  public String toString()
	  {
		  return xPos+", "+yPos+", "+width+", "+height+", "+color;
	  }
}