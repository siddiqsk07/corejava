package net.konic.corejava.strings;

public class DeleteLastDigit {
	public static void main(String[] args) {
		StringBuilder Otp = new StringBuilder("12345");
		Otp.deleteCharAt(4);
		System.out.println("Updated Otp :" + Otp);

	}

}
