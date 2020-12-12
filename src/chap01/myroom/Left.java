package chap01.myroom;

public class Left extends Shape implements DrawLineShape
{
	int[] dataSet = new int[MAX_LINE];
	int lineVolume =3;
	
	Left(int x, int y, int sizeX, int sizeY) {
		super(x, y, sizeX, sizeY);
		drawLineDataSet();
	}

	@Override
	public int whoIs() {
		return 4;
	}

	@Override
	public void drawLineDataSet() {
		//¿ÞÂÊ
		dataSet[0] = (x);
		dataSet[1] = y;
		dataSet[2] = (x);
		dataSet[3] = (y - sizeY);

		
		dataSet[4] = (x - sizeX);
		dataSet[5] = (y - sizeY/2);
		dataSet[6] = (x);
		dataSet[7] = (y);
		
		dataSet[8] = (x - sizeX);
		dataSet[9] =  (y - sizeY/2);
		dataSet[10] = x;
		dataSet[11] = (y - sizeY);
		
	}
	
}

