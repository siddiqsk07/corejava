package net.konic.co1rejava.constructors;

public class CarShowroom {
	String CarName;
	static int Carcount=0;
	
	public CarShowroom(String name) {
		CarName=name;
		Carcount++;
		
	}
	public static void main(String[] args) {
		CarShowroom car=new CarShowroom("Audi");
		CarShowroom car2=new CarShowroom("Kia");
		CarShowroom car3=new CarShowroom("suzuki");
		
				System.out.println("Car Name :"+car.CarName);
				System.out.println("Car Name :"+car2.CarName);
				System.out.println("Car Name :"+car3.CarName);
				
				System.out.println("Total Car Sold :"+car.Carcount);
	}
	

}
