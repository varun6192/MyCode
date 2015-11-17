package com.test;

public class Calculator {
	public double sum(double a, double b) {
		return a + b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double devide(double a, double b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		Calculator calculator = new Calculator();
		System.out.println("The sum is :" + calculator.sum(a, b));
		System.out.println("The difference is :" + calculator.substract(a, b));
		System.out.println("The product is:" + calculator.multiply(a, b));
		System.out.println("The quotient is :" + calculator.devide(a, b));

	}

}
