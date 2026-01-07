package net.konic.corejava.strings;

public class StringImmutability {
	public static void main(String[] args) {
		String Password = "admin@123";

		Password.concat("Siddiq@123");

		System.out.println(Password);
	}

}
