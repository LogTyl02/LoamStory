import java.util.Random;
class Monst
{
	int x,y,height,width;
	Grid grid;
	Random rand = new Random();
	Monst (int x, int y, int height, int width, Grid grid)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.grid = grid;
	}
	public int[] modeWonder()
	{
		boolean canGo = true;
		int[] values = new int[2];
		int tempX, tempY;
		tempX = x;
		tempY = y;
		//tempX = x;
		//tempY = y;
		while (canGo)
		{
			int randPick = rand.nextInt(7);
			//int randPick = 0;


			//int[] values = new int[2];
			if (randPick == 7)
			{
				//Direction: Left/Up
				tempX = (x + (height-1)) % height;
				tempY = (y + (width-1)) % width;
			}
			else if (randPick == 6)
			{
				//Direction: Left/Down
				tempX = (x+1) % height;
				tempY = (y + (width-1)) % width;
			}
			else if (randPick == 5)
			{
				//Direction: Right/Up
				tempX = (x + (height-1)) % height;
				tempY = (y+1) % width;
			}
			else if (randPick == 4)
			{
				//Direction: Right/Down
				tempX = (x+1) % height;
				tempY = (y+1) % width;
			}
			else if (randPick == 3)
			{
				//Direction: Right
				tempY = (y + 1) % width;
			}
			else if (randPick == 2)
			{
				//Direction: Left
				tempY = (y + (width -1)) % width;
			}
			else if (randPick == 1)
			{
				//Direction: Up
				tempX = (x + (height -1)) % height;
			}
			else
			{
				//Direction: Down
				tempX = (x+1) % height;
			}


			if (grid.isObject(tempX, tempY))
			{
				tempY = y;
				tempX = x;
				canGo = true;
			}
			else
			{
				canGo = false;
			}
		}
		x = tempX;
		y = tempY;
		values[0] = x;
		values[1] = y;
		return values;
	}
}
