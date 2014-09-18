package gt.edu.usac.ipc1a.objects;
import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Circle{
	
	Color color;
	public WallJump(){
		
		size = 75;
		gravity = 3f;
		color = Color.BLUE;
	}

	@Override
	public void DetectarPared(){
		if(positionX+size > 800)
			{
				Rebotar();
				CambiarColor();
			}
	}
	
	public void Rebotar(){
		positionX-= -velocityX;
	}
	
	public void CambiarColor()
	{
		color = Color.PINK;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}

}
