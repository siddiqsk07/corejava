package net.konic.corejava.polymorphysm;



public class AtmWithdrawal {
	void withdraw(int x) {
		System.out.println("Withdraw :"+"₹"+x);
		
	}
	double withrraw(double x) {
		return x;
	}
	
	void withdraw(int x,String y) {
		System.out.println("Withdraw :"+"₹"+x+y);
		
	}
	
	public static void main(String[] args) {
		AtmWithdrawal atm=new AtmWithdrawal();
		atm.withdraw(500);
		System.out.println("Withdraw :"+"₹"+atm.withrraw(500.75));
		atm.withdraw(1000, " from current account");
		
	}

}
