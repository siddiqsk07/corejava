package net.konic.corejava.operators;

import java.util.Scanner;

import net.konic.corejava.objectsclassesandmethods.Bike;

public class StudentsMareks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the marks :");
		int marks=sc.nextInt();
		
		
		
		if(marks >=35) {
			System.out.println("isPassed");
		}else {
			System.out.println("is failed");
		}
		
		
		
			
	}

}
