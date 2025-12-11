package net.konic.corejava.inherit;

class Mobile {
	void Commonfeauture() {
		System.out.println("Common Feautures Of Mobile");
	}

}

class Samsung extends Mobile {
	void SamsungFeauture() {
		System.out.println("Samsung Special Feauture");
	}
}

class Iphone extends Mobile {
	void IphoneFeautures() {
		System.out.println("Iphone Special Feauture");
	}
}

public class Mobilemain {
	public static void main(String[] args) {
		Samsung mobile = new Samsung();
		mobile.Commonfeauture();
		mobile.SamsungFeauture();

		Iphone apple = new Iphone();
		apple.Commonfeauture();
		apple.IphoneFeautures();
	}

}