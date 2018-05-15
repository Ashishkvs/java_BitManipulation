package com.demo.general;

public class BitShift {
	public static void main(String[] args) {
		int x=5;
		//binary conversion
		//256,128,64,32,16,8,4,2,1
		
		//left shift exponentially growing
		System.out.println(x<<0);
		System.out.println(x<<1);
		System.out.println(x<<2);
		System.out.println(x<<3);
		
		//right shift
		System.out.println(x>>0);//as its is  5
		System.out.println(x>>1);//if its 1 shift 2
		System.out.println(x>>2);// 1
		System.out.println(x>>3);//0
		
		
	}

}
