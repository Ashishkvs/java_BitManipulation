package com.demo.general;
/**
 * 
 * @author imagegrafia
 *	Using shift Operator find binary number bit set and position of bits
 */
public class CheckBit {

	// check bit set or not of Decimal number directly by giving osition
	public static boolean isBitSet(int number, int pos) {
		if ((number >> pos & 1) == 1) {
			return true;
		}
		return false;
	}

	// no of bit are set to be 1 of Decimal Number
	public static int noOfBitSet(int number) {
		int ones = 0;
		for (int i = 0; i < 32; i++) { // bit position for 32 bit
			if ((number >> i & 1) == 1) {
				ones++;
			}
		}

		return ones;
	}

	// what all bit position are set
	public static int[] bitPositions(int number) {

		int positon[] = new int[noOfBitSet(number)]; // execute this method to fetch ones size
		int index = 0;
		for (int i = 0; i < 32; i++) {
			if ((number >> i & 1) == 1) {
				positon[index] = i;
				index++;
			}
		}
		return positon;
	}

	// binary format of a given number
	public static int[] binaryFormat(int number) {
		int arr[] = new int[8]; // 8 bit
		int lastIndex = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if ((number >> i & 1) == 1) {
				arr[lastIndex] = 1;// insert bit from last index i.r binary order reverse order
			} else {
				arr[lastIndex] = 0;
			}
			lastIndex--;
		}

		return arr;
	}

	//bit generate 
	public static int binaryGenerate(int noOfBits,int fromPos) {
		return(1<<(noOfBits+fromPos)-(1<<fromPos));
		
	}
	public static void main(String[] args) {
		//bit set or not
		System.out.println("In Number 12 its bit pos 1 is set or not :>  "+isBitSet(12, 1)); // number 10 and bit position (0,1,2....)

		// no of bit set
		System.out.println("Total no of bits are set in 12 :>  "+noOfBitSet(12));// 2
		
		//bit position
		System.out.print("Bit position are set at :>  ");
		for (int a : bitPositions(12)) {
			System.out.print(a + ",");
		}
		// binary format
		System.out.print("\nBinary format of 12 is :>  ");
		for (int a : binaryFormat(12)) {
			System.out.print(a);
		}
		//binary generate
		System.out.println();
		System.out.println(binaryGenerate(4, 5));//12
		
	}
}
