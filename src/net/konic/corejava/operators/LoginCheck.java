package net.konic.corejava.operators;

import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String correctusername="SIDDIQ06";
		String correctpasswor="siddiq786123";
		
		System.out.println("Enter username :");
		String username=sc.nextLine();
		
		System.out.println("Enter password :");
		String password=sc.nextLine();
		
	 
		if(username.equals(correctusername) && password.equals(correctpasswor)) {
			System.out.println("Login Sucesses");
		}else {
			System.out.println("Login Failed");
		}
		
	}
}