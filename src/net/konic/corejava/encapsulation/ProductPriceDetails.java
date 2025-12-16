package net.konic.corejava.encapsulation;

class ProductPriceControl {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("Invalid Price");
		}
	}

}

public class ProductPriceDetails {
	public static void main(String[] args) {
		ProductPriceControl price = new ProductPriceControl();
		price.setPrice(-500);
		System.out.println("Price :" + price.getPrice());

	}

}
