package myworldsim;

public class DoorHardware 
{
	
	/*
	 * Class Instance Variables
	 */
	private int     hardwareType;
	private int     hardwareOutsideLockType;
	private int     hardwareInsideLockType;
	
	
	private boolean hardwareLatched;
	private boolean hardwareKeyInserted;
	private boolean hardwareLocked;
	private boolean hardwareBroken;
	
	private DoorKey hardwareKeyHole;
	
	
	/*
	 * 
	 * Class Constants
	 */
           //Hardware Type
		public static final int    NO_HARDWARE_TYPE       = 0;
		public static final int    KNOB_TYPE              = 1;    //rounded handle
		public static final int    HANDLESET_TYPE         = 2;    // thumb handle
		public static final int    LEVER_TYPE             = 3;    //lever handle
		
		//lock type
		public static final int    NO_LOCK_TYPE            = 0;     //can not be locked
		public static final int    KEY_LOCK_TYPE           = 1;    //locked on outside
		public static final int    KNOB_LOCK_TYPE          = 2;    //locked on the inside
		public static final int    PUSH_LOCK_TYPE          = 3;   //lock n the inside
		
		
		public static final boolean BROKEN                 = true;
	
	/*
	 * Getters and Setters
	 */
		
		public int getType()
		{
			return hardwareType;
			
		}
		
		public int getOutsideLockType()
		{
			return hardwareOutsideLockType;
		}
		
		public int getInsideLockType()
		{
			return hardwareInsideLockType;
		}
		
		public boolean canOpen()
		{
			return !hardwareBroken;
		}
		
		public boolean canLockFromOutside()
		{
			return hardwareOutsideLockType != NO_LOCK_TYPE;
		}
		public boolean canLockFromInside ()
		{
			return hardwareInsideLockType !=NO_LOCK_TYPE;
		}
		public DoorKey getKey()
		{
			return hardwareKeyHole.copyKey(); 
		}
		
		//get hardware status
		
	
		public boolean isLatched()
		{
			return hardwareLatched;
		}
		
		public boolean isKeyInserted()
		{
			return hardwareKeyInserted;
			
		}
		
		
		public boolean isLocked()
		{
			return hardwareLocked;
		}
	
		public boolean isBroken()
		{
			return hardwareBroken;
		}
		
		private boolean turnKey() {
			
			return false;
		}

		public void setBroken()
		{
			hardwareBroken       = true;
			hardwareLatched      = false;
			hardwareKeyInserted  = false;
			hardwareLocked       = false;
		}
	
	/*
	 * 
	 * Constructors
	 */
	
	
	//blank hardware
	public DoorHardware()
	{

		hardwareType              = NO_HARDWARE_TYPE;
		hardwareOutsideLockType   = NO_LOCK_TYPE;
		hardwareInsideLockType    = NO_LOCK_TYPE;
		
		
		
		hardwareLatched             = false;
		hardwareKeyInserted         = false;;
		hardwareLocked              = false;
	    hardwareBroken              = false;
		
	    //avoid using null by creating a BLANK DoorKey object
		hardwareKeyHole             = new DoorKey(DoorKey.BLANK_KEY);
	}
	
	public DoorHardware(int type, int insideLockType, int outsideLockType, boolean locked, boolean latched)
	{
		hardwareType            = type;
		hardwareInsideLockType  = insideLockType;
		hardwareOutsideLockType = outsideLockType;
		
		
		if (outsideLockType == KEY_LOCK_TYPE)
		{
			hardwareKeyHole = new DoorKey();
		}
		
		
		hardwareLatched       = true;
		hardwareKeyInserted   = false;
		hardwareLocked        = false;
		hardwareBroken        = false;
	}
	
	
	
	public DoorHardware(int type, int insideLockType, int outsideLockType)
	{		
		hardwareType              = type;
		hardwareInsideLockType    = insideLockType;
		hardwareOutsideLockType   = outsideLockType;
		
		if (outsideLockType == KEY_LOCK_TYPE)
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
		public boolean lockFromInside()
		{
			if (!isBroken() & canLockFromInside() && !isLocked()) //if it is not broken it may be locked from inside and is not locked then lock
			{
				hardwareLocked = true;
			}
				return hardwareLocked;
		}
		
		public boolean lockFromOutside(DoorKey key)
		{
			if (!isBroken() && canLockFromOutside() && !isLocked())
			{
			if (hardwareOutsideLockType == KEY_LOCK_TYPE)
			{
				if(!isKeyInserted())
					hardwareLocked = true;
					removeKey();
				
				
				}
		
			//if key is already inserted, remove it and insert the new key
			else if (removeKey()) 
			{
				
				hardwareLocked = false;
				
			}
			}
			return hardwareLocked;
		}
			

			
	    
		
		public boolean unlockFromInside()
		{
			boolean unlocked = false;
			
			if (!isBroken() && canLockFromInside() && isLocked())
			{
				hardwareLocked = false;
				unlocked = true;
				
			}
			return unlocked;
		}
		
		public boolean unlockFromOutside(DoorKey key)
		
		{
			boolean unLocked = false;
			
		if (!isBroken() && canLockFromOutside() && isLocked())
		{
			if (hardwareOutsideLockType == KEY_LOCK_TYPE)
			
			{	
					if (insertAndTurnKey(key) && turnKey()) {
						
						hardwareLocked = false;
						unLocked       = true;
						removeKey();
					}	
				}
			else
			{
				hardwareLocked = false;
				unLocked       = true;
			}
			
			}
			return hardwareLocked;
			}
		private boolean insertAndTurnKey(DoorKey key)
		{
			if (hardwareKeyHole.getKeyCode() !=DoorKey.BLANK_KEY && key.getKeyCode() == hardwareKeyHole.getKeyCode())
			{
				// insert the key if a key is not already inserted
				if (!isKeyInserted())
				{
					hardwareKeyInserted = true;
				}
				
				//if a key is already inserted, remove it and insert the new key
				else if (removeKey())
				{
					hardwareKeyInserted = true;
				}
			}
			return hardwareKeyInserted;
		}
		
		private boolean removeKey() {
			
			return false;
		}
		
		
		
	
}
