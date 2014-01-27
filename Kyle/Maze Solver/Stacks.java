public class Stacks
{
	int maxSize, pointsAdded;
	int[][] stack;

	Stacks(int maxSize_)
	{
		maxSize = maxSize_;
		stack = new int[maxSize*maxSize][3];
		pointsAdded = 0;
	}
	void push(int x, int y)
	{

		//System.out.println("Pointer " + pointsAdded);
		//System.out.println("X " + x);
		//System.out.println("Y " + y);
		stack[pointsAdded][0] = x;
		stack[pointsAdded][1] = y;
		stack[pointsAdded][2] = pointsAdded;
		pointsAdded++;
	}
	int[] pop()
	{
		int[] values = new int[2];
		values[0] = stack[pointsAdded-1][0];
		values[1] = stack[pointsAdded-1][1];
		pointsAdded--;
		return values;
	}
	//Must use this with --positionToMarkY() otherwise errors
	int positionToMarkX()
	{
		return stack[pointsAdded-1][0];
	}
	//Must use this with --positionToMarkX() otherwise errors
	int positionToMarkY()
	{
		return stack[pointsAdded-1][1];
	}
	void pointer()
	{
		System.out.println("Current stack size " + pointsAdded);
	}
}
