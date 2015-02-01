package adventureUnitTest;

import myworldsim.Direction;
import myworldsim.Door;
import myworldsim.DoorKey;
import myworldsim.Exit;
import myworldsim.Location;
import myworldsim.LocationTypes;
import myworldsim.World;
import myworldsim.WorldDimension;
import myworldsim.WorldLocation;
  
public class TestDoor 
{
	/*
	 * 
	 * Class Instance Variables
	 */
	
	private Door door;
	
	/*
	 * 
	 * Constructor
	 */
	
	public TestDoor( int hardwareType, int insideLockType, int outsideLockType)
	{
		WorldLocation  doorLocation        = new WorldLocation((short)(0), (short)(1));
		WorldDimension doorDimension       = new WorldDimension((short)(3), (short)(8));
		
		Location location                  = new Location(doorLocation, doorDimension, "front door", LocationTypes.DOOR);
		
		WorldLocation enterCoordinates     = new WorldLocation((short)(2), (short)(1));
		Location enterLocation             = new Location(enterCoordinates, World.WORLD_LOCATION_DIMENSION, "enterance hall", LocationTypes.HALLWAY);
		
		WorldLocation exitCoordinates     = new WorldLocation((short)(0), (short)(1));
		Location exitLocation             = new Location(exitCoordinates, World.WORLD_LOCATION_DIMENSION, "enterance", LocationTypes.ENTRANCE);
		
		Exit enter                        = new Exit(Direction.NORTH, enterLocation);
		Exit exit                         = new Exit(Direction.SOUTH, exitLocation);
		
		door = new Door( location, doorDimension, enter, exit, hardwareType, insideLockType, outsideLockType);
	}
	
	/*
	 * Action Methods
	 */
	
	public void run()
	{
		System.out.println("Opening the door...");
		
		boolean doorOpen = door.open();
		
		if (doorOpen)
		{
			System.out.println("The door is open");
		}
		else
		{
			System.out.println("Can't open the door.");
		}
		
		System.out.println("Getting the key out of my pocket...");
		
		DoorKey key = door.getKey();
		
		//test for a BLANK KEY 
		if (key!=null)
		{
			System.out.println("Found the key.");
			System.out.println("Locking the door from the outside...");
			
			boolean doorLocked = door.lockDoor(key);
			
			if(doorLocked)
			{
				System.out.println("Door is now locked.");
				
			}
			else
			{
				System.out.println("Door cannot be locked.");
			}
				//try to open locked door
			
			System.out.println("Opening the door...");
			doorOpen = door.open();
			
			if (doorOpen)
			{
				System.out.println("The door is now open.");
			}
			else
			{
				System.out.println("Can't open the dor. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. Do you REEALLYY want to open the door?"));
			}
			
			//unlock the door
			
			System.out.println("gettomg tje key out of my pocket...");
			System.out.println("Unlocking the door...");
			
			boolean unLocked = door.unlockDoor(key);
			
			if (unLocked)
			{
				System.out.println("The door is now unlocked");
			}
			
			else
			{
				System.out.println("Can't unlock the door. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. Do you REEALLYY want to open the door?"));
			}
			//unlock the door

			System.out.println("Opening the door...");
			doorOpen = door.open();
			
			if (doorOpen)
			{
				System.out.println("The door is now open.");
			}
			else
			{
				System.out.println("Can't open the dor. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. Do you REEALLYY want to open the door?"));
			}
			
			//lock the door from the inside; how can the game tell if the player is inside or outside the door???????
			
			System.out.println("Locking the door from the inside...");
			
			boolean locked = door.lockDoor();
			
			if (locked)
			{
				System.out.println("door is now locked");
			}
			else
			{
				System.out.println("Can't open the dor. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. PLEASEEEE open the door?"));
			}
			//unlock the door from the outside
			System.out.println("getting the key out of my pocket...");
			System.out.println("Unlocking the door...");
			doorOpen = door.open();
			
			if (doorOpen)
			{
				System.out.println("The door is now unlocked.");
			}
			else
			{
				System.out.println("Can't open the door. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. Do you REEALLYY want to open the door?"));
			}
			
			//lock the door from the outside
			
			System.out.println("Locking the door from the outside...");
			 
			unLocked = door.unlockDoor(key);
			
			if(doorLocked)
			{
				System.out.println("Unlocking the door from the outside.");
				
				unLocked = door.unlockDoor(key);
			
			if(unLocked)
			{
				System.out.println("Door is now unlocked");
				
			}
			else
			{
				System.out.println("Can't open the door. The door is"  + (door.isLocked()? "locked" : door.isBusted()?"busted!" : "blocked, perhaps by a huge Trex. Do you REEALLYY want to open the door?"));
			}
			
			
			//Bust the door open!
		}
		else
			{
				System.out.println("Key cannot be found");
			}
	}
	
}
}
