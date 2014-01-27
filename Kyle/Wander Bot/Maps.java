import java.util.Random;
class Maps
{
	Grid grid;
	int gridSize;
	Maps(Grid grid, int gridSize)
	{
		this.grid = grid;
		this.gridSize = gridSize;
	}
	public void firstMapEver()
	{
		grid.markObject(5,3);
		grid.markObject(5,4);
		grid.markObject(5,5);
		grid.markObject(5,6);
		grid.markObject(5,7);
		grid.markObject(5,2);
		grid.markObject(5,1);
		grid.markObject(5,8);
		grid.markObject(9,1);
		grid.markObject(9,2);
		grid.markObject(9,3);
		grid.markObject(9,4);
		grid.markObject(9,5);
		grid.markObject(9,6);
		grid.markObject(9,7);
		grid.markObject(9,8);
		grid.markObject(10,8);
		grid.markObject(11,8);
		grid.markObject(12,8);
		grid.markObject(13,8);
		grid.markObject(14,8);
		grid.markObject(14,9);
		grid.markObject(14,10);
		grid.markObject(14,11);
		grid.markObject(14,12);
		grid.markObject(4,8);
		grid.markObject(3,8);
		grid.markObject(2,8);
		grid.markObject(1,8);
		grid.markObject(0,8);
		grid.markObject(0,12);
		grid.markObject(1,12);
		grid.markObject(2,12);
		grid.markObject(3,12);
		grid.markObject(4,12);
		grid.markObject(5,12);
		grid.markObject(5,13);
		grid.markObject(5,14);
		grid.markObject(5,15);
		grid.markObject(5,16);
		grid.markObject(5,17);
		grid.markObject(5,18);
		grid.markObject(5,19);
		grid.markObject(5,20);
		grid.markObject(5,0);
		grid.markObject(9,0);
		grid.markObject(9,12);
		grid.markObject(9,13);
		grid.markObject(9,14);
		grid.markObject(9,15);
		grid.markObject(9,16);
		grid.markObject(9,17);
		grid.markObject(9,18);
		grid.markObject(9,19);
		grid.markObject(9,20);
		grid.markObject(10,12);
		grid.markObject(11,12);
		grid.markObject(12,12);
		grid.markObject(13,12);

	}
	public void boxLevel()
	{
		//Makes left wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(x, 0);
		}
		//Makes top wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(0,x);
		}
		//makes right wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(x, gridSize-1);
		}
		//makes bottom wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(gridSize-1, x);
		}


	}
	public void leftBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(x, 0);
		}
	}
	public void topBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(0,x);
		}
	}
	public void rightBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(x, gridSize-1);
		}
	}
	public void bottomBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markObject(gridSize-1, x);
		}
	}
	public void randomSpots()
	{
		Random rand = new Random();


		for (int x=0; x<gridSize*19; x++)
		{
			int numbY = rand.nextInt(gridSize-1);
			int numbX = rand.nextInt(gridSize-1);
			grid.markObject(numbX, numbY);
		}
	}

}



























