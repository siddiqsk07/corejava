package net.konic.corejava.collections;

import java.util.*;

public class AddVipQueue {
	 public static List<String> addVipQueue() {
	        List<String> queue = new LinkedList<>();

	        queue.add("C1");
	        queue.add("C2");
	        queue.add("C3");
	        queue.add(0,"VIP");

	        return queue;
	    }
	 public static void main(String[] args) {
		AddVipQueue add=new AddVipQueue();
		List update=add.addVipQueue();
		System.out.println("Queue After Update :"+update);
	}

}
