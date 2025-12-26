package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class UpdatePrice {
	List price = new LinkedList<>();

	List updatePrice() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(1, 150);
		price.set(2, 250);
		return price;

	}

	public static void main(String[] args) {
		UpdatePrice updateprice = new UpdatePrice();
		List afterUpdate = updateprice.updatePrice();
		System.out.println("Prices After Update:" + afterUpdate);

	}

}
