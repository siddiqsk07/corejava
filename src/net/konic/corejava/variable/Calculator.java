package net.konic.corejava.variable;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;

	   public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value :");
		num1 = sc.nextInt();
		System.out.println("Enter B value :");
		num2 = sc.nextInt();
		sc.close();
	}

	public int add() {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.input();
		calculator.add();

		int sum = calculator.add();
		System.out.println("Add :" + sum);

	}

}
