package net.konic.corejava.encapsulation;

public class BankAccount {
	private int Balance;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.Balance = 5000;
		int balance = acc.getBalance();
		System.out.println("Balance :" + balance);
	}

}
