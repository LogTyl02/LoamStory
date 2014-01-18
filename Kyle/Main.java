class Main
{
	public static void main(String[] args)
	throws InterruptedException{

		int size, width, height, monstX, monstY;
		int[] newPos;
		monstX = 4;
		monstY = 4;
		size = 25;
		width = size;
		height = size;
		Grid grid = new Grid(height, width);
		//grid.markCell(monstX, monstY);


		Monst myMonster = new Monst(monstX, monstY, height,width);

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
