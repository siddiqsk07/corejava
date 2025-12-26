package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class PositivityCheck {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter a number:");
	 int num=sc.nextInt(); 
	 
	 if(num>10) {
		 System.out.println("Positive");
	 }else {
		 System.out.println("Negitive");
		 sc.close();
	 }
		
	}
	

}
