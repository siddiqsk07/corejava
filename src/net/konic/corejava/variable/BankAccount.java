package net.konic.corejava.variable;

public class BankAccount {
	int balance;

	public void deposite(int amount) {
		balance = balance + amount;

	}

	public int getbalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposite(1200);
		int bal = acc.getbalance();
		System.out.println("Balance :" + bal);
	}

}
