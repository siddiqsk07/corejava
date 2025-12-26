package net.konic.corejava.collections;

import java.util.*;

public class CustomerQueue {

	
	    public static LinkedList<String> createQueue() {
	        LinkedList<String> queue = new LinkedList<>();

	        queue.add("C1");
	        queue.add("C2");
	        queue.add("C3");

	        return queue;
	    }

	    public static void main(String[] args) {
	        System.out.println("Queue: " + createQueue());
	    }
	}



