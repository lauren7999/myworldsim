package myworldsim;

import myworldsim.Creature.CreatureVision;

public class Wolf extends Creature
{

	/*Class Instance Variables
	 *  
	 */
	
	private int wolfArms;
	/*
	 * Class Constants
	 */
	
	private final int DEFAULT_WOLF_ARMS      = 2;
	


/*
 * Constructor Methods
 */
	public Wolf()
	{
		super();
			
		wolfArms = DEFAULT_WOLF_ARMS;
	 }
public Wolf(int health, int lives, int speed, int fangLength, int clawLength, int armor, int length, int width, int height, CreatureVision vision , int jump, int legs, int hearing, int chomping, int stomping, int arms)
	{
	
	super(health, lives,speed,fangLength, clawLength, armor, length, width, height, vision, jump, legs, hearing, chomping, stomping);
	
	wolfArms = arms;
	}

	/*
	 * getters and setters
	 */

	public int getArms()
	{
		return wolfArms;
	}
	public void setArms(int arms)
	{
		wolfArms = arms;
	}
	
	/*
	 * ACtions
	 */
	public void attack()
	{
		
	}
	public void run ()
	{
		
	}
	public void slash()
	{
		
	}
	public void chomp()
	{
		
	}
 
   public void kill ()
   {
	   
   }
   public void eat()
   {
	   
   }
   public void fire()
   {
	   
   }
   
  
   
   
   
   
   
   
}
