package com.test;

public class MathClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = Double.parseDouble(args[0]);
		double sqrt = Math.sqrt(number);
		double cbrt = Math.cbrt(number);
		System.out.println("Square root of number is : " + sqrt);
		System.out.println("Cuberoot of number is : " + cbrt);
	}

}
