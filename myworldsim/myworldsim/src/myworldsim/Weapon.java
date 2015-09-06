package myworldsim;

public class Weapon
{
	/*
	 * Class Instance Variables
	 * 
	 */
	private int     type;
	private int		damage;
	private double	weight;
	private int		accuracy;			// In feet
	private int		range;			// In feet
	private int 	mobility;
	
	/*
	 * Class Constants
	 * 
	 */
	
	//weapon type

	public static final int  	DUMMY_WEAPON			  = 0;
	
	//defaults for a hand gun

	public static final int	DEFAULT_LIGHT_WEIGHT_MOBILITY	= 1;
	public static final int	DEFAULT_MEDIUM_WEIGHT_MOBILITY	= 2;
	public static final int	DEFAULT_HEAVY_WEIGTH_MOBILITY	= 3;
	
	//Weapon types
	public static final int MACHINE_GUN_TYPE                 = 1;
	public static final int RPG_TYPE                         = 2;
	public static final int ASSULT_RIFLE                     = 3;
	public static final int MISSLE                           = 4;
	
	/*
	 * Constructor MethodS
	 * 
	 */
	
	public Weapon(int type) {
		
		if (type == DUMMY_WEAPON) {
		this.type = type;
		damage = 0;
		weight = 0;
		accuracy = 0;
		range = 0;
		mobility = 0;
		}
		damage 	    = damage;
		weight 	    = weight;
		accuracy	= accuracy;
		range		= range;
		mobility	= mobility;
	}
	
	/*
	 * Getters
	 * 
	 */
	
	public int getType() {
		return type;
	}

	public int getDamage() {
		return damage;
	}

	public double getWeight() {
		return weight;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public int getRange() {
		return range;
	}

	public int getMobility() {
		return mobility;
	}

	public void aim()
	{
		
	}
	
	public void harm()
	{
		
	}
}
