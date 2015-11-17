package com.test;

public class CheckPrime {

	public String checkPrime(int number) {
		int count = 0;
		String retValue = null;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			retValue = "prime";
		} else {
			retValue = "not prime";
		}
		return retValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(args[0]);
		CheckPrime checkPrime = new CheckPrime();
		String retMsg = checkPrime.checkPrime(number);

		System.out.println("The given number is " + retMsg);
	}

}
