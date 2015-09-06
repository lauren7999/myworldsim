package myworldsim;

public class WitchHouse
{
	
	/*
	 * Class Instancce Variables
	 * 
	 */
	private int rooms;
	private int wolves;
	private int machineGun;
	
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
	 * Constructors
	 * 
	 * 
	 */
	public WitchHouse() 
	{
		rooms        = DEFAULT_NUMBER_OF_ROOMS;
		wolves       = DEFAULT_NUMBER_OF_WOLVES;
	}
	
	public WitchHouse(int number, int branches, int roots, int rooms, int wolves) 
	{
		super();
		
		rooms        = rooms;
	}

}
