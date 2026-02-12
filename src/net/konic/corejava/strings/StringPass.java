package net.konic.corejava.strings;

public class StringPass {
	public static void main(String[] args) {
		String Password="Admin@156";
		
		Password.concat("Siddiq@132");
		
		System.out.println("PAssword :"+Password);
		
		Password=Password.concat("Siddiq@143");
		System.out.println("Concate Password :"+Password);
	}

}
