
package net.konic.corejava.strings;

public class StringBasic {
	public static void main(String[] args) {
		
		String name="konic";
		
		System.out.println("Company Name :"+name);
		System.out.println("Length :"+name.length());
		System.out.println("Uppercase :"+name.toUpperCase());
		System.out.println("LoweCase :"+name.toLowerCase());
		System.out.println("Char at index 3 :"+name.charAt(3));
		System.out.println("Contains K :"+name.contains("s"));
	}

}
