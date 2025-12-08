package net.konic.corejava.polymorphysm;

public class ZomatoOrder {
	String order(String food) {
		return food;
		
	}
	void order(String food,int qty) {
		System.out.println("Order placed :"+food+" " +(qty)+" qty");
	}
	void order(String food,int qty,String taste) {
		System.out.println("Order Placed :"+food +" "+ (qty+" qty"+","+taste));
		
	}
	public static void main(String[] args) {
		ZomatoOrder order=new ZomatoOrder();
		System.out.println("Order Placed :"+order.order("Biriyani"));
		order.order("Biriyani", 2);
		order.order("Biriyani", 2, "tasty");
		
	}

}
