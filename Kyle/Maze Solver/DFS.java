
class DFS
{
	Grid grid;
	int size;
	String wallSymbol = "\u25A0";
	String visitedSymbol = "\u2E2A";

	DFS(Grid grid_, int size_)
	{
		grid = grid_;
		size = size_;
	}
	// Valid moves are == not a previously visited location OR a wall (not counting a pop off stack)
	// Grid DFS algorithm, using x as the up/down axis and y as the left/right axis
	// A method to check each direction
	// in this order...Right, Down, Left, Up

	// 1. if right check is not a valid move, check down
	// 2. if down is not a valid move, check left
	// 3. if left is not a valid move, check up
	// 4. if up is not a valid move, pop from stack and repeat 1-4 until finding a valid move
	// never unmark the grid, only pop from the stack

	// any time you have a valid move,
	// mark position on the grid, and push position onto the stack
	public int[] checkDepth(int x, int y)
	{
		// isMarked just checks if its been there, is object checks if its a wall
		int[] values = new int[size*size];

		int checkRightX = x;
		int checkRightY = y+1;

		int checkDownX = x+1;
		int checkDownY = y;

		int checkLeftX = x;
		int checkLeftY = y-1;

		int checkUpX = x-1;
		int checkUpY = y;

		if (!(grid.isMarked(checkRightX,checkRightY, wallSymbol) || grid.isMarked(checkRightX,checkRightY, visitedSymbol)))
		{
			y++;
		}
		else if (!(grid.isMarked(checkDownX, checkDownY, wallSymbol) || grid.isMarked(checkDownX, checkDownY, visitedSymbol)))
		{
			x++;
		}
		else if (!(grid.isMarked(checkLeftX, checkLeftY, wallSymbol) || grid.isMarked(checkLeftX, checkLeftY, visitedSymbol)))
		{
			y--;
		}
		else if (!(grid.isMarked(checkUpX, checkUpY, wallSymbol) || grid.isMarked(checkUpX, checkUpY, visitedSymbol)))
		{
			x--;
		}
		else //means no available moves
		{
			x = -10;
			y = -10;
		}
		values[0] = x;
		values[1] = y;
		return values;
	}
}

