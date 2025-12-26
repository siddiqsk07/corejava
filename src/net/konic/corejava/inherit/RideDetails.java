package net.konic.corejava.inherit;



class Ola{
	void feature() {
		System.out.println("Basic Ride Started");
	}
}
class OlaMini extends Ola{
	void Feature1() {
		System.out.println("MINI :AC + Comfortable seat");
	}
}
class OlaPrime extends Ola{
	void feature2() {
		System.out.println("Luxury seat + Extra Comfort");
	}
}

public class RideDetails {
	public static void main(String[] args) {
		OlaMini ride=new OlaMini();
		ride.feature();
		ride.Feature1();
		
		OlaPrime ride2=new OlaPrime();
		ride2.feature();
		ride2.feature2();
		
	}

}
