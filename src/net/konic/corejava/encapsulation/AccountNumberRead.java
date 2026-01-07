package net.konic.corejava.encapsulation;

class Account {
	private long accountNumber;

	public long getAccountNumber(long acc) {
		return accountNumber;
	}

}

public class AccountNumberRead {
	public static void main(String[] args) {
		Account acc=new Account();
		System.out.println("AccountNumber :"+ acc.getAccountNumber(07721010005));
		
	}

}
