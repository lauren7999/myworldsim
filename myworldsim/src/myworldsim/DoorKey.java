package myworldsim;

import java.util.Random;

public class DoorKey 
{
	/*
	 * Class Instance Variables
	 */
		private long keyCode;
	
	/*
	 * Class Variables
	 */
		public static final int BLANK_KEY = 0;
		
	/*
	 * Class Constants
	 */
	
	
	/*
	 * Getters and setters
	 */
		public long getKeyCode()
		{
			return keyCode;
		}
		
		public void newKeyCode()
		{
			keyCode = keyCodeRandomizer();
		}
		public DoorKey copyKey()
		{
			DoorKey key = new DoorKey();
			return key;
		}
		
		
	/*
	 * 
	 * Copy Constructor
	 */

		public DoorKey()
		{
			keyCode = keyCodeRandomizer();
		}
		
		public DoorKey(int code)
		{
			//pass a code of zero to create a blank hardware key
			keyCode = code;
		
		}
		
		// copy
		public DoorKey(DoorKey key) {
			
			keyCode = key.getKeyCode();   //sets new key code same as the one it copies // copy constructor
		}
		
		
		/*
		 * other methods
		 */
		
		private long keyCodeRandomizer()
		{
			long code = 0;
			
			Random random = new Random();
			code = random.nextLong();
			
			
			return code;
		}
}
