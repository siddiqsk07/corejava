package net.konic.corejava.strings;

public class StringImmutable {
	public static void main(String[] args) {

		String Full_NAME = "SIDDIQ";

		// concat

		Full_NAME.concat("Shaik Siddiq");
		System.out.println( "Name :"+Full_NAME);
		
		Full_NAME=Full_NAME.concat("SHAIK SIDDIQ");
		System.out.println("Name After Concate:"+Full_NAME);

	}

}
