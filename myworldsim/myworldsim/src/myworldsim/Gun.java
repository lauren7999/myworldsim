package myworldsim;

public class Gun extends Weapon
{
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private int					type;
	private boolean				automatic;
	private	int					ammoCapacity;							// Number of rounds in magazine
	private int					ammoLeft;
	private double				caliber;
	private int					recoil;
	private boolean				scope;
	private int					rpm;								// Only in automatic setting
	
	
	/*
	 * Class Constants
	 * 
	 */
	
	public static final int		ASSAULT_RIFLE              = 1;
	public static final int		MACHINE_GUN				   = 2;
	
	
	public static final int	    AUTOMATIC                   = 0;
	public static final int    MANUAL						= 1;
	public static final int    NO_SCOPE						= 0;
	public static final int    SCOPE						= 1;
	
	
	/*
	 * Constructor Methods
	 * 
	 */
	
	public Gun(int model, int range, int automatic, int ammoCapacity, int caliber, int scope, int RPM)
	{
		super(model, damage, weight, accuracy, range, mobility);
		
		automatic = automatic;
		this.ammoCapacity				= ammo;
		this.caliber			= caliber;
		this.recoil			= recoil;
		this.scope			= scope;
		this.rpm				= RPM;
	}
	
	/*
	 * Getters
	 * 
	 */

	public boolean isAutomaticSetting() {
		return automatic;
	}

	public int getAmmo() {
		return ammoCapacity;
	}

	public double getCaliber() {
		return caliber;
	}

	public int getRecoil() {
		return recoil;
	}

	public boolean isScope() {
		return scope;
	}

	public int getRpm() {
		return rpm;
	}
	
	
	/*
	 * Other methods
	 * 
	 */
	public void loadAmmo() {
		ammoLeft = ammoCapacity;
	}
	
	public boolean shoot(int rounds) {
		boolean shot = false;
		
		if (ammoLeft > 0) {	
			for(int roun = 1; rounds <= rounds; rounds++) {
				if (ammoLeft - 1 > 0) {
					ammoLeft--;
					shot = true;
				}
		
		return shot;
			}
		}
	}
	
	
}
