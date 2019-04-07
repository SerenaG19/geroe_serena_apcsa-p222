//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed =5;
   }


   //add the other Paddle constructors -- ORDER OF PARAMS?
   public Paddle(int s)
   {
	   super(10,10);
	   speed = s;
   }
   
   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed =5;
   }
   
   public Paddle(int s, int x, int y)
   {
	   super(x,y);
	   speed = s;
   }
   
   public Paddle(int s, int x, int y, int w)
   {
	   super(x,y,w);
	   speed = s;
   }
   
   public Paddle( int s, int x, int y, int w, int h)
   {
	   super(x,y,w,h);
	   speed = s;
   }
   
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x,y,w,h,c);
	   speed =s;
   }


   public void setX(int x)
   {
	   super.setX(x);
   }
   
   public void setY(int y)
   {
	   super.setY(y);
   }
   public void setPos(int x, int y)
   {
	   super.setPos(x, y);
   }



   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   public int getX()
   {
	   return super.getX();
   }
   
   public int getY()
   {
	   return super.getY();
   }
   
   //add a toString() method
   public String toString()
   {
	   return speed+super.getX()+", "+super.getY()+", "+super.getWidth()+", "+super.getHeight()+", "+super.getColor();
   }
}