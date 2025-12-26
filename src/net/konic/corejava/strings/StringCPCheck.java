package net.konic.corejava.strings;

public class StringCPCheck {
	public static void main(String[] args) {
		String s1="Hotel";
		String s2="Hotel";
		
		if(s1==s2) {
			System.out.println("Saved in same memory Location");
		}else {
			System.out.println("Saved in heap memory");
		}
	}

}
