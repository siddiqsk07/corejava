package net.konic.corejava.inherit;

class SBI extends Bank {
	void Sbifeautures() {
		System.out.println("Unlimited Atm withdrawls");
	}

	void deposite() {
		System.out.println("SBI Deposite Sucessesful");
	}
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.deposite();

		sbi.deposite1();
	}
}