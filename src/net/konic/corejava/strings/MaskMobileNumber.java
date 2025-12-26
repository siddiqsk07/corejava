package net.konic.corejava.strings;

public class MaskMobileNumber {
	public static void main(String[] args) {
		StringBuffer num=new StringBuffer("9876543210");
		num.replace(2,num.length()-2,"******");
		System.out.println("Masked Number :"+num);

	}
}
