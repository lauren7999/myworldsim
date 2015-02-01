package myworldsim;

public class Door 
{
	/*
	 * Class Instance Variables
	 */
	private Location          doorLocation;    
	private Direction         doorEntryDirection;
	private Direction         doorExitDirection;
	private DoorHardware      doorHardware;            //object-oriented programming composition: the door HAS a DoorHardware
	
	
	
	/*
	 * 
	 * Constructors
	 */
	
	public Door( int hardwareType, int insideLockType, int outsideLockTypeLocation, Location location, Direction enteryDirection, Direction exitDirection, String locationDescription)
	{
		doorLocation  = location;
		doorLocation.setType(LocationTypes.DOOR);
		Location doorLocationEntry = doorLocation;
		
	}
	
		//Getters
		public DoorKey getKey()
		{
			
			return doorHardware.getKey();
		}
	
	
	/*
	 * 
	 * Action /Set Methods
	 */

	
	public boolean open()
	{
		
	return  doorHardware.unLatch();
		
	}
		
	public boolean close() 
	{
		return doorHardware.latch();
	}
	

	
	public boolean canLock()
	{
		return doorHardware.canLockFromInside() || doorHardware.canLockFromOutside();
	}
	public boolean isBusted() //door is already busted
	{
		 
		
		 return doorHardware.isBroken();
	}
	

	//Object-Oriented Programming: Method overloading: (multiple versions of a method) same method name, DIFFERENT method parameter lists
	
	public boolean isBlocked()
	{
		return doorLocation.getExit(doorEntryDirection.ordinal()).getExitToLocation().getType() == LocationTypes.BLOCKED &&
				doorLocation.getExit(doorEntryDirection.ordinal()).getExitToLocation().getType() == LocationTypes.BLOCKED; 
	}	
				
	public boolean lockDoor(DoorKey key)
	{
		return doorHardware.lockFromOutside(key);
	}
	
	public boolean lockDoor()
	{
		return doorHardware.lockFromInside();
	}
	public boolean unlockDoor(DoorKey key)
	{
		return doorHardware.unlockFromInside();
	}

	public boolean isLocked() {
		
		return false;
	}
	
	public boolean breakDoor()
	{
		boolean doorBroken = false;
		//how much force can you exert on a door? randomize it????@?
		// google "resedential building code for door!!!!
		return doorBroken;
	}

	

	
	
	
	
	
	

	
	



	

}
