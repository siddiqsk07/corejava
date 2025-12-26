package net.konic.corejava.ststicandnonstatic;

public class Vehicle {
	static int Wheels=4;
	String BrandName;
	
	public Vehicle(String name) {
		BrandName=name;
	}
	public static void main(String[] args) {
		System.out.println("Wheels :"+Vehicle.Wheels);
		Vehicle vehcle=new Vehicle("Audi");
		System.out.println("Vehicle Name :"+vehcle.BrandName);
		
		
	}
	

}
