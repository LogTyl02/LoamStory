import java.util.Random;
class Monst
{
	int x,y,height,width;
	Random rand = new Random();
	Monst (int x, int y, int height, int width)
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	public int[] modeWonder()
	{
		int randPick = rand.nextInt(7);
		//int[] values = new int[2];
		if (randPick == 7)
		{
			//Direction: Left/Up
			x = (x + (height-1)) % height;
			y = (y + (width-1)) % width;
		}
		else if (randPick == 6)
		{
			//Direction: Left/Down
			x = (x+1) % height;
			y = (y + (width-1)) % width;
		}
		else if (randPick == 5)
		{
			//Direction: Right/Up
			x = (x + (height-1)) % height;
			y = (y+1) % width;
		}
		else if (randPick == 4)
		{
			//Direction: Right/Down
			x = (x+1) % height;
			y = (y+1) % width;
		}
		else if (randPick == 3)
		{
			//Direction: Right
			y = (y + 1) % width;
		}
		else if (randPick == 2)
		{
			//Direction: Left
			y = (y + (width -1)) % width;
		}
		else if (randPick == 1)
		{
			//Direction: Up
			x = (x + (height -1)) % height;
		}
		else
		{
			//Direction: Down
			x = (x+1) % height;
		}
		int[] values = {x,y};
		return values;
	}

}
