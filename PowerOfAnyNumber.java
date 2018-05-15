package com.demo.general;

public class PowerOfAnyNumber {
	// general function for power of any number
	public static int powFunction(int number, int power) {
		int temp = 1;
		if (power == 0) {
			return 1;
		}

		else {
			while (power > 0) {
				temp = temp * number;
				power--;
			}
		}
		/**
		 * else if (power < 0) { while (power < 0) { temp = (temp * number); power++; }
		 * return temp*10; } Unable to send format in 10's neg format or 1/temp format
		 */
		return temp;
	}

	public static void main(String[] args) {
		// general function
				System.out.println("power of 5 to the 5 : " + powFunction(5, 5));

	}
}
