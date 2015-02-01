package myworldsim;

public class CommandInterpreter 
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	//MOVE
	private final int GO           = 1;
	private final int WALK         = 2; 
	private final int AMBLE        = 3;
	private final int PROWL        = 4;
	private final int STRIDE       = 5;
	private final int RUN          = 6;
	private final int JUMP         = 7;
	private final int STAGGER      = 8;
	private final int STRUT        = 9;
	private final int EXIT         = 1;    //WHAT: DOOR/WINDOW   HOW: DIrection
	private final int GETIN        = 12;   //WHAT: DOOR/Window  HOW: IN/OUT
	private final int GETOUT       = 13;
	
	
	
	//THROW COMMANDS
	private final int TOSS         = 10;
	private final int FLICK        = 11;
	private final int PITCH        = 12;
	private final int HURL         = 13;
	
	
	//SHOOT COMMANDS
	private final int LAUNCH       =13;
	private final int FIRE         = 14;
	
	
	//GET COMMANDS
	private final int   LIFT      = 15;
	private final int   PICKUP    = 16;
	private final int   GRAB      = 17;
	
	//???LIGHT (FIRE), TURN ON (A LIGHT)
	
	//OPEN COMMANDS
	
	
	//CLOSE COMMANDS
	private final int SHUT        = 1;   // WHAT: DOOR
	private final int SHUTOFF     = 2;   //WHAT: WATER/FAUCT/GAS
	private final int SHUTUP      = 3;   //WHAT: TALKING
	
	//STAND COMMANDS
	
	
	
	//HIT COMMANDS
	private final int   SLAP       = 19;
	private final int   PUNCH      = 20;
	private final int   SWAT       = 22;
	
	
	//BREAK COMMANDS
	private final int  SMASH      = 21;
	private final int  SHATTER    = 22;
	
	
	//LIGHTS COMMANDS
	private final int LIGHTS      = 23;  //WHAT: ALL LIGHTS     HOW: ON/OFF
	private final int TURN        = 25; //WHAT: LIGHTS/LIGHTS   HOW: ON/OFF  WHAT: KNOB
	private final int SWITCH      = 33;
	
	//CUT COMMANDS
	private final int SLICE       = 1;
	private final int DICE        = 2;
	
	//COOK COMMANDS
	private final int ROAST       = 1;
	private final int FRY         = 2;
	private final int BOIL        = 3;
	
	
	
	//KILL COMMANDS
	
	
	
	//2D BECAUSE ROWS AND COLUMNS; THIS IS A JAGGED ARRAY (DIFFERENT NUMBERS OF ROWS VS COLUMNS)
	private final int COMMANDS[][] = {
										{GO, WALK, AMBLE, PROWL, STRIDE, RUN, JUMP, STAGGER, STRUT},   //MOVE COMMANDS
										{FLICK, PITCH, TOSS},
										{LAUNCH, FIRE},
										{LIFT, PICKUP}
			
	};
	
	
	
	
	/*
	 * Constructor
	 * 
	 */
	
	public CommandInterpreter()
	{
		
	}
}
