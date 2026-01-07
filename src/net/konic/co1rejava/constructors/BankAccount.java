package net.konic.co1rejava.constructors;



public class BankAccount {
	static String BankName = "SBI";

	int AccountNo;
	String HolderName;

	double balance;

	BankAccount(int accNo, String name) {
		AccountNo = accNo;
		HolderName = name;
		balance = 0;

	}
	public void deposite(double amount) {
		balance=balance+amount;
	}
	public static void main(String[] args) {
		BankAccount baAccount=new BankAccount(871, "Siddiq");
		baAccount.deposite(5000);
		System.out.println("Bank Name :"+BankName);
		System.out.println("Accouont Number :"+baAccount.AccountNo);
		System.out.println("HolderName :"+baAccount.HolderName);
		System.out.println("BALANCE :"+baAccount.balance);
		
	}

}