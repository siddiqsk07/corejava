package net.konic.corejava.execeptions;

public class ExeceptionExample {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c=10;
			int result = a / b /c;

			System.out.println("Result :" + result);
		} catch (ArithmeticException e) {
	     System.out.println("Error :A number cannot divides bt zero");
		}
		System.out.println("Code continious");
	}

}
