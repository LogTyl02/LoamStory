/*
	REMINDER -- put notes when ready
*/
class Main
{
	public static void main(String[] args)
	throws InterruptedException
	{
		// initial variables to construct instances

		int size, x ,y, startingX, startingY, width,height;
		int[] test, positions, newPos;
		size = 50;
		height = size;
		width = size;
		String markGrid, markBot, markWall, visitedSpot;
		markGrid = "\u25Cc";
		markBot = "\u263B";
		markWall = "\u25A0";
		visitedSpot = "\u2E2A";
		startingX = 1;
		startingY = 1;

		Grid grid = new Grid(height, width, markGrid);
		Stacks st = new Stacks(size);
		DFS search = new DFS(grid, size);
		Maps pickMaps = new Maps(grid, size, markWall);
		//pickMaps.myMaze();
		//pickMaps.boxLevel();
		pickMaps.randomSpots();
		//pickMaps.newMaze();
		/*
		st.push(2,2);
		x = st.positionToMarkX();
		y = st.positionToMarkY();
		grid.markCell(x,y, markBot);
		grid.printGrid();
		grid.unmarkCell(x,y, markGrid);

		st.push(2,3);
		x = st.positionToMarkX();
		y = st.positionToMarkY();
		grid.markCell(x,y, markBot);
		grid.printGrid();
		grid.unmarkCell(x,y, markGrid);
		grid.printGrid();
		*/

		//int[] win = {size-2, size-2};
		x = 1;
		y = 1;
		boolean running = true;
		while (true)
		{
			Thread.sleep(100);
			System.out.println("\033[2J");
			positions = search.checkDepth(x,y);
			if (positions[0] == -10)
			{
				System.out.println("NO MOVES");
				newPos = st.pop();
				x = newPos[0];
				y = newPos[1];
			}
			else
			{
				x = positions[0];
				y = positions[1];
				st.push(x,y);
			}

			grid.markCell(x,y, markBot);
			grid.printGrid();
			grid.unmarkCell(x,y, visitedSpot);
			st.pointer();
			/*
			if (x == win[0] && y == win[1])
			{
				//System.out.println("MAZE COMPLETED");
				break;
			}
			*/
		}
	}
}
