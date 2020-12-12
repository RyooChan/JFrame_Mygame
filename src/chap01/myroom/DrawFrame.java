package chap01.myroom;


import java.awt.*;
import javax.swing.*;

public class DrawFrame extends JFrame{
	Shape[] arr = new Shape[100];
	
	int generationNumber()
	{
		for(int i=0;i<100;i++)
		{
			if(arr[i] == null)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void paint(Graphics g) {

		g.setColor(Color.yellow);
		g.fillRect(0, 0, 1500, 1500);

		g.setColor(Color.white);
		g.fillRect(100, 100, 1200, 1200);
		
		g.setColor(Color.black); 
		for(Shape o : arr)
		{
			if( o != null)
			{
				if(o.whoIs() == 1)
				{
					Up t = (Up)o;
					for(int i = 0; i<t.lineVolume; i++)
					{
						g.drawLine(t.dataSet[0+(i*4)], 
								t.dataSet[1+(i*4)], 
								t.dataSet[2+(i*4)], 
								t.dataSet[3+(i*4)]);
					}
				}
				else if(o.whoIs() == 2)
				{
					Down t = (Down)o;
					for(int i = 0;i<t.lineVolume; i++)
					{
						g.drawLine(t.dataSet[0+(i*4)], 
								t.dataSet[1+(i*4)], 
								t.dataSet[2+(i*4)], 
								t.dataSet[3+(i*4)]);
					}
				}
				else if(o.whoIs() == 3)
				{
					Right t = (Right)o;
					for(int i = 0;i<t.lineVolume; i++)
					{
						g.drawLine(t.dataSet[0+(i*4)], 
								t.dataSet[1+(i*4)], 
								t.dataSet[2+(i*4)], 
								t.dataSet[3+(i*4)]);
					}
				}
				else if(o.whoIs() == 4)
				{
					Left t = (Left)o;
					for(int i = 0;i<t.lineVolume; i++)
					{
						g.drawLine(t.dataSet[0+(i*4)], 
								t.dataSet[1+(i*4)], 
								t.dataSet[2+(i*4)], 
								t.dataSet[3+(i*4)]);
					}
				}
			}
		}
	}
}
