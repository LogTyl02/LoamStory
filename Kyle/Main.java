class Main
{
	public static void main(String[] args)
	throws InterruptedException{

		int size, width, height, monstX, monstY;
		int[] newPos;
		monstX = 7;
		monstY = 4;
		size = 30;
		width = size;
		height = size;
		Grid grid = new Grid(height, width);
		//grid.markCell(monstX, monstY);

		grid.markObject(5,3);
		grid.markObject(5,4);
		grid.markObject(5,5);
		grid.markObject(5,6);
		grid.markObject(5,7);
		grid.markObject(5,2);
		grid.markObject(5,1);
		grid.markObject(5,8);
		grid.markObject(6,1);
		grid.markObject(7,1);
		grid.markObject(8,1);
		grid.markObject(9,1);
		grid.markObject(9,2);
		grid.markObject(9,3);
		grid.markObject(9,4);
		grid.markObject(9,5);
		grid.markObject(9,6);
		grid.markObject(9,7);
		grid.markObject(9,8);
		grid.markObject(8,8);
		grid.markObject(6,8);

		Monst myMonster = new Monst(monstX, monstY, height,width, grid);

		while (true)
		{
			//System.out.println("\u07DB");
			Thread.sleep(500);
			System.out.println("\033[2J");
			newPos = myMonster.modeWonder();
			grid.markCell(newPos[0], newPos[1]);
			grid.printGrid();
			grid.unmarkCell(newPos[0], newPos[1]);
		}

	}
}
