package net.konic.corejava.collections;

import java.util.*;

public class ServedCustomer {
	public static String servedCustomer() {
		List<String> queue = new LinkedList<>();

		queue.add("C1");
		queue.add("C2");
		queue.add("C3");
		queue.add(0, "VIP");

		return queue.remove(0);
	}

	public static void main(String[] args) {
		ServedCustomer serve = new ServedCustomer();
		String customername=serve.servedCustomer();
		System.out.println("Serverd Customer :"+customername);
		System.out.println("Reamaining Queue :"+serve.servedCustomer());

	}

}
