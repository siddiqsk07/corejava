package net.konic.corejava.objectsandclasses;

public class Object {
	public static void main(String[] args) {
		//object
		
		Bike bike=new Bike();
		
		bike.brandName="Honda";
		bike.color="Black";
		bike.Capacity=15;
		bike.engineCC=125;
		bike.fueltype="Petrol";
		
		bike.start();
		
		Sofa sofa=new Sofa();
		sofa.Fabric="Cotton";
		sofa.height=2;
		sofa.lenghth=125.75;
		sofa.width=17;
		sofa.Seating();
	}

}
