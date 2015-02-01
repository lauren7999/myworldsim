package myworldsim;

public class WorldLocation 
{
	
	/*
	 * 
	 * Class Instance Variables
	 */
	
	private short x;  //width (columns)
	private short y;  // length (rows)

	
	/*
	 * Getters
	 * 
	 */
	
	public short getX() {
		return x;
	}
	public short getY() {
		return y;
	}
	
	
	/*
	 * Constructor
	 * 
	 */
	
	public WorldLocation(short x, short y)
	{
		this.x = x;
		this.y = y;
		
	}
}
