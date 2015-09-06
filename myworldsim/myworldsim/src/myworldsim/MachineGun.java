package myworldsim;

enum class MachineGun;

public class MachineGun extends Gun
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private int             weaponType;
	private int				machineGunMount;
	
	/*
	 * Class Constants
	 * 
	 */
	
	// Defaults for a hand gun
	
	private final int		BIPOD_MOUNT						= 1;
	private final int		TRIPOD_MOUNT					= 2;
	private final int		BOLTED_MOUNT					= 3;
	private final int		SURFACE_MOUNT					= 4;
	
	private final int		DEFAULT_MACHINE_GUN_MOUNT		= BIPOD_MOUNT;
	private final double	DEFAULT_MACHINE_GUN_CALIBER		= 30;
	private final int		DEFAULT_MACHINE_GUN_WEIGHT		= 30;
	private final int		DEFAULT_MACHINE_GUN_AMMO		= 250;
	private final int		DEFAULT_MACHINE_GUN_RPM			= 600;
	
	
	
	//M60 Machinegun
	public static final int[]	M60_MACHINE_GUN  			= { M60,
																100,		//capacity
																250,		//ammo left
																50,
																12.7,
																485,
																NO_SCOPE
																};
	//M2
	public static final double [] M2_MACHINE_GUN 			= { AUTOMATIC,
																	100,
																	100,
																	12.7,
																	485,
																	NO_SCOPE
																};
	
	
	
	
	/*
	 * Constructor Method
	 * 
	 */
	
	public MachineGun()
	{
		super();
		
		
	}
}
