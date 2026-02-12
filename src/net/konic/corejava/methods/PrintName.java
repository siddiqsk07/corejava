package net.konic.corejava.methods;

public class PrintName {
	public void Name() {
		String Firstname="Shaik";
		String Secondname=" Siddiq";
		String Fullname=Firstname+Secondname;
		System.out.println(Fullname);
		
	}
	public static void main(String[] args) {
		PrintName fullName=new PrintName();
		fullName.Name();
	}

}
