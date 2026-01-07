package net.konic.corejava.encapsulation;

class MobilePin {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		if (pin >= 1000 && pin <= 9999) {
			this.pin = pin;
			System.out.println("Sucessesfuly pin is generated");
		} else {
			System.out.println("Invalid Pin");
		}
	}

}

public class MobilePinSecurity {
	public static void main(String[] args) {
		MobilePin mpin = new MobilePin();
		mpin.setPin(123);
		System.out.println("Pin :" + mpin.getPin());

	}

}
