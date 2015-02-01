package myworldsim;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class World 
{
	
	/*
	 * Class Instance Variables
	 */
	
	private Location[][]   worldMap;
	
	/*
	 *   private NukeTree[]    nukeTrees; 
	 *    private WolfTree[]    wolfTrees;
	 */
	
	// int = 4 bytes (2 pow 32 = 4 GB) (1 byte = 8 bits)(4 bytes = 32 bits)
	//short = 2 bytes (2 pow 16 bits = 65,356)
	// byte = 1 byte(2 pow 8 bits = 256) 
	private static  final   WorldDimension                 WORLD_LOCATIONS                            = new WorldDimension((short)(800), (short)(800));  //in locations: 1 level/floor
	public  static  final   WorldDimension                 WORLD_LOCATION_DIMENSION                   = new WorldDimension((short)(1), (short)(1));  //x,y,z:inches (x: width, y: length, z:height)
	private static  final   String                         WORLD_LOCATION_DESCRIPTION                 = "World Location";
	private final           String                         WORLD_ARRAY_CREATION_FAILED_MESSAGE        = "World::World(): World array creation out-of memory exception.";
	private final           String                         WORLD_LOCATION_CREATION_FAILED_MESSAGE     = "World::World(): World exits creatio out-of memory excepttion.";
	private final           String                         WORLD_EXIT_CREATION_FAILED_MESSAGE         = "World::World(): World exits creation out-of memory exception."; 

	private int width;
	
	/*
	 * Class Constants
	 * 
	 */
	/*
		private final int       NUMBER_OF_NUKE_TREES            = 200;
		private final int       NUMBER_OF_BRANCHES              = 20;
		private final int       NUMBER_OF_ROOTS                 = 30;
		private final int       NUMBER_OF_SILOS                 = 20;
		private final int       NUMBER_OF_MISSLES               = 340;
		private final int       NUMBER_OF_WOLF_TREES            = 100;
		private final int       NUMBER_OF_ROOMS                 = 10;
		private final int       NUMBER_OF_WOLVES                = 100;
		
	/*
	 * Constructor Method
	 * 
	 */

		public World()
		{
			
			/*
			 * Create World Locations and their exits
			 */
			try {
				
			
			System.out.print("Creating the world as" + WORLD_LOCATIONS.getWidth() + "x" + WORLD_LOCATIONS.getLength() + "...");
			DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
						
				worldMap = (Location[][]) new Location[WORLD_LOCATIONS.getWidth()][WORLD_LOCATIONS.getLength()];
			}
			
			catch (OutOfMemoryError e) 
			{
				System.out.print("World::World(): World array creation out-of memory exception...");
				//already out of memory, System.exit(0) causes a second out of memory exception. use return instead
				//System.exit(0);
				return;
			}
			
			try {
			System.out.print("World:World(): Creating the World locations....");
			
				for (short row = 0; row < worldMap.length; row++)
				{
					for(short col = 0; col < worldMap[row].length; col++)
					{
						worldMap[row][col] = new Location( new WorldLocation(row, col), WORLD_LOCATION_DIMENSION, WORLD_LOCATION_DESCRIPTION + row + "," + col, LocationTypes.WORLD);
					}
				}	
			}
			catch (OutOfMemoryError e ){
				System.out.print("World creatio out of memory exception...");
				//already out of memory, Ssystem.exit(0) causes a second out of memory exception. use return instead.
				//System.exit(0);
				return;
			}
			
			try
			{
				System.out.println("Creating the World exits...");
				
				//create location exits. assumes world is round
				for (int row=0; row < worldMap.length; row++ )
				{
					//if not at top of the world
					for (int col = 0; col < worldMap[row].length; col++)
					{
						
					
						//north
						try 
						{
							worldMap[row][col].setExit(Direction.NORTH, worldMap[row-1][col]);
						}
						catch (Exception e)
						{
							//no exit to the north.. loop around
							worldMap[row][col].setExit(Direction.NORTH, worldMap[worldMap.length - 1][col]);
						}
						
						//NorthEast
						try
						{
							worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[row-1][col+1]);
						}
						catch (Exception e)
						{
							if (row - 1 < 0 && col + 1 > worldMap[row].length - 1)
							{
								// no exit to the northeast. loop around to the South West
								worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][0]);
							}
							else if (row - 1 <0)
							{
								//no to exit to the northeast. loop around to the SouthEast
								worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[worldMap.length - 1][col + 1]);
							}
							else
							{
								// no exit to the north east. loop around to the north west
								worldMap[row][col].setExit(Direction.NORTHEAST, worldMap[row - 1][01]);
							}
						}
						//North West
						try
						{
							worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[row-1][col-1]);
						}
						catch (Exception e)
						{
							
							if (row - 1 < 0 && col - 1 < 0)
							{
								//no exit to northwest loop around to SouthEast
								worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[worldMap.length - 1][worldMap[row].length - 1]);
							}
							else if (row - 1 < 0)
							{
								// No Exit to the NorthWest. Loop around to the SouthWest
								worldMap[row][col].setExit(Direction.NORTHWEST, worldMap[worldMap[row].length - 1][col - 1]);
								
							}
							else
							{
								//no exit to the northwest. loop around to the SouthWest
								worldMap[row][col].setExit(Direction.SOUTH, worldMap[row + 1][col]);
							}
						}
						
						//South
						try
						{
							worldMap[row][col].setExit(Direction.SOUTH, worldMap [row+1][col]);
						}
						catch (Exception e)
						{
							// no exit to the south. loop around to the northeast
							worldMap[row][col].setExit(Direction.SOUTH, worldMap[0][col]);
						}
							
						
						//SouthEast
						try
						{
							worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[row+1][col+1]);
						}
						catch (Exception e)
						{
							worldMap[row][col].setExit(Direction.SOUTHEAST, worldMap[0][col+1]);
						}
						//South West
						try
						{
							worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[row+1][col-1]);
							
						}
						catch (Exception e)
						{
							worldMap[row][col].setExit(Direction.SOUTHWEST, worldMap[0][col-1]);
						}
						//East
						try
						{
							worldMap[row][col].setExit(Direction.EAST, worldMap[row][col+1]);
						}
						catch (Exception e)
						{
							worldMap[row][col].setExit(Direction.EAST, worldMap[row][0]);
						}
						//West
						try
						{
							worldMap[row][col].setExit(Direction.WEST, worldMap[row][col-1]);
						}
						catch (Exception e)
						{
							worldMap[row][col].setExit(Direction.WEST, worldMap[row][worldMap[row].length -1]);
						}
						//Up
						worldMap[row][col].setExit(Direction.UP, new Location());
						
						//Down (NoWhere)
						worldMap[row][col].setExit(Direction.DOWN, new Location());
				
					}
					
				}	
				
					
			
			System.out.println("World::world():World created.");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println(dateFormat.format(date));
			
			}
			catch (OutOfMemoryError e)
			{
				System.out.println(WORLD_EXIT_CREATION_FAILED_MESSAGE);
				
				//already out of memory, System.exit(0) or using Date causes a second out-of memory exception. use return instead.
				//System.exit(0);
				return;
			}
		
							
							
		/*
		 * Create Nuke Trees
		 *
		nukeTrees = new NukeTree[NUMBER_OF_NUKE_TREES];
		
			for(int index = 0; index < NUMBER_OF_NUKE_TREES; index++)
			{
				int numberOfMissles = randomizer(NUMBER_OF_MISSLES);
				if (numberOfMissles < 10)
				{
					numberOfMissles = 10;
				}
				nukeTrees[index] = new NukeTree(index + 1, NUMBER_OF_BRANCHES,NUMBER_OF_ROOTS,NUMBER_OF_SILOS, numberOfMissles);
			}
			
			/*
			 * Create Wolf trees
			
		wolfTrees= new WolfTree[NUMBER_OF_WOLF_TREES];
			for (int index = 0; index < NUMBER_OF_WOLF_TREES; index++)
			{
				int numberOfWolves = randomizer(NUMBER_OF_WOLVES);
				if (numberOfWolves < 10)
				{
					numberOfWolves = 10;
				}
				wolfTrees[index] = new WolfTree(index + 1, NUMBER_OF_BRANCHES, NUMBER_OF_ROOTS, NUMBER_OF_ROOMS, randomizer(NUMBER_OF_WOLVES), numberOfWolves);
			}
			*/
	}

		/*
		 * Randomizer Method
		 */

		private int randomizer(int max)
		{
			int number = 0;
			Random  randomNumber = new Random();
		
			number = randomNumber.nextInt(max) + 1;
			
			return number;
			
		}
}



