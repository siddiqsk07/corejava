package net.konic.corejava.execeptions;

public class Example2 {
	public static void main(String[] args) {
		try {
			String s= null;
			System.out.println(s.length());
		}catch (NullPointerException e) {
			System.out.println("It is null pointer Exception");
			// TODO: handle exception
		}
	}
}