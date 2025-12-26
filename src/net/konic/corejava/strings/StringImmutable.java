package net.konic.corejava.strings;

public class StringImmutable {
	public static void main(String[] args) {

		String name = "SIDDIQ";

		// concat

		name.concat("Shaik");
		System.out.println( "Name :"+name);
		
		name=name.concat("SHAIK SIDDIQ");
		System.out.println("Name After Concate:"+name);

	}

}
