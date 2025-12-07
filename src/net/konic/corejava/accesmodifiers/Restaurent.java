package net.konic.corejava.accesmodifiers;



public class Restaurent {

	static String RestaurantName = "Minarva";
	String CustomerName;

	public Restaurent(String name) {
		CustomerName = name;
		System.out.println("Custumer Name :" + CustomerName);
	}

	public void orderfood(int choices) {
		switch (choices) {
		case 1:
			System.out.println("Added :pizza (₹200)");
			break;
		case 2:
			System.out.println("invalid option");
			break;
		}

	}
	public static void main(String[] args) {
		System.out.println("Restaurant NAme :"+RestaurantName);
		Restaurent restaurent=new Restaurent("Siddiq");
		restaurent.orderfood(2);
	}

}
