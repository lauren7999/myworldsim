package myworldsim;

public class WolfTree extends Tree
{
	/*
	 * Class Instance Variables
	 */
	
	private static final int NUMBER_OF_GUNS_PER_ROOM = 0;
	private int treeNumberofWolves;
	private int treeNumberofRooms;
	private int treeNumberofGuns;
	
	
	/*
	 * Class Constants
	 */	
	
	private final int DEFAULT_NUMBER_OF_WOLVES = 30;
	private final int DEFAULT_NUMBER_OF_ROOMS	 = 10;
	private final int DEFAULT_NUMBER_OF_WOLVES_PER_ROOM = 3;
	private final int DEFAULT_NUMBER_OF_GUNS     = 3;
	
	/*
	 * Contructor Method
	 */

	public WolfTree()
	{
		treeNumberofWolves = DEFAULT_NUMBER_OF_WOLVES;
		treeNumberofRooms = DEFAULT_NUMBER_OF_ROOMS;
	}
	public WolfTree(int number, int branches, int roots, int rooms, int wolves, int guns)
	{
		super(number, branches, roots);
		
		treeNumberofRooms = rooms;
		treeNumberofWolves = wolves;
		treeNumberofGuns = NUMBER_OF_GUNS_PER_ROOM * treeNumberofRooms;
		
	}
	
	
}


