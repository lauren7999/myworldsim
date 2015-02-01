package myworldsim;

public class Gun extends Weapon
{
	/*
	 * Class Instance Variables
	 */
	private boolean gunAutomaticSetting;
	private int     gunAmmo;                     //number of rounds in magazine
	private double  gunCaliber;
	private int     gunRecoil; 
	private boolean gunScope;
	private int     gunRPM;                     //Rounds per minute
	
	
	/*
	 * Class Constants
	 */
	
	private final int DEFAULT_GUN_AMMO          = 12;
	private final int DEFAULT_GUN_CALIBER       = 45;
	
	private final int DEFAULT_HAND_GUN_RECOIL   = 1;
	private final int DEFAULT_RIFLE_RECOIL      = 2;
	private final int DEFAULT_SHOTGUN_RECOIL    = 3;
	private final int DEFAULT_CANNON_RECOIL     = 4;
	
	
	
	public static final int    DEFAULT_DAMAGE               = 25;       //percent of health
	public static final double DEFAULT_WEIGHT               = 1;       //in pounds
	public static final int    DEFAULT_ACCURACY             = 50;      //yards
	public static final int    DEFAULT_RANGE                = 100;     //in yards
	public static final int    DEFAULT_RPM                  = 60; //one round at a time approx. 1 round per second
	 /*
	 * Constructor Method
	 */
	public Gun()
	{
		super(DEFAULT_DAMAGE, DEFAULT_WEIGHT, DEFAULT_ACCURACY, DEFAULT_RANGE, DEFAULT_LIGHT_WEIGHT_MOBILITY);
		gunAutomaticSetting = false;
		gunAmmo             = DEFAULT_GUN_AMMO;
		gunCaliber          = DEFAULT_GUN_CALIBER;
		gunRecoil           = DEFAULT_HAND_GUN_RECOIL;
		gunScope            = false;
		gunRPM              = DEFAULT_RPM;
		
	}
	public Gun(double caliber, double weight, int ammo, int RPM, boolean automatic)
	{
		super(DEFAULT_DAMAGE, DEFAULT_WEIGHT, DEFAULT_ACCURACY, DEFAULT_RANGE, DEFAULT_LIGHT_WEIGHT_MOBILITY);
		gunAutomaticSetting = automatic;
		gunAmmo             = ammo;
		gunCaliber          = caliber;
		gunRecoil           = DEFAULT_HAND_GUN_RECOIL;
		gunScope            = false;
		gunRPM              = RPM;
		
	}
	public Gun(int damage, double weight, int accuracy, int range, int mobility, boolean automatic, int ammo, int caliber, int recoil, boolean scope, int RPM)//named constructor
	{
		super(damage, weight, accuracy, range, mobility);
		gunAutomaticSetting = automatic;
		gunAmmo             = ammo;
		gunCaliber          = caliber;
		gunRecoil           = recoil;
		gunScope            = scope; 
		gunRPM              = RPM;
	}
}
