package com.demo.general;

/**
 * 
 * @author imagegrafia set x'th and y'th bit and return the number
 */
public class SetBitXandY {
	// case 2,4 means 2nd and 4th bit will be 1 rest will be zero

	public static int setBitAt(int x, int y) {
		return nthBitValue(x) | nthBitValue(y);
		// return nthBitValue(x) + nthBitValue(y); //But this method will fail if x'th and y'th bit are same eg. 5
		//System.out.println(setBitAt(5, 5));//64 but it should be 32 only
	}

	// in term of 2 if nth bit is set what is its value of it ex. 2nd bit  is set 1 so its value will be 2 to power 1 i.e 2
	public static int nthBitValue(int num) {
		return 1 << num;
	}
	
	//binaryFormat of x'th and y'th bit
	public static int binaryFormat(int xth,int yth) {
		//size of bit will be highest position eg 3,7 so bit will return "7" no of position only eg "10001000"
		int size=(xth>yth?xth:yth)+1;
		
		int arr[]=new int[size];
		arr[xth]=1; arr[yth]=1; //set bit 1 for given position
		
		//fetch array to get binary format
		String str="";
		for(int i:arr) {
			str+=i;
		}
		Integer binary=Integer.parseInt(str); //due to integer conversion prefix zero will be removed
		return binary;
	}

	public static void main(String[] args) {
			System.out.println(setBitAt(5,4)); //32+16 i.e 48
			//But this method will fail if x'th and y'th bit are same eg. 5
			System.out.println(setBitAt(5, 5));//32
			
			//After setting x'th and y'th bit return binary format of number
			System.out.println(binaryFormat(1, 7));//10000001
			System.out.println(binaryFormat(5, 7));//101 due to Parsing prefix "0" are removed
	}

}
