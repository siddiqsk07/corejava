package net.konic.corejava.conditionalstatements;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteer a number :");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + "X" + i + "="+(i*2) );
		}
		
	}

}
