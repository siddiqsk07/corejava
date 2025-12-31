package net.konic.corejava.collections;

import java.util.*;

public class ListOfCars {
	List<Car> addCarDetails() {
		Car car1 = new Car(null);
		car1.setBrandName("BMW");
		car1.setPrice(1000000);
		car1.setColour("Blue");

		Car car2 = new Car(null);
		car2.setBrandName("Skoda");
		car2.setPrice(1500000);
		car2.setColour("Black");

		List car = new ArrayList<>();
		car.add(car1);
		car.add(car2);

		return car;

	}
	public static void main(String[] args) {
		ListOfCars car=new ListOfCars();
		List<Car> result=car.addCarDetails();
		System.out.println(result.get(1));
	}

}
