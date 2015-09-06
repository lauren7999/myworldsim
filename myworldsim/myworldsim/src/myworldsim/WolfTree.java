package myworldsim;

import java.util.List;

public class WolfTree extends TreeModel
{
	/*
	 * Class Instancce Variables
	 * 
	 */
	private List<Room>              rooms;
	private List<Wolf>              wolves;
	private List<Weapon>            machineGuns;
	
	/*
	 * Class constants
	 * 
	 */
	
	private final int    MAX_NUMBER_OF_ROOMS                 = 30;
	private final int    MAX_NUMBER_OF_WOLFS                 = 150; //5 per room
	private final int    DEFAULT_NUMBER_OF_ROOMS             = 10;
	private final int    DEFAULT_NUMBER_OF_WOLVES            = 30;
	private final int    NUMBER_OF_WOLVES_PER_ROOM           = 3;
	private final int    NUMBER_OF_MACHINEGUNS_PER_ROOM      = 3;
	private final int    DEFAULT_NUMBER_OF_MACHINE_GUNS      = 10;
	
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public WolfTree()
	{
		rooms		= DEFAULT_NUMBER_OF_ROOMS;
		wolves		= DEFAULT_NUMBER_OF_WOLVES;
		machineGuns  = DEFAULT_NUMBER_OF_MACHINE_GUNS;
	}
	
	public WolfTree(int number, int branches, int roots, int rooms, int wolves)
	{
		super(number, branches, roots);
		
		rooms 	 	= rooms;
		wolves 	 	= wolves;
		machineGuns = NUMBER_OF_MACHINEGUNS_PER_ROOM ;
	}
}
