package myworldsim;

import java.awt.Dimension;

// creature class Ryan's idea
public class Creature 
{
	/*Class Instance Variables
	 *  
	 */
	private int               creatureHealth;
	private int               creatureLives;
	private int               creatureSpeed;
	private int               creatureFangLength;
	private int               creatureClawLength;
	private int               creatureArmor;
	private CreatureDimension creatureDimension;
	private int               creatureJumpingAbility;
	private CreatureVision    creatureVision;
	private int               creatureLegs;
	private int               creatureHearing;
	private int               creatureChompingPower;
	private int               creatureStompingPower;
	
	
	
	
	/*
	 * Class Constants
	 */
	private final int           DEFAULT_CREATURE_HEALTH            = 100;
	private final int           DEFAULT_CREATURE_LIVES             = 1;
	private final int           DEFAULT_CREATURE_SPEED             = 20;
	private final int           DEFAULT_CREATURE_FANG_LENGTH       = 10;   // in inches
	private final int           DEFAULT_CREATURE_CLAW_LENGTH       = 3;    // in inches
	private final int           DEFAULT_CREATURE_ARMOR             = 2;     // in inches
	private final int           DEFAULT_CREATURE_LENGTH            = 6;    // in feet
	private final int           DEFAULT_CREATURE_WIDTH             = 3;    // in feet
	private final int           DEFAULT_CREATURE_HEIGHT            = 4;    // in feet
	private final int           DEFAULT_CREATURE_JUMPING_ABILITY   = 6;    // in feet
	private final CreatureVision DEFAULT_CREATURE_VISION           = CreatureVision.HORSE_VISION;    //best eyesight: hawk - 1 mile or 5280 feet
	private final int           DEFAULT_CREATURE_LEGS              = 4;
	private final int           DEFAULT_CREATURE_HEARING           = 100;   //in feet
	private final int           DEFAULT_CREATURE_CHOMPING_POWER            = 70; //percentage
	private final int           DEFAULT_CREATURE_STOMPING_POWER            = 30;
	
	
	public static enum CreatureVision
	{
	BLIND,                     //0
    DOG_VISION,                //1
	HUMAN_VISION,              //2
	HORSE_VISION,              //3
	DRAGON_FLY_VISION,         //4
	BIRD_VISION,               //5
	SNAKE_VISION,              //6
	CHAMELEON_VISION,          //7
	OGRE_FACE_SPIDER_VISION,   //8
	GECKO_VISION,              //9
	MANTIS_SHIMP_VISION,       //10
	GOAT_VISION,               //11
	HAWK_VISION                //12

	
	
	

	
	
		
	}
	

			
			
