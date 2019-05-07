//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	/*
	 * Pong Lab Extension
	 * Implement a "4-way" break-out game, with the following requirements:
	 * 1. The game must contain at least 2 layers of tiles on the top, bottom, left and right side of the screen.
	 * 2. The paddle must be of size 40x40 (square) and be able to move up, down, left and right. 
	 * 3. The ball must be of size 10x10 and must be able to bounce off each of the sides of the paddle.
	 * 4. The game must contain at least 2 levels.
	 */
	
	/* Activity Log
	 * 5/6
	 * To Do
	 *  - Fix block collisions to mimic paddle collisions
	 *  - Code second level
	 */
	
	//Level One
	private boolean levelOne = true;
	private ArrayList<Block>bricks1;
	private Block upIn;
	private Block upOut;
	private Block downIn;
	private Block downOut;
	private Block rightIn;
	private Block rightOut;
	private Block leftIn;
	private Block leftOut;
	//---------------------------------
	
	//Level Two
	private boolean levelTwo = false;
	private ArrayList<Block>bricks2;
	private Block upIn2;
	private Block upOut2;
	private Block downIn2;
	private Block downOut2;
	private Block rightIn2;
	private Block rightOut2;
	private Block leftIn2;
	private Block leftOut2;
	//---------------------------------
	
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;

	public Pong()
	{
		//set up game vars
		ball = new Ball(200,200,10,10,Color.blue,2,2);
		paddle = new Paddle(690,200,40,40,Color.orange,2);	
		keys = new boolean[4];
		bricks1 = new ArrayList<Block>();
		//-------------------------------------------------

		
		//Level One bricks1
		bricks1.add(upIn = new Block(15,10,720,10,Color.PINK));
		bricks1.add(upOut = new Block(15,30,720,10,Color.PINK));
		bricks1.add(downIn = new Block(15,480,720,10,Color.GREEN));
		bricks1.add(downOut = new Block(15,500,720,10,Color.GREEN));
		bricks1.add(rightIn = new Block(740,50,10,420,Color.CYAN));
		bricks1.add(rightOut = new Block(760,50,10,420,Color.CYAN));
		bricks1.add(leftIn = new Block(30,50,10,420,Color.MAGENTA));
		bricks1.add(leftOut = new Block(10,50,10,420,Color.MAGENTA));
		//-------------------------------------------------------------
		//FIX THIS
		//Level Two bricks2
		bricks2.add(upIn2 = new Block(15,10,720,10,Color.GREEN));
		bricks2.add(upOut2 = new Block(15,30,720,10,Color.GREEN));
		bricks2.add(downIn2 = new Block(15,480,720,10,Color.PINK));
		bricks2.add(downOut2 = new Block(15,500,720,10,Color.PINK));
		bricks2.add(rightIn2 = new Block(740,50,10,420,Color.MAGENTA));
		bricks2.add(rightOut2 = new Block(760,50,10,420,Color.MAGENTA));
		bricks2.add(leftIn2 = new Block(30,50,10,420,Color.CYAN));
		bricks2.add(leftOut2 = new Block(10,50,10,420,Color.CYAN));
		//-------------------------------------------------------------
		
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void deleteBlock(Block b)
   {
//	   b.setHeight(0);
//	   b.setWidth(0);
//	   b.setPos(150, 150);
//	   b.setColor(Color.PINK);
   }
   
   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the background image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();		
		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);

     	//Position over score
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(10,530,100,10);
		graphToBack.fillRect(700,530,100,10);
		
		
		if(levelOne)
		{
			for(Block b: bricks1)
			{
				b.draw(graphToBack);
			}
		}
		
		if(levelTwo)
			System.out.println("LEVEL TWO!!!");
		
		if(!levelOne && !levelTwo)
			System.out.println("DONE!!!");

		
		
//		Wall collisions
//		----------------------------------------------------------------------------------------------------------------
		//left or right wall
		if(!(ball.getX()>=-50 && ball.getX()<=760))
		{
//			System.out.println("Hit a right or left wall");
			ball.setXSpeed(-ball.getXSpeed());
		}	
		//top or bottom wall 
		if(!(ball.getY()>=0 && ball.getY()<=520))
		{
//			System.out.println("Hit a top or bottom wall");
			ball.setYSpeed(-ball.getYSpeed());
		}
		//end wall collisions
//		------------------------------------------------------------------------------------------------------------
		
		
		
