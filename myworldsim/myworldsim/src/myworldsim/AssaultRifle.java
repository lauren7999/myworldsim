package myworldsim;

public class AssaultRifle extends Gun
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	private static final boolean DEFAULT_ASSAULT_RIFLE_AUTOMATIC_SETTING	= true;
	private static final int	 DEFAULT_ASSAULT_RIFLE_AMMO				= 40;						// M16
	private static final double  DEFAULT_ASSAULT_RIFLE_CALIBER				= 5.56;						// M16 5.56x45mm NATO
	private static final double  DEFAULT_ASSAULT_RIFLE_WEIGHT				= 8.79;						// M16 loaded weight
	
	private static final int	 DEFAULT_ASSAULT_RIFLE_RPM					= 800;						// M16
	private static final int	 DEFAULT_ASSAULT_RIFLE_DAMAGE				= 50;						// Percent of health
	private static final int	 DEFAULT_ASSAULT_RIFLE_ACCURACY			= 210;						// In feet;
	
	/*
	 * Constructor Methods
	 * 
	 */
	
	public AssaultRifle(int type, int damage, double weight, int accuracy, int range, int mobility, boolean automatic, int ammo, int caliber, int recoil, boolean scope, int RPM)
	{
		super(type, damage, weight, accuracy, range, mobility, automatic, ammo, caliber, recoil, scope, RPM);
	}
	
}
