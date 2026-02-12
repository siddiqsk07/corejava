package net.konic.corejava.collections;

import java.util.*;

public class CheckQueueSize {
	public static int size() {
		List<String> queue = new LinkedList<>();

		queue.add("C1");
		queue.add("C2");

		

		return queue.size();
	}

	public static void main(String[] args) {
		CheckQueueSize size = new CheckQueueSize();
		System.out.println("Toatal Customers :" + size.size());

	}
}
