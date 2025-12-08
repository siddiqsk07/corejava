package net.konic.corejava.polymorphysm;

public class OnlineShopping {
	int addToCart(int itmid) {
		return itmid;
	}

	void addToCArt(int itmid, int quantity) {
		System.out.println("Product "+itmid+" added with quantity "+quantity);
	}

	void addToCart(String itmNAme) {
		System.out.println(itmNAme + " added To Cart");

	}

	public static void main(String[] args) {
		OnlineShopping shop=new OnlineShopping();
		System.out.println("product "+shop.addToCart(101)+" Added to Cart");
		shop.addToCArt(101, 3);
		shop.addToCart("Earphone");
	}

}
