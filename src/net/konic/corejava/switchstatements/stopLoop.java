package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class stopLoop {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number(1 to 10) :");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i == num) {
				break;
				
			}
			System.out.println(i);
		}
		sc.close();
	}

}
