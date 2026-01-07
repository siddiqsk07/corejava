package net.konic.corejava.methods;

public class Calculator {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("The sum of a+b :" + c);
		return c;

	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5, 10);
	}

}
