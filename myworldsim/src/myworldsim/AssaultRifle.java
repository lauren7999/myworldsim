package myworldsim;

public class AssaultRifle extends Gun
{
	/*
	 * Class Instance Variables
	 */
		
	
	
	
	/*
	 * Class Constants
	 */
	private static final boolean       DEFAULT_ASSAULT_RIFLE_AUTOMATIC_SETTING   = true;
	private static final int           DEFAULT_ASSAULT_RIFLE_AMMO                =40;    //m16
	private static final double        DEFAULT_ASSAULT_RIFLE_CALIBER             = 5.56;  //M16 5.56x45mm NATO
	private static final double         DEFAULT_ASSAULT_RIFLE_WEIGHT             = 8.79; //for M16 loaded
	
	
	private static final int           DEFAULT_ASSAULT_RIFLE_RPM                 = 800;
	public  static final int           DEFAULT_ASSAULT_RIFLE_DAMAGE              = 50;  //percent of health
	private static final int           DEFAULT_ASSAULT_RIFLE_ACURACY             = 210;   //in feet
	
	

	
	
	/*
	 * Constructor Method
	 */

	public AssaultRifle()
	{
		super(DEFAULT_ASSAULT_RIFLE_CALIBER, DEFAULT_ASSAULT_RIFLE_WEIGHT, DEFAULT_ASSAULT_RIFLE_AMMO, DEFAULT_ASSAULT_RIFLE_RPM, DEFAULT_ASSAULT_RIFLE_AUTOMATIC_SETTING);
	}	
}
