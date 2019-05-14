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
    private AlienHorde horde;
	private Bullets shots;
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);
		keys = new boolean[5];
		ship = new Ship(370,450,50,50,3);
		shots = new Bullets();
		horde = new AlienHorde();
		horde.add(new Alien(70,25,50,50,1));
		horde.add(new Alien(140,25,50,50,1));
		horde.add(new Alien(210,25,50,50,1));
		horde.add(new Alien(280,25,50,50,1));
		horde.add(new Alien(350,25,50,50,1));
		horde.add(new Alien(420,25,50,50,1));
		horde.add(new Alien(490,25,50,50,1));
		horde.add(new Alien(560,25,50,50,1));

//		System.out.println(horde);
		
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
		
//		label game--------------------------------
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ",25,50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
//		label game--------------------------------
		
//		add graphics-----------------------------
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
//		System.out.println(ship);
//		alienOne.draw(graphToBack);
//		alienTwo.draw(graphToBack);
//		add graphics-----------------------------

//		set keys---------------------------------
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
			shots.add(new Ammo(ship.getX()+20,ship.getY(),1, Color.YELLOW));
//			System.out.println("ammo detected");
		}
//		set keys---------------------------------

		//add code to move Ship, Alien, etc.
		horde.moveEmAll();
		for(Alien al : horde.getList())
		{
			if(al.getX() > 580 || al.getX() < 20)
			{
				al.setY(al.getY()+50);
				al.setSpeed(al.getSpeed()*-1);
			}
		}
		horde.removeDeadOnes(shots.getList());
		
//		System.out.println(shots);
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		shots.cleanEmUp();
		for(Ammo blt : shots.getList())
		{
			if((blt.getY() == ship.getY() + ship.getHeight() + Math.abs(blt.getSpeed())) 
			&& ((ship.getX() <= blt.getX()) && blt.getX() <= ship.getX() + ship.getWidth() - blt.getSpeed()))
			{
				ship.setPos(900,900);
				graphToBack.setColor(Color.BLACK);
				graphToBack.fillRect(ship.getX(),ship.getY(),ship.getWidth(),ship.getHeight());
				System.out.println("GAME OVER");
			}
		}

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

