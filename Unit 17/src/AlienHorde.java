//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

//	public AlienHorde(int size)
	public AlienHorde()
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien al : aliens)
			al.draw(window);
	}

	public List<Alien> getList()
	{
		return aliens;
	}
	
	public void moveEmAll()
	{
		for(Alien al : aliens)
		{			
			al.move("RIGHT");
		}
	}
	
	public void stopEmAll()
	{
		for(Alien al : aliens)
		{			
			al.setSpeed(0);
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(Alien al : aliens)
		{	
			for(Ammo ammo : shots)
			{
				if(aliens.size() > 0 && al.getY()<0 || 
						(ammo.getY() == al.getY() + al.getHeight() + Math.abs(ammo.getSpeed())) 
						&& ((al.getX() <= ammo.getX()) && ammo.getX() <= al.getX() + al.getWidth() - ammo.getSpeed())
				)
				{
					al.setSpeed(0);
					aliens.remove(al);
				}
			}		
		}
	}

	public String toString()
	{
		return aliens.toString();
	}
}
