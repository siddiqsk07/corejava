package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Option");
		int s=sc.nextInt();
		
		switch(s) {
		
		case 1:
			System.out.println("Enter Your Name :");
			int Name=sc.nextInt();
			break;
		case 2:
			System.out.println("Enter Your Account Number :");
			int Acc=sc.nextInt();
			break;
		case 3:
			System.out.println("Enter IFSC Code :");
			int Ifsc=sc.nextInt();
			break;
			default:
				System.out.println("Invalid option");
			
		}
		sc.close();
		
		
	
		
	}

}
