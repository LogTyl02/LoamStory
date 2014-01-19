class Main
{
	public static void main(String[] args)
	throws InterruptedException{

		int size, width, height, monstX, monstY;
		int[] newPos;
		monstX = 7;
		monstY = 4;
		size = 25;
		width = size;
		height = size;

		Grid grid = new Grid(height, width);
		Maps pickMap = new Maps(grid, size);
		Monst myMonster = new Monst(monstX, monstY, height,width, grid);
		//pickMap.firstMapEver();
		pickMap.boxLevel();
		pickMap.randomSpots();

		while (true)
		{
			Thread.sleep(50);
			System.out.println("\033[2J");
			newPos = myMonster.modeWonder();
			grid.markCell(newPos[0], newPos[1]);
			grid.printGrid();
			grid.unmarkCell(newPos[0], newPos[1]);
		}

	}
}
