package net.konic.corejava.objectsclassesandmethods;

public class TestCharger {
	public static void main(String[] args) {
		Charger charger=new Charger();
		charger.brandName="HP";
		charger.cableType="Type C";
		charger.power=120;
		
		charger.chargebattery();
	}

}
