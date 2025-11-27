package net.konic.corejava.objectsclassesandmethods;

public class Laptop {
	String brand;
	String processor;
	float length;
	double width;
	int height;

	public String videoediting() {
		System.out.println("Brand Name :" + brand);
		System.out.println("Processor :" + processor);
		System.out.println("Length of Laptop :" + length);
		System.out.println("Width of Laptop :" + width);
		System.out.println("Height of Lapptop : " + height);

		 return "it has graphic card";

	}

	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.brand = "HP";
		lap.height = 2;
		lap.length = 7.5f;
		lap.width = 14.5;
		lap.processor = "I5";
		lap.videoediting();
	}

}
