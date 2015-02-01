package myworldsim;

public class Exit 
{
	/* 
	 * Class instance variables
	 */
	
	private Direction    exitDirection;
	private Location     exitToLocation;
	
	/*
	 * Class Constants
	 */
	
	
	/*
	 * Constructor method
	 */
	
	
	
	public Exit(Direction direction, Location location)
	{
		//one-way exits: inside direction is NOWHERE, such as Emergency Exits
		exitDirection    = direction;
		exitToLocation     = location;
	}


/*
 * Getters
 */

	public Direction getExitDirection() {
		return exitDirection;
	}

	public Location getExitToLocation() {
		return exitToLocation;
	}


	public void setLocation(Location location) {
		// TODO Auto-generated method stub
		
	}



}

