package net.konic.corejava.strings;

public class StringModificationReassignment {
	public static void main(String[] args) {
		String msg="Hello";
		
		msg.concat("World");
		
		msg=msg.concat(" World");
		System.out.println(msg);
		
	}

}
