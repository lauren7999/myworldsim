package myworldsim;

public enum PrimaryCommands
{
	MOVE  (0),
	THROW (1),
	SHOOT (2),
	GET   (3), //grab
	OPEN  (4),   //WHAT: FAUCET
	CLOSE (5),
	SIT   (6),
	STAND (7),
	HIT    (8),
	BREAK (9),
	LIGHTS (10),  //WHAT: A LIGHT/FIRe HOW: ON/OFF
	CUT    (11),
	COOK    (12),
	KILL     (13);
	   

	/*
	 * 
	 *Class Instance VAriables
	 */
	private int  value;
	
	/*
	 * Class Constants
	 * 
	 */
	
	/*
	 * Constructor Method
	 * 
	 */
	private PrimaryCommands(int command)
	{
		value = command;
	}
	
	/*
	 * toString Method
	 * 
	 */
	
	@Override
	public String toString()
	{
		return this.name().toLowerCase();
	}
}
