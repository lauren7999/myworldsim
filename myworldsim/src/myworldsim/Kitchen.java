package myworldsim;
import java.awt.Dimension;

public class Kitchen extends Room
{
	/*
	 * Class Instance Variables
	 */
	private int numberOfSinks;
	private int numberofStoves;
	private int numberofTables;
	private int numberofFridges;
	private int numberofCabinets;
	
	
	
	/*
	 * Class Constants
	 */
	
	public static final WorldDimension DEFAULT_KITCHEN_DIMENSION      = new WorldDimension(4,2,1);   
	private final int                  DEFAULT_KITCHEN_SINKS      = 1;
	private final int                  DEFAULT_KITCHEN_STOVES     = 1;
	private final int                  DEFAULT_KITCHEN_TABLES     = 1;
	private final int                  DEFAULT_KITCHEN_FRIDGES    = 1;
	private final int DEFAULT_KITCHEN_CABINETS   = 1;
	
	/*
	 * Constructor Method
	 */
	public Kitchen(WorldDimension location)
	{
		super(location, DEFAULT_KITCHEN_DIMENSION);

		numberOfSinks      = DEFAULT_KITCHEN_SINKS;
		numberofStoves     = DEFAULT_KITCHEN_STOVES;
		numberofTables     = DEFAULT_KITCHEN_TABLES;
		numberofFridges    = DEFAULT_KITCHEN_FRIDGES;
		numberofCabinets   = DEFAULT_KITCHEN_CABINETS; 
	}
	
	public Kitchen(WorldDimension location, WorldDimension locationDimension, String description, int sinks, int stoves, int tables, int fridges, int cabinets)
	{
		super(location, locationDimension, description);
		
		numberOfSinks      = sinks;
		numberofStoves     = stoves;
		numberofTables     = tables;
		numberofFridges    = fridges;
		numberofCabinets   = cabinets;
	}
	
	
}
