package net.konic.corejava.operators;

import java.util.Scanner;

public class MovieEligibility {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Checking Movie Eligibility");
		System.out.println("Enter age =");
		int age=sc.nextInt();
		
		if(age > 18) {
			System.out.println("Allowed ");
		}else {
			System.out.println("Not Allowed");
		}
	}

}
