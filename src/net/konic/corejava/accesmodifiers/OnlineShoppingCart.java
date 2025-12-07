package net.konic.corejava.accesmodifiers;

public class OnlineShoppingCart {
	static String website="Amazon";
	String customerName;
	
	public OnlineShoppingCart(String n) {
		customerName=n;
	}
	public void additen(int itemid) {
		switch(itemid) {
		case 1:
			System.out.println("shoes(₹1500)");
			break;
		case 2:
			System.out.println("Refridgerator-Samsung 256liters");
			break;
		case 3:
			System.out.println("Telivision-Samsung tv 55inches");
			break;
		case 4:
			System.out.println("Shirts");
			break;
		case 5:
			System.out.println("Kitchen appliances");
			break;
		case 6:
			System.out.println("Invalid option");
		}
	}
	public static void main(String[] args) {
		System.out.println("Websitename :"+website);
		OnlineShoppingCart cart=new OnlineShoppingCart("Siddiq");
		System.out.println("CustomerName :"+cart.customerName);
		cart.additen(1);
		
	}

}
