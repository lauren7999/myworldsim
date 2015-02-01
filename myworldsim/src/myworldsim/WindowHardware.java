package myworldsim;

public class WindowHardware 
{

	/*
	 * Class Instance Variables
	 */
	private int     			hardwareType;
	private int     			hardwareLockType;
	private boolean 			hardwareLatched;
	private boolean 			hardwareLocked;
	private boolean 			hardwareBroken;
	
	private DoorKey hardwareKeyHole;
	
	
	/*
	 * 
	 * Class Constants
	 */
	
         //Hardware Type
	
		static final int 					 WINDOW_BAY_TYPE     = 0;
		private static final int 			 WINDOW_SLIDE_TYPE   = 1;
		private static final int		     WINDOW_HUNG_TYPE    = 2;
		private static final int			 WINDOW_HINGE_TYPE   = 3;
		
		
		//lock type
		public static final int    NO_LOCK_TYPE            = 0;     //can not be locked
		public static final int    LEVER_LOCK_TYPE         = 1;    //locked on outside
		
		
		public static final boolean BROKEN                 = true;
	
	/*
	 * Getters and Setters
	 */
		
		public int getType()
		{
			return hardwareType;
			
		}
		
		public boolean canOpen()
		{
			return hardwareBroken;
		}
		
	
		
		public int getInsideLockType()
		{
			return hardwareLockType;
		}
		
		
		public boolean canLockFromInside ()
		{
			return hardwareLockType !=NO_LOCK_TYPE;
		}

		
	
		public boolean isLatched()
		{
			return hardwareLatched;
		}
		
		
		
		public boolean isLocked()
		{
			return hardwareLocked;
		}
	
		public boolean isBroken()
		{
			return hardwareBroken;
		}
		
		public void setBroken()
		{
			hardwareBroken   = true;
			hardwareLatched  = false;
			hardwareLocked   = false;
		}
		
		
		
	/*
	 * 
	 * Constructors
	 */
	
	//desgned to be open
	
	
	public WindowHardware()
	{

		hardwareType                = WINDOW_BAY_TYPE;
		hardwareLockType            = NO_LOCK_TYPE;
		hardwareLatched             = false;
		hardwareLocked              = false;
	    hardwareBroken              = false;
		
	}
	
	public WindowHardware(int type, int LockType)
	{
		hardwareType            = type;
		hardwareLockType        = LockType;
		hardwareLatched       	= true;
		hardwareLocked        	= false;
		hardwareBroken       	= false;
	}
	
	
	
	public WindowHardware(int type, int lockType, int outsideLockType)
	{		
		hardwareType              = type;
		hardwareLockType    	  = lockType;
		
		if (outsideLockType == LEVER_LOCK_TYPE)
		{
			hardwareKeyHole = new DoorKey();
		}
	}
	
	
	/*
	 * 
	 * Action Methods
	 */
	
		public boolean latch()
		{
			if(!isBroken())
			{
				hardwareLatched = false;
			}
			return hardwareLatched;
		}
		public boolean unLatch()
		{
			boolean unLatched = false;
			
			if (!isBroken() && !isLocked())
			{
				hardwareLatched = false;
				unLatched = true;
			}
			
			return unLatched;
			
		}
		public boolean lock()
		{
			if (!isBroken() & lock() && !isLocked()) //if it is not broken it may be locked from inside and is not locked then lock
			{
				hardwareLocked = true;
			}
				return hardwareLocked;
		}
		
		
		public boolean unlock()
		{
			boolean unlocked = false;
			
			if (!isBroken() && lock() && isLocked())
			{
				hardwareLocked = false;
				unlocked = true;
				
			}
			return unlocked;
		}
		
		
	
	
}

