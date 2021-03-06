class Grid
{
	private final int width, height;
	private String[][] grid;
	String markWith = "\u2620";
	//String coverUp = "\u2E2D";
	String coverUp = ".";
	String staticObject = "\u25A0";

	public Grid(int width_, int height_)
	{
		width = width_;
		height = height_;
		grid = new String[width][height];

		for (int x=0; x<height;x++)
		{
			for(int y=0; y<width;y++)
			{
				grid[x][y] = coverUp;
			}
		}
	}
	public void markCell(int x, int y)
	{
		if (inBounds(x,y))
		{
			grid[x][y] = markWith;
		}
		else
		{
			System.out.println("OUT OF BOUNDS" + " " +"(" + x + ","+ y + ")");
		}
	}
	public void markObject(int x, int y)
	{
		if (inBounds(x,y))
		{
			grid[x][y] = staticObject;
		}
		else
		{
			System.out.println("OUT OF BOUNDS" + " " +"(" + x + ","+ y + ")");
		}
	}
	public void unmarkCell(int x, int y)
	{
		if (inBounds(x,y))
		{
			grid[x][y] = coverUp;
		}
		else
		{
			System.out.println("OUT OF BOUNDS" + " " +"(" + x + ","+ y + ")");
		}
	}
	public Boolean isMarked(int x, int y)
	{
		if (inBounds(x,y))
		{
			return grid[x][y].equals(markWith);
		}
		else
		{
			return true;
		}
	}
	public Boolean isObject(int x, int y)
	{
		if (inBounds(x,y))
		{
			return grid[x][y].equals(staticObject);
		}
		else
		{
			return true;
		}
	}
	private Boolean inBounds(int x, int y)
	{
		if (x < 0 || x >= width || y < 0 || y >= height)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void printGrid()
	{
		for (int x=0; x<width; x++)
		{
			for (int y=0; y<height; y++)
			{
				System.out.print(grid[x][y] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
