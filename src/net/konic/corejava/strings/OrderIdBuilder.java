package net.konic.corejava.strings;

public class OrderIdBuilder {
	public static void main(String[] args) {
		StringBuilder base=new StringBuilder("ORD");
		base.append("1001");
		
		System.out.println("Order Id :"+ base);
	}

}
