package net.konic.corejava.abstract1;

	

class Hitachi extends Airconditioner {

	@Override
	void Cooling() {
		System.out.println("Hitachi Air Conditioner Has Cooling Feauture");

	}

	@Override
	void Temparature() {
		System.out.println("Hitachi Air Conditioner Has Set TEmparature Feauture");
	}

	@Override
	void Heat() {
		System.out.println("Hitachi Air Conditioner Has Heat Feauture");

	}

	void Timer() {
		System.out.println("IT WILL STOP AT CERTINE TIME PERIOD");
	}

}
abstract public class Airconditioner {
	void Feautures() {
		System.out.println("This is a Air Conditioner Feautures");
	}

	abstract void Cooling();

	abstract void Temparature();

	abstract void Heat();

	public static void main(String[] args) {
		Hitachi ac = new Hitachi();
		ac.Cooling();
		ac.Heat();
		ac.Temparature();
		ac.Feautures();
	}

}
