package net.konic.corejava.interface1;

interface Pay {

	void pay();

	void scanQR();

	String UpiNumber();

	void UpiLite();

	long PayToNumber();

	void TransactionHistroy();

	void ChechBalance();

	void ApplyLoan();

}

class PhonePay implements Pay {

	@Override
	public void pay() {
		System.out.println("Phonepay has pay feauture");

	}

	@Override
	public void scanQR() {
		System.out.println("Phonepay has scan Feauture");

	}

	@Override
	public String UpiNumber() {

		return "9000000000l@sbi";
	}

	@Override
	public void UpiLite() {
		System.out.println("Phone pay has Upi lite Feauture for pinless and fast payments");

	}

	@Override
	public long PayToNumber() {

		return 9000000000l;
	}

	@Override
	public void TransactionHistroy() {
		System.out.println("Phonepay has feauture for for storing Transaction History");

	}

	@Override
	public void ChechBalance() {
		System.out.println("Phonepay has balance Checking feauture");

	}

	@Override
	public void ApplyLoan() {
		System.out.println("Phonepay has lone apply feauture");

	}

}

public class UpiBanking {
	public static void main(String[] args) {
		Pay pay = new PhonePay();
		pay.pay();
		pay.scanQR();
		pay.UpiNumber();
		pay.UpiLite();
		pay.PayToNumber();
		pay.TransactionHistroy();
		pay.ChechBalance();
		pay.ApplyLoan();

	}

}
