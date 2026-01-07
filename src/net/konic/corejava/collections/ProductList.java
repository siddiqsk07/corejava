package net.konic.corejava.collections;

import java.util.*;

public class ProductList {
	List price = new ArrayList();
	List addprice() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		return price;
		
	}
	public static void main(String[] args) {
		ProductList productprice=new ProductList();
		List prices=productprice.addprice();
		System.out.println("Prices :"+prices);
		
		
	}

}
