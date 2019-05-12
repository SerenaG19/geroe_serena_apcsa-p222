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
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
//	private Alien alienTwo;

	//testing for one ammo
	private Ammo ammo;
	
	
	/* uncomment once you are ready for this part
	 *
    private AlienHorde horde;
	private Bullets shots;
	*/

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(100,100,50,50,3);
		alienOne = new Alien(50,50,50,50,2);
//		alienTwo = new Alien(100,50,50,50,2);
		
		ammo = new Ammo(ship.getX()+20,ship.getY(),3);
		

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

    public void update(Graphics window)
    {
	   paint(window);
    }

	public void paint( Graphics window )
	{

		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		//do this first!
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ",25,50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		//then add graphics
		ship.draw(graphToBack);
//		System.out.println(ship);
		
		alienOne.draw(graphToBack);
//		alienTwo.draw(graphToBack);

		
		if(keys[0] == true)
		{
//			if(ship.getX() > 10)
				ship.move("LEFT");
//			System.out.println("left detected");
		}
		if(keys[1] == true)
		{
//			if(ship.getX() < 690)
				ship.move("RIGHT");
//			System.out.println("right detected");
		}
		if(keys[2] == true)
		{
//			if(ship.getY() < 490)
				ship.move("UP");
//			System.out.println("up detected");
		}
		if(keys[3] == true)
		{
//			if(ship.getY() > 15)
			ship.move("DOWN");
//			System.out.println("down detected");
		}
		if(keys[4] == true)
		{
			ammo.setPos(ship.getX()+20,ship.getY());
			ammo.draw(graphToBack);
			while(ammo.getY() > 0)
				ammo.move("UP");
			System.out.println(ammo);
//			System.out.println("ammo detected");
		}

		//add code to move Ship, Alien, etc.


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
//		if( (ammo.getX() == alienOne.getX() + alienOne.getWidth() + Math.abs(ammo.getSpeed())) 
//				&& ((alienOne.getY() <= ammo.getY()) && ammo.getY() <= alienOne.getY() + alienOne.getHeight() - ammo.getSpeed())
//				  )
//				{
////					System.out.println("AMMO HITS ALIEN FROM RIGHT");
//					alienOne.setSpeed(0);
//					graphToBack.setColor(Color.BLACK);
//					alienOne.draw(graphToBack);
//				}		


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

