package myworldsim;

import java.awt.Dimension;


public class Location 
{

	/*
	 * Class Instance Variables
	 */
	private WorldLocation                         location;             //Where it is; world location coordinates: X, Y
	private LocationTypes                        locationTypes;         //initially, when a location is created it is a world-type location     
	private String                               locationDescription;  //Initially, when a location is created it is described as a world-type location
	private Exit[]                               locationExits;       //one-way exits: inside direction is NOWHERE, such as Emergency Exits

	
	
	
	
	/*   
	 * Class Constants
	 */
	

	
	/*
	 * Constructor Method
	 */
	
	public Location()
	{
		//a location is NOWHERE if its WorldLocation is null
		
		location                   = null;
		LocationTypes locationType = LocationTypes.BLOCKED;
		locationDescription        = null;
		locationExits              = null;
	}
	public Location(WorldLocation loc, WorldDimension dimension, String description, LocationTypes type) //where, how big am i, and then description of location i am in (now filled in until decided waht is in the location)
	{
		location                    = loc;
		locationDescription         = description;
		
		
		
		//Do not create an exit for nowhere
		locationExits               = new Exit[Direction.values().length-1];
	
	}

	
	/*
	 * Getters
	 */

	public WorldLocation getLocation()
	{
		return location;
	}

	public String getLocationDescription() 
	{
		return locationDescription;
	}
	public LocationTypes  getType()
	{
		return locationTypes;
	}
	public Exit getExit(Direction direction) 
	{
		return locationExits(direction.ordinal() - 1);
	}


	private Exit locationExits(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * Setters
	 * 
	 */
	public void setDescription(String description)
	{
		locationDescription = description;
	}
	
	public void setType(LocationTypes type)
	{
		locationTypes = type;
	}
	
	public void setExit(Direction direction, Location location )
	{
		locationExits[direction.ordinal()].setLocation(location);
	}
	
	/*
	 * Action Methods
	 * 
	 */
	public void build(LocationTypes type)
	{
		locationTypes = type;
	}
	public Exit getExit(int ordinal) {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDimesion() {
		// TODO Auto-generated method stub
		return null;
	}


}
