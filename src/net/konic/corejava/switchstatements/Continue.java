package net.konic.corejava.switchstatements;

import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		System.out.println("Enter Skip Value :");
		int inte=j.nextInt();
		
		System.out.println("Enter A Number :");
		for(int i=1;i<=10;i++) {
			if(i == inte) {
				continue;
			}
				System.out.println(i);
			}
		}
	}


