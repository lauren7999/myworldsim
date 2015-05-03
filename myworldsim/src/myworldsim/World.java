package myworldsim;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class World
{
	/*
	 * Class Instance Variables
	 * 
	 */

	private Location[][]	worldMap;
	
	/*
	 * Getters / Setters
	 * 
	 */
	
	public int getWorldWidth()
	{
		return worldMap[0].length;
	}
	
	public int getWorldLength()
	{
		return worldMap.length;
	}

	public Location getWorldLocation(int row, int col)
	{
		return worldMap[row][col];
	}
	
	/*
	 * Class Constants
	 * 
	 */
	
	// int = 4 bytes (2 pow 32 bits = 4 GB) (1 byte = 8 bits)(4 bytes = 32 bits)
	// short = 2 bytes (2 pow 16 bits = 65,536)
	// byte = 1 byte (2 pow 8 bits = 256)
	
	// 800 x 800 	OK - TOOK 30 SECONDS TO LESS THAN 1 MINUTE
	// 1000 X 1000 	TOOK ALMOST 3 MINUTES

	private static final 	WorldDimension 	WORLD_LOCATIONS							= new WorldDimension((short)(800), (short)(800));	// In Locations: 1 level/floor
	public static final 	WorldDimension	WORLD_LOCATION_DIMENSION				= new WorldDimension((short)(1), (short)(1));		// x, y: in inches (x:width, y:length)
	private static final 	String			WORLD_LOCATION_DESCRIPTION				= "World Location ";
	private final			String			WORLD_ARRAY_CREATION_FAILED_MESSAGE 	= "World::World(): World array creation out-of-memory exception.";
	private final			String			WORLD_LOCATION_CREATION_FAILED_MESSAGE 	= "World::World(): World Location creation out-of-memory exception.";
	private final			String			WORLD_EXIT_SETUP_FAILED_MESSAGE 		= "World::World(): World Exits setup out-of-memory exception.";
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public World()
	{
		/*
		 * Create the World Locations
		 * 
		 */
		
		if (createWorldLocations())
		{
			/*
			 * Setup the World Exits
			 * 
			 */
			
			if (setupWorldExits())
			{
				System.out.print("World::World(): World created. ");
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				System.out.println(dateFormat.format(date));			
			}
		}
	}

	/*
	 * Create World Locations Methods
	 * 
	 */
	
	public boolean createWorldLocations() {
		
		boolean locationsCreated = false;
		
		try
		{
			System.out.print("World::World(): Creating the World " + WORLD_LOCATIONS.getWidth() + " x " + WORLD_LOCATIONS.getLength() + " array ... ");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			
			worldMap = new Location[WORLD_LOCATIONS.getWidth()][WORLD_LOCATIONS.getLength()];
			
			try
			{
				System.out.println("World::World(): Creating the World Locations...");
				
				for (short row = 0; row < worldMap.length; row++)
				{
					for (short col = 0; col < worldMap[row].length; col++)
					{
						worldMap[row][col]= new Location(new WorldLocation(row, col), WORLD_LOCATION_DIMENSION, WORLD_LOCATION_DESCRIPTION + row + "," + col, LocationTypes.WORLD);
					}
				}
				
				locationsCreated = true;
			}
			catch (OutOfMemoryError e)
			{		
				System.out.println(WORLD_LOCATION_CREATION_FAILED_MESSAGE);
				
				// Already out of memory, System.exit(0) or using Date causes a second out-of-memory exception. Use return instead.
				//System.exit(0);
			}
			
		}
		catch (OutOfMemoryError e)
		{
			System.out.println(WORLD_ARRAY_CREATION_FAILED_MESSAGE);
			
			// Already out of memory, System.exit(0) or using Date causes a second out-of-memory exception. Use return instead.
			//System.exit(0);
		}
		
		return locationsCreated;
	}
	
	/*
	 * Setup World Exits Method
	 * 
	 */
	
	public boolean setupWorldExits()
	{	
		boolean exitsSetup = false;
		
		try
		{
			System.out.println("Setting up the World exits...");
		 
			// Create the Locations' Exits. Assumes the world is a sphere (Locations at the edges wrap-around).
			for (int row = 0; row < worldMap.length; row++)
			{
				for (int col = 0; col < worldMap[row].length; col++)
				{
					// North
					try
					{
						worldMap[row][col].setExit(Direction.NORTH, worldMap[row - 1][col]);
					}
					catch (Exception e)
					{
						// No Exit to the North. Loop around to the South
						worldMap[row][col].setExit(Direction.NORTH, worldMap[worldMap.length - 1][col]);
					}
					
					// Northeast
					try
					{
						worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[row - 1][col + 1]);
					}
					catch (Exception e)
					{
						if (row - 1 < 0 && col + 1 > worldMap[row].length - 1)
						{
							// No Exit to the NorthEast. Loop around to the SouthWest
							worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][0]);
						}						
						else if (row - 1 < 0)
						{
							// No Exit to the NorthEast. Loop around to the SouthEast
							worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][col + 1]);
						}
						else
						{
							// No Exit to the NorthEast. Loop around to the NorthWest
							worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[row - 1][0]);
						}
					}
					
					// Northwest
					try
					{
						worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[row - 1][col - 1]);
					}
					catch (Exception e)
					{
						if (row - 1 < 0 && col - 1 < 0)
						{
							// No Exit to the NorthWest. Loop around to the SouthEast
							worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[worldMap.length - 1][worldMap[row].length - 1]);
						}
						else if (row - 1 < 0) 
						{
							// No Exit to the NorthWest. Loop around to the SouthWest
							worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[worldMap.length - 1][col - 1]);
						}
						else
						{
							// No Exit to the NorthWest. Loop around to the NorthEast
							worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[row - 1][worldMap[row].length - 1]);
						}
					}
	
					// South
					try
					{
						worldMap[row][col].setExit(Direction.SOUTH, worldMap[row + 1][col]);
					}
					catch (Exception e)
					{
						// No Exit to the South. Loop around to the North
						worldMap[row][col].setExit(Direction.SOUTH, worldMap[0][col]);
					}
	
					// SouthEast
					try
					{
						worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[row + 1][col + 1]);
					}
					catch (Exception e)
					{
						if (row + 1 > worldMap.length - 1 && col + 1 > worldMap[row].length - 1)
						{
							// No Exit to the SouthEast. Loop around to the NorthWest
							worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[0][0]);
						}						
						else if (row + 1 > worldMap.length - 1)
						{
							// No Exit to the SouthEast. Loop around to the NorthEast
							worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[0][col + 1]);
						}
						else
						{
							// No Exit to the SouthEast. Loop around to the SouthWest
							worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[row + 1][0]);
						}
					}
	
					// SouthWest
					try
					{
						worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[row + 1][col - 1]);
					}
					catch (Exception e)
					{
						if (row + 1 > worldMap.length - 1 && col - 1 < 0)
						{
							// No Exit to the SouthWest. Loop around to the NorthEast
							worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[0][worldMap[row].length - 1]);
						}
						else if (row + 1 > worldMap.length - 1)
						{
							// No Exit to the SouthWest. Loop around to the NorthWest
							worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[0][col - 1]);
						}
						else
						{
							// No Exit to the SouthWest. Loop around to the SouthEast
							worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[row + 1][worldMap[row].length - 1]);
						}
					}
					
					// East
					try
					{
						worldMap[row][col].setExit(Direction.EAST, worldMap[row][col + 1]);
					}
					catch (Exception e)
					{
						// No Exit to the East. Loop around to the West
						worldMap[row][col].setExit(Direction.EAST, worldMap[row][0]);
					}
					
					// West
					try
					{
						worldMap[row][col].setExit(Direction.WEST, worldMap[row][col - 1]);
					}
					catch (Exception e)
					{
						// No Exit to the West. Loop around to the East
						worldMap[row][col].setExit(Direction.WEST, worldMap[row][worldMap[row].length - 1]);
					}
					
					// Up (NOWHERE)
					worldMap[row][col].setExit(Direction.UP, new Location());					
					
					// Down (NOWHERE)
					worldMap[row][col].setExit(Direction.DOWN, new Location());					
				}
			}
			
			exitsSetup = true;
		}
		catch (OutOfMemoryError e)
		{
			System.out.println(WORLD_EXIT_SETUP_FAILED_MESSAGE);
			
			// Already out of memory, System.exit(0) or using Date causes a second out-of-memory exception. Use return instead.
			//System.exit(0);
		}
		
		return exitsSetup;
	}
	
	/*
	 * Create Location Exits Method
	 * 
	 */
	
	public boolean createLocationExits(Location location)
	{	
		boolean exitsCreated = false;
		
		try
		{
			System.out.println("Creating the Location " + location.getDescription() + " exits...");
		 
			// North
			try
			{
				location.setExit(Direction.NORTH, worldMap[location.getLocation().getY() - 1][location.getLocation().getX()]);
			}
			catch (Exception e)
			{
				// No Exit to the North. Loop around to the South
				location.setExit(Direction.NORTH, worldMap[worldMap.length - 1][location.getLocation().getX()]);
			}
			
			// Northeast
			try
			{
				location.setExit(Direction.NORTHEAST, worldMap[location.getLocation().getY() - 1][location.getLocation().getX() + 1]);
			}
			catch (Exception e)
			{
				if (location.getLocation().getY() - 1 < 0 && location.getLocation().getX() + 1 > worldMap[location.getLocation().getY()].length - 1)
				{
					// No Exit to the NorthEast. Loop around to the SouthWest
					location.setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][0]);
				}						
				else if (location.getLocation().getY() - 1 < 0)
				{
					// No Exit to the NorthEast. Loop around to the SouthEast
					location.setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][location.getLocation().getX() + 1]);
				}
				else
				{
					// No Exit to the NorthEast. Loop around to the NorthWest
					location.setExit(Direction.NORTHEAST, worldMap[location.getLocation().getY() - 1][0]);
				}
			}
			
			// Northwest
			try
			{
				location.setExit(Direction.NORTHWEST, worldMap[location.getLocation().getY() - 1][location.getLocation().getX() - 1]);
			}
			catch (Exception e)
			{
				if (location.getLocation().getY() - 1 < 0 && location.getLocation().getX() - 1 < 0)
				{
					// No Exit to the NorthWest. Loop around to the SouthEast
					location.setExit(Direction.NORTHWEST, worldMap[worldMap.length - 1][worldMap[location.getLocation().getY()].length - 1]);
				}
				else if (location.getLocation().getY() - 1 < 0) 
				{
					// No Exit to the NorthWest. Loop around to the SouthWest
					location.setExit(Direction.NORTHWEST, worldMap[worldMap.length - 1][location.getLocation().getX() - 1]);
				}
				else
				{
					// No Exit to the NorthWest. Loop around to the NorthEast
					location.setExit(Direction.NORTHWEST, worldMap[location.getLocation().getY() - 1][worldMap[location.getLocation().getY()].length - 1]);
				}
			}

			// South
			try
			{
				location.setExit(Direction.SOUTH, worldMap[location.getLocation().getY() + 1][location.getLocation().getX()]);
			}
			catch (Exception e)
			{
				// No Exit to the South. Loop around to the North
				location.setExit(Direction.SOUTH, worldMap[0][location.getLocation().getX()]);
			}

			// SouthEast
			try
			{
				location.setExit(Direction.SOUTHEAST, worldMap[location.getLocation().getY() + 1][location.getLocation().getX() + 1]);
			}
			catch (Exception e)
			{
				if (location.getLocation().getY() + 1 > worldMap.length - 1 && location.getLocation().getX() + 1 > worldMap[location.getLocation().getY()].length - 1)
				{
					// No Exit to the SouthEast. Loop around to the NorthWest
					location.setExit(Direction.SOUTHEAST, worldMap[0][0]);
				}						
				else if (location.getLocation().getY() + 1 > worldMap.length - 1)
				{
					// No Exit to the SouthEast. Loop around to the NorthEast
					location.setExit(Direction.SOUTHEAST, worldMap[0][location.getLocation().getX() + 1]);
				}
				else
				{
					// No Exit to the SouthEast. Loop around to the SouthWest
					location.setExit(Direction.SOUTHEAST, worldMap[location.getLocation().getY() + 1][0]);
				}
			}

			// SouthWest
			try
			{
				location.setExit(Direction.SOUTHWEST, worldMap[location.getLocation().getY() + 1][location.getLocation().getX() - 1]);
			}
			catch (Exception e)
			{
				if (location.getLocation().getY() + 1 > worldMap.length - 1 && location.getLocation().getX() - 1 < 0)
				{
					// No Exit to the SouthWest. Loop around to the NorthEast
					worldMap[location.getLocation().getY()][location.getLocation().getX()].setExit(Direction.SOUTHWEST, worldMap[0][worldMap[location.getLocation().getY()].length - 1]);
				}
				else if (location.getLocation().getY() + 1 > worldMap.length - 1)
				{
					// No Exit to the SouthWest. Loop around to the NorthWest
					location.setExit(Direction.SOUTHWEST, worldMap[0][location.getLocation().getX() - 1]);
				}
				else
				{
					// No Exit to the SouthWest. Loop around to the SouthEast
					location.setExit(Direction.SOUTHWEST, worldMap[location.getLocation().getY() + 1][worldMap[location.getLocation().getY()].length - 1]);
				}
			}
			
			// East
			try
			{
				location.setExit(Direction.EAST, worldMap[location.getLocation().getY()][location.getLocation().getX() + 1]);
			}
			catch (Exception e)
			{
				// No Exit to the East. Loop around to the West
				location.setExit(Direction.EAST, worldMap[location.getLocation().getY()][0]);
			}
			
			// West
			try
			{
				location.setExit(Direction.WEST, worldMap[location.getLocation().getY()][location.getLocation().getX() - 1]);
			}
			catch (Exception e)
			{
				// No Exit to the West. Loop around to the East
				location.setExit(Direction.WEST, worldMap[location.getLocation().getY()][worldMap[location.getLocation().getY()].length - 1]);
			}
			
			// Up (NOWHERE)
			location.setExit(Direction.UP, new Location());					
			
			// Down (NOWHERE)
			location.setExit(Direction.DOWN, new Location());					
			
			exitsCreated = true;
		}
		catch (OutOfMemoryError e)
		{
			System.out.println(WORLD_EXIT_SETUP_FAILED_MESSAGE);
			
			// Already out of memory, System.exit(0) or using Date causes a second out-of-memory exception. Use return instead.
			//System.exit(0);
		}
		
		return exitsCreated;
	}
	
	/*
	 * Move Method
	 * 
	 */
	
	public void move()
	{
		
	}
		
	/*
	 * Randomizer Method
	 * 
	 */
	
	private int randomizer(int max) {
		int number = 0;

		Random randomNumber = new Random();

		number = randomNumber.nextInt(max) + 1;
		
		return number;
	}
}
