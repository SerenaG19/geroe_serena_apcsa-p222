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
	 *  - get paddle to start in center of screen, bottom
	 *  - make right blocks appear
	 *  - fix boundaries of play or block placement so all blocks are reachable (all outer blocks)
	 *  - fix multi-directional collision with paddle
	 *      - right side totally weird
	 *      -top and bottom must be added
	 *  - Code second level
	 */
	
	//Adding stuff for lab extension
	private ArrayList<Block>bricks;
	private Block upIn;
	private Block upOut;
	private Block downIn;
	private Block downOut;
	private Block rightIn;
	private Block rightOut;
	private Block leftIn;
	private Block leftOut;
	//---------------------------------
	
	
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private boolean hitpaddle, hitLeftPaddle;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(200,200,10,10,Color.blue,2,1);
//		System.out.println("From Pong.java :: "+ball.getXSpeed() + " , " + ball.getYSpeed());

		paddle = new Paddle(690,200,40,40,Color.orange,3);
		
		keys = new boolean[4];

		
		//Adding more stuff for lab extension
		bricks = new ArrayList<Block>();
		bricks.add(upIn = new Block(15,10,750,10,Color.PINK));
		bricks.add(upOut = new Block(15,30,750,10,Color.PINK));
		bricks.add(downIn = new Block(15,480,750,10,Color.GREEN));
		bricks.add(downOut = new Block(15,500,750,10,Color.GREEN));
		bricks.add(rightIn = new Block(740,50,10,420,Color.cyan));
		bricks.add(rightOut = new Block(760,50,10,420,Color.cyan));
		bricks.add(leftIn = new Block(30,50,10,420,Color.MAGENTA));
		bricks.add(leftOut = new Block(10,50,10,420,Color.MAGENTA));
		//---------------------------------


    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
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

		graphToBack.setColor(Color.RED);
		
		
		ball.moveAndDraw(graphToBack);
//		leftPaddle.draw(graphToBack);
		paddle.draw(graphToBack);
		
		//more stuff for lab extension
		rightIn.draw(graphToBack);

		for(Block brk : bricks) 
		{
			brk.draw(graphToBack);
			if((ball.getX() <= brk.getX() + brk.getWidth() + Math.abs(ball.getXSpeed())) 
				&& (ball.getY() >= brk.getY()
				&& ball.getY() <= brk.getY()+brk.getHeight()
				|| ball.getY() + ball.getHeight() >= brk.getY()
				&& ball.getY() + ball.getHeight() <= brk.getY() + brk.getHeight()
				))
			{
				if(ball.getX() <= brk.getX() + brk.getWidth()-Math.abs(ball.getXSpeed()))
					ball.setYSpeed(-ball.getYSpeed());
				else ball.setXSpeed(-ball.getXSpeed());
				brk.setColor(Color.WHITE);
			}
		}
		//---------------------------------
		

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))//FIX THIS!
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
//			if(ball.getX() > 780) leftScore++;
//			if(ball.getX() < 10) rightScore++;
			
		   	try
		   	{
		   		Thread.currentThread().sleep(950);
//		        repaint();
		        
		    }catch(Exception e)
		      {}
//		   		System.out.println("Hit a wall");

		   		ball.draw(graphToBack,Color.WHITE);
		   		ball.setX((int)(Math.random()*50)+400);
		   		ball.setY((int)(Math.random()*50)+300);
		   		int thing = (int) (Math.random()*2);
		   		if(thing == 0)
		   		{
		   			ball.setSpeed(2, 1);
		   		}
		   		else ball.setSpeed(-2,1);
//		   		System.out.println("Reset the ball, speed :: " + ball.getXSpeed() + " " + ball.getYSpeed());
		}	
		
		
	
		
     	//Position over score
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(10,530,100,10);
		graphToBack.fillRect(700,530,100,10);
		
		graphToBack.setColor(Color.red);		
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=20 && ball.getY()<=500))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
//		//see if the ball hits the left paddle
//			if((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())) 
//			&& (ball.getY() >= leftPaddle.getY()
//			&& ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight()
//			|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
//			&& ball.getY() + ball.getHeight() <= leftPaddle.getY() + leftPaddle.getHeight()
//			))
//			{
//				hitLeftPaddle = true;
//				if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
//					ball.setYSpeed(-ball.getYSpeed());
//				else
//					ball.setXSpeed(-ball.getXSpeed());
//			}
////		
//		//see if the ball hits the paddle from the left	
			if((ball.getX() >= paddle.getX()) && //ball is touching paddle from left side
		    ((paddle.getY() <= ball.getY()) && //ball is below or flush with paddle
		    (ball.getY() <= paddle.getY() + paddle.getHeight()) //flush vertically with paddle
		   	))
			{
				System.out.println("PADDLE ON THE LEFT");
//				ball.setXSpeed(-ball.getXSpeed());

////				hitpaddle = true;
//				if(ball.getX() <= 50 + 40-Math.abs(ball.getXSpeed())) System.out.println("Thing");
////					ball.setYSpeed(-ball.getYSpeed());
////				if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
////					ball.setYSpeed(-ball.getYSpeed());
//				else
//					ball.setXSpeed(-ball.getXSpeed());
			}
			
//			//see if the ball hits the paddle from the right	
				if( (ball.getX() < paddle.getX()) && //ball is touching paddle from right side
			    ( ball.getX() <= paddle.getX()+paddle.getWidth()
			    &&
			    (paddle.getY() <= ball.getY()) && //ball is below or flush with paddle
			    (ball.getY() <= paddle.getY() + paddle.getHeight()) //flush vertically with paddle
			   	)
			    )
				{ 
					System.out.println("PADDLE ON THE RIGHT");
//					ball.setXSpeed(-ball.getXSpeed());
				}
			
			
			
//			//ball hits left side of paddle
//			if(ball.getX() <= paddle.getX() && (ball.getY() <= paddle.getWidth() + paddle.getY()))
//				ball.setXSpeed(-ball.getXSpeed());
//			//ball hits right side of paddle
//			if(ball.getX() >= paddle.getX() && (ball.getY() <= paddle.getWidth() + paddle.getY()))
//				ball.setXSpeed(-ball.getXSpeed());//				hitpaddle = true;
//
////			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
////				ball.setYSpeed(-ball.getYSpeed());
////			else
////				ball.setXSpeed(-ball.getXSpeed());

			
		
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
  }	
}