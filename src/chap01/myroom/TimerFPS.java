package chap01.myroom;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerFPS implements ActionListener {
	DrawFrame f;
	
	TimerFPS(DrawFrame f)
	{
		this.f = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(Shape o : f.arr)
		{
			if(o != null)
			{
				o.moveShape();
				if(o.whoIs() == 1)
				{
					Up t = (Up) o;
					t.drawLineDataSet();
				}
				if(o.whoIs() == 2)
				{
					Down t = (Down) o;
					t.drawLineDataSet();
				}
				if(o.whoIs() == 3)
				{
					Right t = (Right) o;
					t.drawLineDataSet();
				}
				if(o.whoIs() == 4)
				{
					Left s = (Left) o;
					s.drawLineDataSet();
				}
			}
		}
		f.repaint();
	}

}
