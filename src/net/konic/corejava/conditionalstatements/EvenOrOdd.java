package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		
		if(number%3 ==0) {
			System.out.println("it is even number");
			
		}else {
			System.out.println("it is odd number");
				
		}
		sc.close();
	}

}
