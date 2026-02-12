package net.konic.corejava.execeptions;

public class Example5 {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}catch (ArithmeticException e) {
			System.out.println("Exceptionm catch");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Exception catch");
		}finally {
			System.out.println("Exception Handeled");
		}
	}

}
