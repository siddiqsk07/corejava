package net.konic.corejava.collections;

import java.util.*;

public class RemoveLastCustomer {
	public static List<String> removeLast() {
        List<String> queue = new LinkedList<>();

        queue.add("C1");
        queue.add("C2");
        queue.add("C3");
        queue.removeLast();

        return queue;
    }

    public static void main(String[] args) {
    	RemoveLastCustomer remove=new RemoveLastCustomer();
    	System.out.println("Queue After Remove "+remove.removeLast());
    	
       
    }
}






