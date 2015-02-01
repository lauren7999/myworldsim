package myworldsim;

import java.awt.Dimension;

public class Room extends Location
{
	/*
	 * Class Instance Variables
	 */
	
	//every room may have a Door or Window at some Exits. Randomly decide which exits have doors, windows or no exit (an Exit that leads NOWHERE).
	
	private Window[] roomWindows;
	private Door[]   roomDoors;
	
	
	/*
	 * Class Constants
	 */
	
	public static final WorldDimension     DEFAULT_ROOM_DIMENSION         = new WorldDimension((short)(1), (short)(1));          //in locations
	public static final String             DEFAULT_ROOM_DESCRIPTION       = "This is a comfy room for your creatures to use!";
	public static final int                DEFAULT_ROOM_WINDOWS           = 1;
	
	/*
	 * Constructor Method
	 */
	
	public Room(WorldDimension location, WorldDimension locationDimension)
	{
		super(location, location Dimension,  DEFAULT_ROOM_DESCRIPTION, LocationTypes.ROOM);
		roomWindows = new Window[DEFAULT_ROOM_WINDOWS];
	}
	
	public Room(WorldDimension location, WorldDimension locationDimension, String description)
	{
		super (location, locationDimension, description, LocationTypes.ROOM);
		roomWindows = new Window[windows];
	}
}
