package net.konic.corejava.methods;

public class CountryName {
	String name() {
		String Countryname="india";
		System.out.println("CountryName :"+Countryname);
		return Countryname;
		
	}
	public static void main(String[] args) {
		CountryName countryName=new CountryName();
		countryName.name();
	}

}
