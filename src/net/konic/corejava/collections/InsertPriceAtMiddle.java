package net.konic.corejava.collections;

import java.util.*;

public class InsertPriceAtMiddle {
	List price = new LinkedList<>();

	List insertPrice() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(1, 150);
		return price;

	}

	public static void main(String[] args) {
		InsertPriceAtMiddle productprice = new InsertPriceAtMiddle();
		List update=productprice.insertPrice();
		System.out.println("Updated Prices :"+update);

	}

}
