package myworldsim;

public class RPG extends Weapon
{
	/*
	 * Class Instance Variables
	 */
	
	private int RPGBlastRadius;



	/*
	 * Class Constants
	 */
	
	private final static int        DEFAULT_RPG_DAMAGE            = 70 ;
	private final static int        DEFAULT_RPG_WEIGHT            = 15; //pounds
	private final static int        DEFAULT_RPG_ACCURACY          = 654; //feet
	private final static int        DEFAULT_RPG_RANGE             = 3000; //feet
	private final int               DEFAULT_RPG_BLAST_RADIUS      = 200; //Square feet (10 x 20)
	private final static int        DEFAULT_RPG_MOBILITY          = Weapon.DEFAULT_MEDIUM_WEIGHT_MOBILITY;
	
	
	
	
	
	
	
	
	/*
	 * Constructor methods
	 */

	public RPG()
	{
		    // int damage, double weight, int accuracy, int range, int mobility
		super (DEFAULT_RPG_DAMAGE, DEFAULT_RPG_WEIGHT, DEFAULT_RPG_ACCURACY, DEFAULT_RPG_RANGE, DEFAULT_RPG_MOBILITY);
	 RPGBlastRadius = DEFAULT_RPG_BLAST_RADIUS;
	
	}


	public RPG(int damage, double weight, int accuracy, int range, int mobility, int blastRadius)
	{
		super  (damage, weight, accuracy, range, mobility);
		
		RPGBlastRadius = blastRadius;
		
		
	}	
}




