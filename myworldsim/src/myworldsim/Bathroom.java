package myworldsim;



public class Bathroom extends Room
{
	/*
	 * Class Instance Variables
	 */

	private int numberOfSinks;
	private int numberofShowers;
	private int numberofToilets;
	private int numberofMirrors;
	private int numberofCabinets;
	
	
	
	/*
	 * Class constants
	 */
	
	public static final WorldDimension DEFAULT_BATHROOM_DIMENSION     = new WorldDimension(1,1,1);   //width x height =s. feet
	
	private final int DEFAULT_BATHROOM_SINKS      =  1;
	private final int DEFAULT_BATHROOM_SHOWERS    =  1;
	private final int DEFAULT_BATHROOM_TOILETS    =  1;
	private final int DEFAULT_BATHROOM_MIRRORS    =  1;
	private final int DEFAULT_BATHROOM_CABINETS   =  2;
	
	
	
	
	
	/*
	 * Constructor method
	 * 
	 */
	
	public Bathroom(WorldDimension location)
	{
		super(location, DEFAULT_BATHROOM_DIMENSION);
		
		numberOfSinks      = DEFAULT_BATHROOM_SINKS;
		numberofShowers    = DEFAULT_BATHROOM_SHOWERS;
		numberofToilets    = DEFAULT_BATHROOM_TOILETS;
		numberofMirrors    = DEFAULT_BATHROOM_MIRRORS;
		numberofCabinets   = DEFAULT_BATHROOM_CABINETS;
	}
	
	public Bathroom(WorldDimension location, WorldDimension locationDimension, String description, int sinks, int showers, int toilets, int mirrors, int cabinets)
	{
		super(location, locationDimension, description);
		
		numberOfSinks      = sinks;
		numberofShowers    = showers;
		numberofToilets    = toilets;
		numberofMirrors    = mirrors;
		numberofCabinets   = cabinets;
	}
}

