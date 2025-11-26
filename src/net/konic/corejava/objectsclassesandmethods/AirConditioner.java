package net.konic.corejava.objectsclassesandmethods;

 class Airconditioners {
	String brandname;
	int star;
	int ton;
	String wificonnectivity;
	int manufactureyear;
	double power;
	
	
	void cooling() { 
		System.out.println("Ac is Started Cooling");
		System.out.println("Brand Name :"+brandname);
		System.out.println("How Many Stars :"+star);
		System.out.println("Wifi connectivity :"+wificonnectivity);
		System.out.println("Manufacture year :"+manufactureyear);
		System.out.println("Power :"+power);
	}
	

}
public  class AirConditioner{
	public static void main(String[] args) {
		Airconditioners Ac=new Airconditioners();
		Ac.brandname="Hitachi";
		Ac.manufactureyear=2025;
		Ac.star=5;
		Ac.ton=5;
		Ac.power=744.54;
		Ac.wificonnectivity="Yes";
		Ac.cooling();
		
		
		
		
	}
	
}