//		Block collisions
//		----------------------------------------------------------------------------------------------------------------
		for(Block brk : bricks1) 
		{			
			System.out.println(bricks1.size());
			
			//see if the ball hits the block from the right	
			if( (ball.getX() == brk.getX() + brk.getWidth() + Math.abs(ball.getXSpeed())) 
				&& ((brk.getY() < ball.getY()) && ball.getY() < brk.getY() + brk.getHeight() - ball.getYSpeed())
			  )
			{
//				System.out.println("BALL HITS BLOCK FROM RIGHT");
				ball.setXSpeed(-ball.getXSpeed());
				deleteBlock(brk);
				bricks1.remove(brk);
			}		
			
			//see if the ball hits the block from the left	
			if( (ball.getX() == brk.getX() - Math.abs(ball.getXSpeed())) 
				&& ((brk.getY() < ball.getY()) && ball.getY() < brk.getY() + brk.getHeight() - ball.getYSpeed())
			  )
			{
//				System.out.println("BALL HITS BLOCK FROM LEFT");
				ball.setXSpeed(-ball.getXSpeed());
				deleteBlock(brk);
				bricks1.remove(brk);
			}
			
			//see if the ball hits the block from the top	
			if( (ball.getY() == brk.getY() - Math.abs(ball.getYSpeed())) 
					&& ((brk.getX() < ball.getX()) && ball.getX() < brk.getX() + brk.getWidth() - ball.getXSpeed())
			  )
			{
//				System.out.println("BALL HITS BLOCK FROM TOP");
				ball.setYSpeed(-ball.getYSpeed());
				deleteBlock(brk);
				bricks1.remove(brk);
			}
			
			//see if the ball hits the block from the bottom	
			if( (ball.getY() == brk.getY() + brk.getHeight() + Math.abs(ball.getYSpeed())) 
					&& ((brk.getX() < ball.getX()) && ball.getX() < brk.getX() + brk.getWidth() - ball.getXSpeed())
			  )
			{
//				System.out.println("BALL HITS BLOCK FROM TOP");
				ball.setYSpeed(-ball.getYSpeed());
				deleteBlock(brk);
				bricks1.remove(brk);
			}
			if(bricks1.size() == 0)
			{
				levelOne = false;
				levelTwo = true;
			}
		}
		
		//end block collisions
//		----------------------------------------------------------------------------------------------------------------

		
		
//		Paddle collisions
//		----------------------------------------------------------------------------------------------------------------		
		//see if the ball hits the paddle from the right	
		if( (ball.getX() == paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed())) 
			&& ((paddle.getY() < ball.getY()) && ball.getY() < paddle.getY() + paddle.getHeight() - ball.getYSpeed())
		  )
		{
//			System.out.println("BALL HITS PADDLE FROM RIGHT");
			ball.setXSpeed(-ball.getXSpeed());
		}

		//see if the ball hits the paddle from the left	
		if( (ball.getX() == paddle.getX() - Math.abs(ball.getXSpeed())) 
			&& ((paddle.getY() < ball.getY()) && ball.getY() < paddle.getY() + paddle.getHeight() - ball.getYSpeed())
		  )
		{
//			System.out.println("BALL HITS PADDLE FROM LEFT");
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits the paddle from the top	
		if( (ball.getY() == paddle.getY() - Math.abs(ball.getYSpeed())) 
				&& ((paddle.getX() < ball.getX()) && ball.getX() < paddle.getX() + paddle.getWidth() - ball.getXSpeed())
			  )
			{
//				System.out.println("BALL HITS PADDLE FROM TOP");
				ball.setYSpeed(-ball.getYSpeed());
			}

		//see if the ball hits the paddle from the bottom	
		if( (ball.getY() == paddle.getY() + paddle.getHeight() + Math.abs(ball.getYSpeed())) 
				&& ((paddle.getX() < ball.getX()) && ball.getX() < paddle.getX() + paddle.getWidth() - ball.getXSpeed())
			  )
			{
//				System.out.println("BALL HITS PADDLE FROM TOP");
				ball.setYSpeed(-ball.getYSpeed());
			}	
//		end Paddle collisions
//		----------------------------------------------------------------------------------------------------------------
	
		//see if the paddles need to be moved
		    if(keys[0] == true)
		    {
		      paddle.moveUpAndDraw(graphToBack);
		    }
		    if(keys[1] == true)
		    {
		      paddle.moveDownAndDraw(graphToBack);
		    }
		    
		    if(keys[2] == true)
		    {
		      paddle.moveLeftAndDraw(graphToBack);
		    }
		    if(keys[3] == true)
		    {
		      paddle.moveRightAndDraw(graphToBack);
		    }
			
		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   public boolean keyIsPressed(char key) {
	    switch(toUpperCase(key))
	    {
	      case 'W' : return keys[0];
	      case 'S' : return keys[1];
	      case 'A' : return keys[2];
	      case 'D' : return keys[3];
	    }
	    return false;
	  }

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
           repaint();
         }
      }catch(Exception e)
      {
      }
   	
//   		ball.draw(graphToBack,Color.WHITE);
   		ball.setX((int)(Math.random()*50)+400);
   		ball.setY((int)(Math.random()*50)+300);
   		int thing = (int) (Math.random()*2);
   		if(thing == 0)
   		{
   			ball.setSpeed(2, 1);
   		}
   		else ball.setSpeed(-2,1);
  
   		//Make ball restart in random place
//		---------------------------------------------------------
//		if(!(ball.getX()>=-50 && ball.getX()<=760))
//		{
//			System.out.println("Hit a right or left wall");
//
//			ball.setXSpeed(0);
//			ball.setYSpeed(0);
//		   	try
//		   	{
//		   		Thread.currentThread().sleep(950);
////		        repaint();
//		        
//		    }catch(Exception e)
//		      {}
//		   		System.out.println("Hit a wall");
//
//		   		ball.draw(graphToBack,Color.WHITE);
//		   		ball.setX((int)(Math.random()*50)+400);
//		   		ball.setY((int)(Math.random()*50)+300);
//		   		int thing = (int) (Math.random()*2);
//		   		if(thing == 0)
//		   		{
//		   			ball.setSpeed(2, 1);
//		   		}
//		   		else ball.setSpeed(-2,1);
//		}//end check for left or right wall collision
//   		---------------------------------------------------------
   		
   }	
}