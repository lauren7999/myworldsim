package myworldsim;

public class Bedroom extends Room

{
	
	
	
	/*
	 * Class Instance Variables
	 */
	
	
	
	/*
	 * 
	 * Class Constants
	 */
	
	
	public static final WorldDimension    DEFAULT_BEDROOM_DIMENSION      =  new WorldDimension(2, 2, 1);  //in locations
	

	/*
	 * Construcotr Method
	 */
	
	public Bedroom(WorldDimension location)
	{
		super(location,DEFAULT_BEDROOM_DIMENSION);
	}

}
