package net.konic.corejava.execeptions;

public class Example4 {
	public static void main(String[] args) {
		
	
	try {
	 int a=10/0;
		
	}catch (ArithmeticException e) {
		System.out.println("This is Arithmetic Exception");
	}finally {
		System.out.println("Exception Handeled");
	}
		
	}

}
	