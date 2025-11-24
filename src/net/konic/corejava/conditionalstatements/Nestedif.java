package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks :");
		float marks=sc.nextFloat();
		
		if(marks >=35) {
			if(marks >=80) {
				System.out.println("Passed in distintion");
			}else {
				System.out.println("passed...");
			}
		}else {
			System.out.println("Fail...");
		}
		sc.close();!~
				
	}

}
