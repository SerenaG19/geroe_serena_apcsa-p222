//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int rightScore;
	private int leftScore;
	private boolean hitRightPaddle, hitLeftPaddle;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(200,200,10,10,Color.blue,2,1);
		System.out.println(ball.getXSpeed() + " , " + ball.getYSpeed());
		
		leftPaddle = new Paddle(20,200,10,40,Color.orange,2);

		rightPaddle = new Paddle(750,200,10,40,Color.orange,3);
		
		keys = new boolean[4];
		rightScore = 0;
		leftScore = 0;
		hitRightPaddle = hitLeftPaddle = false;

    
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

		graphToBack.setColor(Color.red);
		
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			if(ball.getX() > 780) leftScore++;
			if(ball.getX() < 10) rightScore++;
			
		   	try
		   	{
		   		while(true)
		   		{
		   		   Thread.currentThread().sleep(8);
		            repaint();
		         }
		      }catch(Exception e)
		      {}
		   	
		   		ball.draw(graphToBack,Color.WHITE);
		   		ball.setX((int)(Math.random()*50)+400);
		   		ball.setY((int)(Math.random()*50)+300);
		   		int thing = (int) (Math.random()*2);
		   		if(thing == 0)
		   		{
		   			ball.setSpeed(2, 1);
		   		}
		   		else ball.setSpeed(-2,1);
		}
			


     	//Position over score
		graphToBack.setColor(Color.ORANGE);
		graphToBack.fillRect(10,590,80,500);
		graphToBack.fillRect(700,590,100, 500);
		
		graphToBack.setColor(Color.red);
		graphToBack.drawString("rightScore = "+rightScore, 10, 540);
		graphToBack.drawString("leftScore = "+leftScore, 700, 540);
		
//		graphToBack.drawString("hitRightPaddle = "+hitRightPaddle, 550, 540);
//		graphToBack.drawString("hitLeftPaddle = "+hitLeftPaddle, 100, 540);
		
		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=20 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left paddle
//			if(ball.getX() <= leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) 
//			&& ball.getY() >= leftPaddle.getY()
//			&& ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight()
//			|| ball.getY() + ball.getHeight() >= leftPaddle.getY()
//			&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()
//			)
//			{
//				hitLeftPaddle = true;
//				if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
//					ball.setYSpeed(-ball.getYSpeed());
//				else
//					ball.setXSpeed(-ball.getXSpeed());
//			}
//		
//		//see if the ball hits the right paddle		
//			if((ball.getX() >= rightPaddle.getX()) && 
//		    ((rightPaddle.getY() <= ball.getY()) && 
//		    (ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()) 
//		   	))
//			{
//				hitRightPaddle = true;
//				if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth()-Math.abs(ball.getXSpeed()))
//					ball.setYSpeed(-ball.getYSpeed());
//				else
//					ball.setXSpeed(-ball.getXSpeed());
//			}
		
		//see if the paddles need to be moved
		
		    if(keys[0] == true)
		    {
		      leftPaddle.moveUpAndDraw(graphToBack);
		    }
		    if(keys[1] == true)
		    {
		      leftPaddle.moveDownAndDraw(graphToBack);
		    }
		    
		    if(keys[2] == true)
		    {
		      rightPaddle.moveUpAndDraw(graphToBack);
		    }
		    if(keys[3] == true)
		    {
		      rightPaddle.moveDownAndDraw(graphToBack);
		    }


		twoDGraph.drawImage(back, null, 0, 0);
	}
   
   public boolean keyIsPressed(char key) {
	    switch(toUpperCase(key))
	    {
	      case 'W' : return keys[0];
	      case 'Z' : return keys[1];
	      case 'I' : return keys[2];
	      case 'M' : return keys[3];
	    }
	    return false;
	  }

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
//   	try
//   	{
//   		while(true)
//   		{
//   		   Thread.currentThread().sleep(8);
//            repaint();
//         }
//      }catch(Exception e)
//      {
//      }
//   	
//   		ball.draw(graphToBack,Color.WHITE);
//   		ball.setX((int)(Math.random()*50)+400);
//   		ball.setY((int)(Math.random()*50)+300);
//   		int thing = (int) (Math.random()*2);
//   		if(thing == 0)
//   		{
//   			ball.setSpeed(2, 1);
//   		}
//   		else ball.setSpeed(-2,1);
  }	
}