package com.demo.general;

public class BitGatesCheck {
	public static void main(String[] args) {
		int a=10; int b=15;
		System.out.println(a | b); //15 higher 
		System.out.println(a & b); //10 lower
		
		//is it higher lower concept ?? NO
		int y=1023; int z=1213;
		System.out.println(y | z);
		System.out.println(y & z);
	}

}
