package net.konic.corejava.isa;
class BankLoan{
	void calculateEmi() {
		
	}
}
class CarLoan extends BankLoan{
	void calculateEmi() {
		System.out.println("Calculating EMI for Car Loan");
	}
}
class HomeLoan extends BankLoan{
	void calculateEmi() {
		System.out.println("Calculating EMI For Home Loan");
		
	}
	
}

public class LoanDetails {
	public static void main(String[] args) {
		HomeLoan loan=new HomeLoan();
		loan.calculateEmi();
		CarLoan emi= new CarLoan();
		emi.calculateEmi();
	}

}
