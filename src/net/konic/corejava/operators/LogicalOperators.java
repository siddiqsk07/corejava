package net.konic.corejava.operators;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter New Number :");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		boolean cond1=(a >= b);
		boolean cond2=(a == b);
				
		
		System.out.println("Cond1 && Cond2 :" +(cond1 && cond2));
		System.out.println("Cond2 || Cond1 :" + (cond2 || cond1));
		
		
				
		
		
	}

}
