package myworldsim;

public enum Direction 

{
	//number in parentheses is the ordinal (order #)
		NOWHERE ((byte)(-1)),
		NORTH((byte)(0)),
		SOUTH((byte)(1)),
		EAST((byte)(2)),
		WEST((byte)(3)),
		NORTHEAST((byte)(4)),
		NORTHWEST((byte)(5)),
		SOUTHEAST((byte)(6)),
		SOUTHWEST((byte)(7)),
		UP((byte)(8)),
		DOWN((byte)(9));
		
		
		/*
		 * 
		 *Class Instance VAriables
		 */
		private byte                value;
		
		/*
		 * Constants
		 * 
		 */
		
		
		
		
		
		
		/*
		 * Constructor Method
		 */
		
		private Direction(byte direction)
			{
				value = direction;
			}
		
		/*
		 * Constructor method
		 */
		
		
		
		/*
		 * Getters
		 */
		public int getValue()
		{
			return value;
		}
}
		
		
