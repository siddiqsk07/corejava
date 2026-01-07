package net.konic.corejava.inherit;
//child class
public class Car1 extends Vehicle {
	int seat;
	void showCarinfo() {
		System.out.println(seat);
	}
	void eng() {
		
	}
	public static void main(String[] args) {
		Car1 car=new Car1();
		car.brand="BMW";
		car.seat=7;
		car.wheels=4;
		
		
		car.engine();
		System.out.println("Brand Name :"+car.brand);
		System.out.println("Seats :"+car.seat);
		System.out.println("Wheels :"+car.wheels);
		
	}

}
 
