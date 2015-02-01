package myworldsim;

public class Witch extends Creature
{
	/*
	 * Class Instance Variables
	 */
	private int witchLives;
	private int witchSpeed;
	private int witchSpells; //book of spells
	

	
	/*
	 * Class Constants
	 */
	private final int DEFAULT_WITCH_LIVES = 3;
	private final int DEFAULT_WITCH_SPEED = 10; //miles per hour
	
	
	
	/*
	 * Constructor Methods
	 */
	public Witch(int lives, int speed)
	{
		witchLives = lives;
		witchSpeed = speed;
	}
	
	public Witch()
	{
		witchLives = DEFAULT_WITCH_LIVES;
		witchSpeed = DEFAULT_WITCH_SPEED;
	}
	
	/*
	 * ACtion
	 */
	
	
	public void fly()
	{
		
	}
	

	public void run()
	{
		
		
	}
	
	public void cook()
	{
		
	}
	public void walk()
	{
		
	}
	public void chant()
	{
	}
	
	}
