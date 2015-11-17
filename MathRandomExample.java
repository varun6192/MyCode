package com.test;

public class MathRandomExample {
	public int printRandom(int N) {
		double randomNumber = Math.random();
		int randomInt = (int) (N * randomNumber);
		return randomInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(args[0]);
		MathRandomExample mathRandomExample = new MathRandomExample();
		int retValue = mathRandomExample.printRandom(N);

		System.out.println("The number is :" + retValue);
	}

}
