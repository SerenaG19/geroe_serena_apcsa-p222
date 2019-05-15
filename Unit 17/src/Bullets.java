//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Serena Geroe

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for(Ammo blt : ammo)
			blt.draw(window);
	}

	public void moveEmAll()
	{
		for(Ammo blt : ammo)
		{
			blt.setColor(Color.YELLOW);			
			blt.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for(Ammo blt : ammo)
		{
			if(ammo.size() > 0 && blt.getY() < 0)
			{
				blt.setSpeed(0);
				blt.setColor(Color.BLACK);
				ammo.remove(blt);
			}
			else System.out.println("out of ammo");
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return ammo.toString();
	}
}
