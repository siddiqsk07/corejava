package net.konic.corejava.has;

 class PaymentDetails {
	String method;
	double amount;
	
	public PaymentDetails(String m,double a) {
		this.method=m;
		this.amount=a;
	}
	
}
class Order { 
	PaymentDetails details;
	
	void Display() {
		System.out.println("Order Placed Sucessfully");
	}
	public static void main(String[] args) {
		Order order=new Order();
		order.Display();
		
		PaymentDetails pay=new PaymentDetails("UPI", 550.00);
		System.out.println("Payment Method :"+pay.method);
		System.out.println("Amount :"+pay.amount);
	}
	
	
}