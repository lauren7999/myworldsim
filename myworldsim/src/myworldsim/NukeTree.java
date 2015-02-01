package myworldsim;

public class NukeTree extends Tree
{
	/*
	 * Class Instance Variables
	 */
	
	private int treeNumberofSilos;
	private int treeNumberofMissles;
	
	
	/*
	 * Class Constants
	 */	
	
	private final int DEFAULT_NUMBER_OF_SILOS = 10;
	private final int DEFAULT_NUMBER_OF_MISSLES	 = 340;
	private final int NUMBER_OF_MISLES_PER_BRANCH = 2;
	private final int NUMBER_OF_MISSLES_PER_ROOT = 10;
	
	/*
	 * Contructor Method
	 */

	public NukeTree()
	{
		treeNumberofSilos = DEFAULT_NUMBER_OF_SILOS;
		treeNumberofMissles = DEFAULT_NUMBER_OF_MISSLES;
	}
	public NukeTree(int number, int branches, int roots, int silos, int missles)
	{
		super(number, branches, roots);
		
		treeNumberofSilos = silos;
		treeNumberofMissles = missles;
		
	}
	
	
}


