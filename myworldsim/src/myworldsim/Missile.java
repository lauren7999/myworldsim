package myworldsim;

public class Missile extends Weapon
{
	/*
	 * Class Instance Variables
	 */

	private int missileBlastRadius;
	
	/*
	 * Class Constants
	 */
	
	private final int DEFAULT_MISSILE_BLAST_RADIUS    = 400; //square feet (20x20)
	

	private final static int        DEFAULT_MISSILE_DAMAGE            = 100 ;                                  //percentage
	private final static int        DEFAULT_MISSILE_WEIGHT            = 2900;                                 //pounds
	private final static int        DEFAULT_MISSILE_ACCURACY          = 1150;                                 //feet
	private final static int        DEFAULT_MISSILE_RANGE             = 3000;                               //feet
	private final static int        DEFAULT_MISSILE_MOBILITY          = Weapon.DEFAULT_MEDIUM_WEIGHT_MOBILITY;
	
	
	
	
	
	/*
	 * Constructor Method
	 */
	
	
	public Missile()
	{
		super(DEFAULT_MISSILE_DAMAGE, DEFAULT_MISSILE_WEIGHT, DEFAULT_MISSILE_ACCURACY, DEFAULT_MISSILE_RANGE, DEFAULT_MISSILE_MOBILITY);
		
		missileBlastRadius = DEFAULT_MISSILE_BLAST_RADIUS;
		
	}
		public Missile(int damage, double weight, int accuracy, int range, int mobility, int blastRadius)
			{
				super(damage, weight, accuracy, range, mobility);
	 
				missileBlastRadius = blastRadius;
			}
		
		/*
		 * Actions
		 */
			public void arm()
			{
				
			}
			
			public void explode()
			{
				
			}
			
			public void launch()
			{
				
			}
			
			public void flies()
			{
				
			}
			
			//explode the missile if not going where it is supposed to
			public void detonate()
			{
				
			}	
		
}
