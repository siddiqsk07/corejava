package net.konic.corejava.strings;

public class StringLiteralsVsNewString {
	public static void main(String[] args) {
		String name = "Siddiq";
		String Surname = "Shaik";

		String Surname2 = new String("Shaik");

		System.out.println("name == Surname :" + (name == Surname));

		System.out.println("Surname == Surname2 :" + (Surname == Surname2));

		System.out.println("Surname .equals Surname2 :" + (Surname.equals(Surname2)));
	}

}