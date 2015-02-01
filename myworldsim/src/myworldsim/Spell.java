package myworldsim;

public class Spell 
{
		/*
		 * Class Instant Variables
		 */
		private int    spellType; //spell type
		private String spellName;
		private String spell;    //words for witch to recite
		
		
		/*
		 * Class Constants
		 */
		
		public static int HEALING         = 1; 
		public static int CURSE           = 2;
		

		public static int TRANSFIGURATION = 3;
	    public static int CHARM           = 4; //changes what an object can do, not what it is
	    public static int PROTECTIVE      = 5; //protects area not person 
	    public static int JINX            = 6; //meant for amusement
	    public static int HEX             = 7; //less than dark magic but more than a jinx, causes light discomfort
	    
	    public static String[] CHARM_SPELLS = 
	    	{
		    	"Amplifying Charm",
		    	"Anti Unlocking Charm",
		    	"Banishing Charm",
		    	"Disarming Charm",
		    	"Fixing Charm",
		    	"Shrinking Charm",
		    	"Talong-Clipping Charm",
		    	"Tooth-Shrinking Charm",
		    	"Unlocking Charm",
		    	"Stream of Flames",
		    	"Repairing Charm",
	    		"Lightning Charm",
	    		"Invisibility Charm"
	    	};
	    public static String[] HEALING_SPELLS = 

	    	{
	    		"Ferula Spell", //heals broken bones/fractures
	    		"Episkey Spell", //heals mild to moderate injuries
	    	 	"Vulnera Spell", //heals deep gashes
	    	 	
	    	};
	    public static String[] CURSES = 
	    	{
	    		"Killing Curse",
	    		"Jelly-Legs Curse",
	    		"Leg-Locker Curse",
	    		"Imperius Curse", //places victim in a dream-like state
	    		"Blasting Curse",
	    		"Disentegration Curse",
	    		"Floating Eye Curse"
	    	};
	    public static String[] TRANSFIGURATION_SPELLS = 
	    	{
	    		"Vanishment Spell",
	    		"Conjuration Spell",
	    		"Wolf Into Rat Spell",
	    		"T-Rex Into Lizard",
	    		"Human Into Monkey",
	    		"Gun Into Flower",
	    	
	    	};
	    public static String[] PROTECTIVE_SPELLS = 
	    	{
	    		"Invisibilty Spell", //hides a person
	    		"Force Field Spell",
	    		"Total Protection Spell", //protects an area
	    		"Invisibility Shield Spell" //hides an area
	    	};
	    
	    public static String[] JINX_SPELLS = 
	    	{
	    		"Back Firing Jinx Spell",
	    		"Cantis Jinx",   	  //causes victim to only want to sing
	    		"Dancing Feet Jinx", //causes victim to dance
	    		"Ebublio Jinx",   	//traps victim inside a large bubble that cannot be popped
	    		"Finger Removing Jinx",
	    		"Jelly-Brain Jinx",
	    		"Knockback Jinx",
	    		"Levicorpus Jinx", //causes victim to be lifted in air by their feet
	    		"Vermiculus Jinx" //transforms victim into a worm
	    	};
	    
	    public static String[] HEX_SPELLS = 
	    	{
	    		"Redactum Skullus Hex", //shrinks head of victim
	    		"Stick Fast Hex"       //makes victim's feet stick to the ground
	    	};
	    
	    /*
	     * Constructor Method
	     */
	    
	   
	    public Spell(int type, String name) 
	    {
	    	spellType = type;
	    	spellName = name;  
	    }
	    
	    /*
	     * Getters and Setters
	     */
	    public int getSpellType() 
	    {
			return spellType;
		}

		public void setSpellType(int type) 
		{
			spellType = type;
		}

		public String getSpellName()
		{
			return spellName;
		}

		public void setSpellName(String name) 
		{
			spellName = name;
		}

		public String getSpell() 
		{
			
			return spell;
		}

		public void setSpell(String spell)
		{
			this.spell = spell;
		}
	    
}









