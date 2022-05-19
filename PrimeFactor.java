package com.day2;

public class PrimeFactor {
	static void primeF(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int inputValue = 12;
		if(inputValue >= 2 && inputValue <= 100) {			
			primeF(inputValue);
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
