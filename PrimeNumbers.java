package com.day2;

public class PrimeNumbers {
	Boolean isPrime(int n) {
		if(n == 2) {
			return true;
		}
		
		for(int x=2; x<n; x++) {
			if(n%x == 0) {
				return false;
			}
		}
		return true;
	}
	static void prime(int n) {
		for(int i=2; i<=n; i++) {
			PrimeNumbers d1 = new PrimeNumbers();
			Boolean m1 = d1.isPrime(i);
			if(m1) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		int inputValue = 50;
		if(inputValue >= 2 && inputValue <= 100) {			
			prime(inputValue);
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
