package net.konic.corejava.strings;

public class IsEqual {
	public static void main(String[] args) {

		String s1 = "Siddiq";
		String s2 = "Siddiq";
		String s6 = "java";
		

		String s3 = new String("Java");
		String s4=new String("java");
		String s5=new String("Siddiq");
		
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		System.out.println(s1 .equals(s5));
		
		

	}
}