	/*
 * Constructor Method
 */

public Creature()
	{
	creatureHealth                = DEFAULT_CREATURE_HEALTH;
    creatureLives                 = DEFAULT_CREATURE_LIVES;
    creatureSpeed                 = DEFAULT_CREATURE_SPEED;    
    creatureFangLength            =  DEFAULT_CREATURE_FANG_LENGTH;  
    creatureClawLength            = DEFAULT_CREATURE_CLAW_LENGTH;  
	creatureArmor                 = DEFAULT_CREATURE_ARMOR;   
    creatureDimension             = new CreatureDimension(DEFAULT_CREATURE_LENGTH, DEFAULT_CREATURE_WIDTH, DEFAULT_CREATURE_HEIGHT);
	creatureJumpingAbility        = DEFAULT_CREATURE_JUMPING_ABILITY;
	creatureVision                = DEFAULT_CREATURE_VISION;
	creatureLegs                  = DEFAULT_CREATURE_LEGS;
	creatureHearing               = DEFAULT_CREATURE_HEARING;
	creatureChompingPower         = DEFAULT_CREATURE_CHOMPING_POWER;
	creatureStompingPower         = DEFAULT_CREATURE_STOMPING_POWER;
	
	 }
//used by troll class
public Creature(int height)
{
	creatureHealth                = DEFAULT_CREATURE_HEALTH;
    creatureLives                 = DEFAULT_CREATURE_LIVES;
    creatureSpeed                 = DEFAULT_CREATURE_SPEED;    
    creatureFangLength            =  DEFAULT_CREATURE_FANG_LENGTH;  
    creatureClawLength            = DEFAULT_CREATURE_CLAW_LENGTH;  
	creatureArmor                 = DEFAULT_CREATURE_ARMOR;   
    creatureDimension             = new CreatureDimension(DEFAULT_CREATURE_LENGTH, DEFAULT_CREATURE_WIDTH, height); 
	creatureJumpingAbility        = DEFAULT_CREATURE_JUMPING_ABILITY;
	creatureVision                = DEFAULT_CREATURE_VISION;
	creatureLegs                  = DEFAULT_CREATURE_LEGS;
	creatureHearing               = DEFAULT_CREATURE_HEARING;
	creatureChompingPower         = DEFAULT_CREATURE_CHOMPING_POWER;
	creatureStompingPower         = DEFAULT_CREATURE_STOMPING_POWER;
	
}

//used by trex class
public Creature(int length, int height, int speed, int jump, int armor, CreatureVision vision, int legs)
	{
	creatureHealth                = DEFAULT_CREATURE_HEALTH;
    creatureLives                 = DEFAULT_CREATURE_LIVES;
    creatureSpeed                = speed;    
    creatureFangLength            =  DEFAULT_CREATURE_FANG_LENGTH;  
    creatureClawLength            = DEFAULT_CREATURE_CLAW_LENGTH;  
	creatureArmor                 = armor;   
    creatureDimension             = new CreatureDimension(length, height, DEFAULT_CREATURE_HEIGHT);
	creatureJumpingAbility        = jump;
	creatureVision                = vision;
	creatureLegs                  = legs;
	creatureHearing               = DEFAULT_CREATURE_HEARING;
	creatureChompingPower         = DEFAULT_CREATURE_CHOMPING_POWER;
	creatureStompingPower         = DEFAULT_CREATURE_STOMPING_POWER;
	
	 }
	public Creature(int health, int lives, int speed, int fangLength, int clawLength, int armor, int length, int width, int height, CreatureVision vision , int jump, int legs, int hearing, int chomping, int stomping)
	{
	
	creatureHealth           = health;
	creatureLives            = lives;
	creatureSpeed           = speed;   
	creatureFangLength       = fangLength; 
	creatureClawLength       = clawLength;
	creatureArmor            = armor;
	creatureDimension        = new CreatureDimension(length, width, height);
	creatureJumpingAbility   = jump;
	creatureVision           = vision;
	creatureLegs             = legs;
	creatureHearing          = hearing;
	creatureChompingPower    = chomping;
	creatureStompingPower    = stomping;
	
	
	
	}
		 /*
		  * Getters and Setters
		  */
		public int getHealth() {
			return creatureHealth;
		}
		
		public void setHealth(int health) {
			creatureHealth = health;
		}
		
		public int getMonsterLives() {
			return creatureLives;
		}
		
		public void setMonsterLives(int lives) {
			creatureLives = lives;
		}
		
		public int getSpeed() {
			return creatureSpeed;
		}
		
		public void setSpeed(int speed) {
			creatureSpeed = speed;
		}
		
		public int getFangLength() {
			return creatureFangLength;
		}
		
		public void setFangLength(int fangLength) {
			creatureFangLength = fangLength;
		}
		
		public int getrClawLength() {
			return creatureClawLength;
		}
		
		public void setClawLength(int clawLength) {
			creatureClawLength = clawLength;
		}
		
		public int getArmor() {
			return creatureArmor;
		}
		
		public void setArmor(int armor) {
			creatureArmor = armor;
		}
		
		public CreatureDimension getMonsterDimension() {
			return creatureDimension;
		}
		
		public void setDimension(CreatureDimension dimension) {
			creatureDimension = dimension;
		}
		
		public int getJumpingAbility() {
			return creatureJumpingAbility;
		}
		
		public void setAbility(int jumpingAbility) {
			creatureJumpingAbility = jumpingAbility;
		}
		
		public CreatureVision getMonsterVision() {
			return creatureVision;
		}
		
		public void setMonsterVision(CreatureVision monsterVision) {
			creatureVision = monsterVision;
		}
		
		public int getLegs() {
			return creatureLegs;
		}
		
		public void setLegs(int legs) {
			creatureLegs = legs;
		}
		
		public int getHearing() {
			return creatureHearing;
		}
		
		public void setHearing(int hearing) {
			creatureHearing = hearing;
		}
		
		public int getChompingPower() {
			return creatureChompingPower;
		}
		
		public void setChompingPower(int chompingPower) {
			creatureChompingPower = chompingPower;
		}
		
		public int getStompingPower() {
			return creatureStompingPower;
		}
		
		public void setStompingPower(int stompingPower) {
			creatureStompingPower = stompingPower;
		}
		
		/*
		 * Actions
		 */
		
		public void look()
		{
			
		}
		public void eat()
		{
			
		}
		public void sleep()
		{
			
		}
		public void heal()
		{
			
		}
		public void jump()
		{
			
		
		}



}



