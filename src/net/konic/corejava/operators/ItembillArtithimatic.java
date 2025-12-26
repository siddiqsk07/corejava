package net.konic.corejava.operators;

import java.util.Scanner;

public class ItembillArtithimatic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Item price :");
		int a=sc.nextInt();
		
		System.out.println("Enter Item Quantity :");
		int b=sc.nextInt();
		
		System.out.println("Enter tax :");
		float c=sc.nextFloat();
		
		System.out.println("Finalbill :"+(a*b+c));
		
		
	}

}
