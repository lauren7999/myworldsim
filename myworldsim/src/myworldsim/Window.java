package myworldsim;

public class Window 
{

	/*
	 * Class Instance Variables
	 */
	
	private Location           windowLocation;
	private Direction          windowEntryDirection;
	private Direction          windowExitDirection;
	private Direction          windowLookInDirection;
	private Direction          windowLookOutDirection;
	private WindowHardware     windowHardware; //object-oriented programming principle: composition: the window HAS a WindowHardware, using the WindowHardware class
	private boolean            windowCanLookIn;
	private boolean            windowCanLookOut;
	
	
	
	/*
	 * Class constants
	 */
	
	/*
	 * Constructors
	 */
	
	public Window(int type, int lockType, Location location, String locationDescription, Direction  entryDirection, Direction exitDirection, Direction lookInDirection , Direction lookOutDirection)
	{
		windowLocation.setType(LocationTypes.WINDOW);
		windowLocation.setDescription(locationDescription);
		
		//redefineworld Loccation exits
		for (int direction = 0; direction < Direction.values().length; direction++)
		{
			//set each exit to lead to NOWHERE
			windowLocation.getExit(Direction.values()[direction].ordinal()).setLocation(new Location());
		}
	
		//check if window cannot be opened b/c it is a bay window
		if (type == WindowHardware.WINDOW_BAY_TYPE)
		{
			windowHardware = new WindowHardware();
			
			windowEntryDirection = Direction.NOWHERE;
			windowExitDirection  = Direction.NOWHERE;
		}
		
		//check if window is broken
		else if ((entryDirection == Direction.NOWHERE && exitDirection == Direction.NOWHERE))
		{
			
			
			windowHardware = new WindowHardware(type, lockType);
			
			
			windowHardware.unLatch();
			windowHardware.setBroken();
		}
		
		//normal window type
		else
		{
			windowHardware = new WindowHardware(type, lockType);
			
			windowEntryDirection = entryDirection;
			windowExitDirection  = exitDirection;
		}

		Location windowEntryLocation       = windowLocation.getExit(windowEntryDirection.ordinal()).getExitToLocation();
		Location windowExitLocation        = windowLocation.getExit(windowExitDirection.ordinal()).getExitToLocation();
		
		windowLocation.getExit(entryDirection.ordinal()).setLocation(windowEntryLocation);
		windowLocation.getExit(exitDirection.ordinal()).setLocation(windowExitLocation);
		
	
	}
	
	/*
	 * getters
	 */
	
	public boolean isWindowOpen()
	{
		
		return !windowHardware.isLatched();
	}


	public boolean canWindowLock()
	{
		
		return windowHardware.canLockFromInside();
	}
	
	
	public  Direction lookInDirection()
	{
		return windowLookInDirection;
	}
	
	public  Direction lookOutDirection()
	{
		return windowLookOutDirection;
	}

	
	
	/*
	 * 
	 * Other methods
	 */
	
	public boolean openWindow()
	{
		
		boolean windowOpened= false;
		
		if (windowHardware.canOpen() && windowHardware.isLatched())
		{
			windowHardware.unLatch();
			windowOpened = true;
		}
		return windowOpened;
	}
	
	public boolean closeWindow()
	{
		boolean windowClosed = false;
		
		if (windowHardware.canOpen() && windowHardware.isLatched())
		{
			windowHardware.latch();
			windowClosed = false;
		}
		return windowClosed;
	}
	
	public boolean unlockWindow()
	{
		boolean windowLocked = false;
		if (windowHardware.lock() && windowLocked)
		{
			windowLocked = false;
		}
		return windowLocked;
	}
	
	//break window with?????
	public boolean breakWindow()
	{
		boolean windowBroken = false;
		//break with what???? Enum??  HOW much force you exert on the window itself??? randomize amount of force??? 
		//googe resedential building code
		// MPa of the window glass
		//and force used to throw object against window
		//use untempered glass for old house windows, and tempered glass for new houses
		 return windowBroken;
	}
	
	public boolean jumpIn()
	{
		boolean canJump = false;
		if (windowEntryDirection != Direction.NOWHERE && !windowHardware.isLatched())
		{
			canJump = true;
		}
		return canJump;
	}
	
	public boolean jumpOut()
	{
		boolean canJump = false;
		if (windowExitDirection != Direction.NOWHERE && !windowHardware.isLatched())
		{
			canJump = true;
		}
		return canJump;
	}
}
