package chap01.myroom;

public class Down extends Shape implements DrawLineShape
{
	int[] dataSet = new int[MAX_LINE];
	int lineVolume =3;
	
	Down(int x, int y, int sizeX, int sizeY) {
		super(x, y, sizeX, sizeY);
		drawLineDataSet();
	}

	@Override
	public int whoIs() {
		return 2;
	}

	@Override
	public void drawLineDataSet() {

		dataSet[0] = (x - sizeX /2);
		dataSet[1] = y;
		dataSet[2] = (x - sizeX);
		dataSet[3] = (y - sizeY);

		
		dataSet[4] = x;
		dataSet[5] = (y - sizeY);
		dataSet[6] = (x - sizeX);
		dataSet[7] = (y - sizeY);
		
		dataSet[8] = (x - sizeX /2);
		dataSet[9] =  y;
		dataSet[10] = x;
		dataSet[11] = (y - sizeY);
		 
	}
}