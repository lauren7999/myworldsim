package myworldsim;

import myworldsim.Creature.CreatureVision;

public class TRex extends Creature
{
	/*
	 * Class Instance Variables
	 */
		private int           trexArms;
		private int           trexTailLength;
		private int           trexWhippingPower;
		
		
		/*
		 * Class Constants
		 */
		
		
		private final int DEFAULT_TREX_ARMS            = 2;
		private final int DEFAULT_TREX_TAIL_LENGTH     = 10; //feet
		private final int DEFAULT_TREX_CHOMPING_POWER  = 70; //percentage
		private final int DEFAULT_TREX_WHIPPING_POWER  = 50;
		private final int DEFAULT_TREX_STOMPING_POWER  = 90;
		
		//override Monster defaults
		
		private static final int DEFAULT_TREX_LENGTH          = 40; //feet
		private static final int DEFAULT_TREX_HEIGHT_STANDING = 39; //Overrides DEFAULT_MONSTER_HEIGHT
		private static final int DEFAULT_TREX_SPEED           = 25;
		private static final int DEFAULT_TREX_ARMOR           =4; //overrides MONSTER_ARMOUR
		private static final CreatureVision DEFAULT_TREX_VISION          = CreatureVision.SNAKE_VISION; //overrides DEFAULT_MONSTER_VISION
		private static final int DEFAULT_TREX_JUMPING_ABILTY  =2;
		private static final int DEFAULT_TREX_LEGS            =2; //overrides DEFAULT_MONSTER_LEGS
		
		/*
		 * getters and setters
		 */
		
		
		public int getTrexArms() 
		{
			return trexArms;
		}
		public void setTrexArms(int trexArms) 
		{
			this.trexArms = trexArms;
		}
		public int getTrexTailLength() 
		{
			return trexTailLength;
		}
		public void setTrexTailLength(int trexTailLength) 
		{
			this.trexTailLength = trexTailLength;
		
		}
		public int getWhippingPower()
		{
			return trexWhippingPower;
		}
		public void setWhippingPower(int whipping)
		{
			
		}

		
	
	/*
	 * Constructor Method
	 */

		public TRex()
		{
			super(DEFAULT_TREX_LENGTH, DEFAULT_TREX_HEIGHT_STANDING, DEFAULT_TREX_SPEED, DEFAULT_TREX_ARMOR,DEFAULT_TREX_JUMPING_ABILTY, DEFAULT_TREX_VISION, DEFAULT_TREX_LEGS);
			trexArms = DEFAULT_TREX_ARMS;
			trexTailLength = DEFAULT_TREX_TAIL_LENGTH;
		}
		public TRex(int health, int lives, int speed, int fangLength, int clawLength, int armor, int length, int width, int height, CreatureVision vision , int jump, int legs, int hearing, int chomping, int stomping, int arms, int tailLength, int whipping)
		{
		super(health,  lives,  speed, fangLength,  clawLength, armor, length, width,  height,  vision ,  jump, legs, hearing, chomping,  stomping);
		
		trexArms = arms;
		trexTailLength = tailLength;
		trexWhippingPower = DEFAULT_TREX_WHIPPING_POWER;
		
		}
		
		
		/*
		 * Actions
		 */
		
		public void walk()
		{
			
		}
		
		
		public void chomp()
		{
			
		}
		public void stomp()
		{
			
		}
		public void whip()
		{
			
		}
		
}
