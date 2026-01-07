package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class SkipAnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int s=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i == s) {
				continue;
			}
			System.out.println(i);
		}
		sc.close();
	}

}
