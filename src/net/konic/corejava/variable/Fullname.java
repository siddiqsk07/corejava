package net.konic.corejava.variable;

import java.util.Scanner;

public class Fullname {
	
	String firstname;
	String lastname;
	
	public void readname() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name :"+firstname);
		firstname=sc.next();
		System.out.println("Enter Second NAme :"+lastname);
		lastname=sc.next();
		sc.close();
	}
	public String fullname() {
		return firstname + ""+lastname;
		
	}
	public static void main(String[] args) {
		Fullname fullname=new Fullname();
		fullname.readname();
		fullname.fullname();
		String Fullname=fullname.fullname();
		System.out.println("Full NAme :"+Fullname);
		
	}
	
	

}
