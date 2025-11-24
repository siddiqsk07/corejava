package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class OrderStatus {
	public static void main(String[] args) {
		Scanner status=new Scanner(System.in);
		System.out.println("Enter Order ID :");
		String Amazon=status.next();
		
		switch(Amazon) {
		
		case "1":
			System.out.println("Processing");
			break;
		case "2":
			System.out.println("In Transit");
			break;
		case "3":
			System.out.println("SHIPPED");
			break;
		case "4":
			System.out.println("Arrived at nearest Store");
			break;
		case "5":
			System.out.println("Out For Delivary");
			break;
		case "6":
			System.out.println("Delivered");
			break;
			default:
				System.out.println("Invalid");
		}
		status.close();
	}

}
