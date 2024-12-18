package com.iits.main;

public class Calculator {

	public int add(int a, int b) {
		if (a < 0 || b < 0)
			return -1;
		else if (a == 0 || b == 0)
			return 0;
		else
			return a + b;
	}

	public int multiplication(int a, int b) {
		return a * b;
	}

	public int division(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("Division by zero");
		else
			return a / b;

	}
	public int subtraction(int a,int b)
	{
		return a-b;
	}
}
