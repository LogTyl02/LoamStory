import java.util.Random;
class MainRandom
{
	public static void main(String[] args)
	throws InterruptedException{
		int height, width, randX, randY,x,y, randPick,size;
		size = 30;
		height = size;
		width = size;
		x = 20;
		y = 20;

		Grid grid = new Grid(height, width);
		Random rand = new Random();
		//grid.markCell(x,y);

		//grid.markCell(15,22);
		//grid.markCell(14,22);

		while (true)
		{
			Thread.sleep(300);
			System.out.println("\033[2J");
			//randX = Math.abs(var.nextInt(height));
			//randY = Math.abs(var.nextInt(width));

			randPick = Math.abs(rand.nextInt(7));
			//randPick = 3;
			System.out.println(randPick);
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
			grid.markCell(x,y);
			grid.printGrid();
			grid.unmarkCell(x,y);
		}

	}
}
