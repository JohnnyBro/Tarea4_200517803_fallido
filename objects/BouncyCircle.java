package gt.edu.usac.ipc1a.objects;

import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Circle{

	Color color;
	public BouncyCircle(){

		size = 100;
		gravity = 1f;
		color = Color.RED;
	}

	@Override
	public void DetectarSuelo()
	{
		if(positionX+size > 800)
		{
			Saltar();
			CambiarColor();
		}
	}

	public void Saltar(){

		do{
			velocityX -= 5f;
		}while((positionX+size)<0);
	}


	public void CambiarColor()
	{
		color = Color.blue;
	}

	@Override
	public void Draw (Graphics g){		 
		g.setColor(color);
		g.fillOval(positionX,positionY,size,size);
	}

}
