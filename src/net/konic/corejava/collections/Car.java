package net.konic.corejava.collections;

public class Car {
	private String brandName;
	private double price;
	private String colour;
	public Car(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Car [brandName=" + brandName + ", price=" + price + ", colour=" + colour + "]";
	}
	
	

}
