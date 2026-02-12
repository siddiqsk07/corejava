package net.konic.corejava.collections;

import java.util.*;

public class GetPriceByIndex {
	List price = new ArrayList();

	List returnPrice() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		return price;

	}

	public static void main(String[] args) {
		GetPriceByIndex productprice = new GetPriceByIndex();
		List indexprice = productprice.returnPrice();
		System.out.println("Price At Index 3 :" + indexprice.get(3));

	}

}
