package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class ATMmenue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select Option :");
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1:
			System.out.println("Choose Account Type :");
			break;
		case 2:
			System.out.println("Withdrawn");
			break;
		case 3:
			System.out.println("Deposite");
			break;
		case 4:
			System.out.println("Balance Enquiry");
			break;
		case 5:
			System.out.println("Mini Statement");
			break;
		case 6:
			System.out.println("Generate pin");
			break;
		case 7:
			System.out.println("Exit...Thankyou!");
			break;
			
			default:
				System.out.println("Server not Found");
				}
		sc.close();
				
			
		}
		
	}


