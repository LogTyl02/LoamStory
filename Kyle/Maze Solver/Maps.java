import java.util.Random;
class Maps
{
	Grid grid;
	int gridSize;
	String markMaps;
	Maps(Grid grid, int gridSize, String markMaps_)
	{
		this.grid = grid;
		this.gridSize = gridSize;
		this.markMaps = markMaps_;
	}
	public void randomMaze()
	{

	}
	/*
	public void firstMapEver()
	{
		grid.markCell(5,3, markMaps);
		grid.markCell(5,4);
		grid.markCell(5,5);
		grid.markCell(5,6);
		grid.markCell(5,7);
		grid.markCell(5,2);
		grid.markCell(5,1);
		grid.markCell(5,8);
		grid.markCell(9,1);
		grid.markCell(9,2);
		grid.markCell(9,3);
		grid.markCell(9,4);
		grid.markCell(9,5);
		grid.markCell(9,6);
		grid.markCell(9,7);
		grid.markCell(9,8);
		grid.markCell(10,8);
		grid.markCell(11,8);
		grid.markCell(12,8);
		grid.markCell(13,8);
		grid.markCell(14,8);
		grid.markCell(14,9);
		grid.markCell(14,10);
		grid.markCell(14,11);
		grid.markCell(14,12);
		grid.markCell(4,8);
		grid.markCell(3,8);
		grid.markCell(2,8);
		grid.markCell(1,8);
		grid.markCell(0,8);
		grid.markCell(0,12);
		grid.markCell(1,12);
		grid.markCell(2,12);
		grid.markCell(3,12);
		grid.markCell(4,12);
		grid.markCell(5,12);
		grid.markCell(5,13);
		grid.markCell(5,14);
		grid.markCell(5,15);
		grid.markCell(5,16);
		grid.markCell(5,17);
		grid.markCell(5,18);
		grid.markCell(5,19);
		grid.markCell(5,20);
		grid.markCell(5,0);
		grid.markCell(9,0);
		grid.markCell(9,12);
		grid.markCell(9,13);
		grid.markCell(9,14);
		grid.markCell(9,15);
		grid.markCell(9,16);
		grid.markCell(9,17);
		grid.markCell(9,18);
		grid.markCell(9,19);
		grid.markCell(9,20);
		grid.markCell(10,12);
		grid.markCell(11,12);
		grid.markCell(12,12);
		grid.markCell(13,12);

	}
	*/
	public void boxLevel()
	{
		//Makes left wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(x, 0, markMaps);
		}
		//Makes top wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(0,x, markMaps);
		}
		//makes right wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(x, gridSize-1, markMaps);
		}
		//makes bottom wall
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(gridSize-1, x, markMaps);
		}


	}
	public void leftBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(x, 0, markMaps);
		}
	}
	public void topBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(0,x, markMaps);
		}
	}
	public void rightBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(x, gridSize-1, markMaps);
		}
	}
	public void bottomBorder()
	{
		for (int x=0; x<gridSize; x++)
		{
			grid.markCell(gridSize-1, x, markMaps);
		}
	}
	public void randomSpots()
	{
		Random rand = new Random();


		for (int x=0; x<gridSize*9; x++)
		{
			int numbY = rand.nextInt(gridSize-1);
			int numbX = rand.nextInt(gridSize-1);
			grid.markCell(numbX, numbY, markMaps);
		}
	}
	public void myMaze()
	{
		boxLevel();
		grid.markCell(gridSize-3, gridSize-2, markMaps);

		for (int y=2; y<gridSize-2; y++)
		{
			grid.markCell(2,y, markMaps);
		}

		for (int j=2; j<gridSize-2; j++)
		{
			grid.markCell(j, gridSize-3, markMaps);
		}
		for (int j=3; j<gridSize-2; j++)
		{
			grid.markCell(j,2, markMaps);
		}
		for (int j=3; j<gridSize-2; j++)
		{
			grid.markCell(gridSize-3,j, markMaps);
		}
		grid.unmarkCell(gridSize-5,2, "\u25CC");
	}
	public void newMaze()
	{
		boxLevel();
		for (int x=2; x<gridSize-2; x++)
		{
			grid.markCell(2, x, markMaps);
		}
		for (int x=2; x<gridSize-1; x++)
		{
			grid.markCell(gridSize-3, x, markMaps);
		}
		for (int x=3; x<gridSize-2; x++)
		{
			grid.markCell(x , 3, markMaps);
		}
		for (int x=4; x<gridSize-2; x++)
		{
			grid.markCell(x, gridSize-3, markMaps);
		}
	}

}


