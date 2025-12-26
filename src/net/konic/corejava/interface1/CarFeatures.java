package net.konic.corejava.interface1;

interface Car {
	public static final int Tyres = 4;

	void Start();

	int seats();

	String engine();

	void Display();

	void speakers();

	void carType();

	int groundClearence();

}
class Tata implements Car{

	@Override
	public void Start() {
		System.out.println("Tata car is Starting");
		
	}

	@Override
	public int seats() {
		
		return 7;
	}

	@Override
	public String engine() {
		
		return "1.5 turbo diesel engine";
	}

	@Override
	public void Display() {
		System.out.println("Tata car  has 3 connected Display");
		
	}

	@Override
	public void speakers() {
	System.out.println("4 jbl speakers with Dolby atmos feauture");
		
	}

	@Override
	public void carType() {
		System.out.println("SUV");
		
	}

	@Override
	public int groundClearence() {
		
		return 227 ;
	}
	
}

public class CarFeatures {
	public static void main(String[] args) {
		System.out.println("Tyres :"+Car.Tyres);
		Car car=new Tata();
		car.seats();
		car.carType();
		car.engine();
		car.groundClearence();
		car.speakers();
		car.Display();
		car.Start();
	}

}
