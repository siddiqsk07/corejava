package net.konic.corejava.operators;

import java.util.Scanner;

public class AssignmentOperators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		float a=sc.nextFloat();
		
		
		float x=a;
		
		x+=5.6;
		System.out.println("x+=5.6 :"+ x);
		
		x-=2.4;
		System.out.println("x-=2.4 :"+x);
		
		x*=2.4;
		System.out.println("x *=2.4"+x);
		
		x /=15.4;
		System.out.println("x /=15.4"+x);
		
		
		
		
	}

}
