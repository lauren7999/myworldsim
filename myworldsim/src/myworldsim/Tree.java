package myworldsim;

public class Tree 
{
	/*
	 * *Class Instance Variables
	 *  
	 */
	private int treeNumber;
	private int treeNumberofBranches;
	private int treeNumberofRoots;
	
	
	/*
	 * *Class Constants
	 * 
	 */
	
	private final int DEFAULT_Number_Of_Branches = 10;
	private final int DEFAULT_Number_Of_Roots    = 50;
	/*
	 * Constructor Method
	 * 
	 */
	
	public  Tree()
	{
		treeNumberofBranches = DEFAULT_Number_Of_Branches;
		treeNumberofBranches = DEFAULT_Number_Of_Branches;
	}
	public Tree(int number, int branches, int roots)
	{
		treeNumber           = number;
		treeNumberofBranches = branches;
		treeNumberofRoots = roots;
	}
	
	
}
