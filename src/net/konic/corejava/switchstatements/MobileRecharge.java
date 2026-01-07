package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class MobileRecharge {
	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.println("Select Option");
		int val=d.nextInt();
	
		
		switch (val){
		case 1:
			System.out.println("Data Pack Selected");
			break;
		case 2:
			System.out.println("SMS Pack Selected");
			break;
		case 3:
			System.out.println("TOP UP pack Selected");
			break;
		
		}
		d.close();
	}
	

}
