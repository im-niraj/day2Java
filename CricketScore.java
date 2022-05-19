package com.day2;

public class CricketScore {

	static void cricket(int a, int b, int c, int d, int f) {
		int result = a + (b*2) + (c*3) + (d*4) + (f*6);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		cricket(15,8,3,4,2); 
	}

}
