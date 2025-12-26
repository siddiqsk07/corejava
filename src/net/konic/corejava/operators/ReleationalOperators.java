package net.konic.corejava.operators;

import java.util.Scanner;


public class ReleationalOperators {
	public static void main(String[] args) {
		
	
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter first number :");
	int a=sc.nextInt();
	
	System.out.println("Enter Second Number :");
	int b = sc.nextInt();
	
	System.out.println("a == b :"+(a == b));
	System.out.println("a != b :"+(a !=b));
	System.out.println("a > b :"+(a > b));
	System.out.println("a < b :"+(a < b));
	System.out.println("a >= b :"+(a >= b));
	System.out.println("a <= b :"+(a <= b));
	
	
	}

}
