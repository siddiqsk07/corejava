package net.konic.corejava.isa;
class Vehicle{
	void start() {
		
	}
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car is Starting");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike is Starting");
	}
}

public class VehiclesDetails {
	public static void main(String[] args) {
		Vehicle car=new Car();
		car.start();
		
		Vehicle bike=new Bike();
		bike.start();
		
	}

}
