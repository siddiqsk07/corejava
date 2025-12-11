package net.konic.corejava.has;

public class Vehicle {

	void startengine() {
		System.out.println("Engine Started");
	}

	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.startengine();

		Car car = new Car();
		car.start();
	}

}

class Car {

	void start() {
		System.out.println("Car is moving");
	}

}
