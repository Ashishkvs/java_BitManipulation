package com.demo.general;

public class PowerOf2 {
	/**
	 * pass the args and make it power of 2 or multiply by 2 on each left shift it
	 * will work exponentially or power only for "2" for others it will simply shift
	 * all bits such that instead of 1 we pass 10 then 10 bits will shift hence
	 * value will obviously increase but not as power of 10
	 * 
	 */
	//USING LEFT-SHIFT OPERATIOR WE CAN GET exponential value of 2 only
	
	static long powOf2(long power) {
		return 1 << power; // 1 will be the base so that when 0 passed return will 1 as 2 to pow 0 =1
	}

	
	public static void main(String[] args) {
		
		System.out.println(powOf2(4));

		//for series of number 
		int power = 0;
		do {
			System.out.println("2 to the power of " + power + ": " + powOf2(power));
			power++;
		} while (power < 10);

		
	}

}
