package net.konic.corejava.operators;

import java.util.Scanner;

public class BankTokens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int token = 100;

        System.out.print("Tokens issued by bank : ");
        int count = sc.nextInt();

        if (count >= 1) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 2) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 3) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 4) {
            token++;
            System.out.println("Token: " + token);
        }
        if (count >= 5) {
            token++;
            System.out.println("Token: " + token);
        }

        sc.close();
		
	}
		}


