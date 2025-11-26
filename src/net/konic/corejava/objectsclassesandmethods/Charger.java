package net.konic.corejava.objectsclassesandmethods;

public class Charger {
	
	String brandName;
	int power;
	
	String cableType;
	
	void chargebattery() {
		System.out.println("battery is in charge...");
		System.out.println("Brand Name :"+brandName);
		System.out.println("Power of charger :"+power);
	}

}
