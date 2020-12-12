package chap01.myroom;

public abstract class Shape{
	int x;
	int y;
	int sizeX;
	int sizeY;
	int speedX, speedY;
	boolean mouseCheck = false;
	Shape(int x, int y, int sizeX, int sizeY)
	{
		this.x = x;
		this.y = y;
		this.sizeX =sizeX;
		this.sizeY = sizeY;
		speedX = (int)(Math.random()*10)+1;
		speedY = (int)(Math.random()*10)+1;
	}
	boolean mouseClickCheck(int mouseX, int mouseY)
	{   
		if(mouseX==1)
			mouseCheck = true;
			
		return mouseCheck;
	}
	
	boolean isMouseCheck()
	{
		return mouseCheck;
	}
	
	void moveShape()
	{
		boundaryCheck(x+speedX, y+speedY);
		x += speedX;
		y += speedY;
	}
	void boundaryCheck(int movingX, int movingY)
	{
		if(movingX > 1000)
		{
			speedX = -speedX;
		}
		else if(movingX < 200)
		{
			speedX = -speedX;
		}
		if(movingY > 1000)
		{
			speedY = -speedY;
		}
		else if(movingY < 200)
		{
			speedY = -speedY;
		}
	}
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	public abstract int whoIs();

}
