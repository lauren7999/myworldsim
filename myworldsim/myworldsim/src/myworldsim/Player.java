package myworldsim;

public class Player{
	
	/*
	 * Class instance variable
	 */
	
	private String			name;
	private String 			userName;
	private String		 	password;
	private Creature 		avatar;			//OOP COMPOSITION: player HAS a creature object
	
	
	
	/*
	 * Class Constant
	 * 
	 */
	
	
	/*
	 * Constructors
	 * 
	 */
	
	public Player(String name, String userName, String password, Creature avatar) {
		this.name 	  = name;
		this.userName = userName;
		this.password = password;
		this.avatar   = avatar;
	}


	/*
	 * Getters and Setters
	 * 
	 */

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Creature getAvatar() {
		return avatar;
	}



	public void setAvatar(Creature avatar) {
		this.avatar = avatar;
	}

	
	


	
}
