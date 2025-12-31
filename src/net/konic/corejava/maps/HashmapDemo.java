package net.konic.corejava.maps;
import java.util.HashMap;

import java.util.Map;

public class HashmapDemo {
	

	

	public static void main(String[] args) {
	 
	        // 1️⃣ Default constructor

	        // No guarantee of order

	        Map<Integer, String> map = new HashMap<>();
	 
	        // PUT operation (add key-value)

	        map.put(101, "Ayaan");

	        map.put(102, "Rahim");

	        map.put(103, "Sara");
	 
	        // Duplicate key → old value replaced

	        map.put(102, "Rahim Khan");
	 
	        // One null key allowed

	        map.put(null, "Admin");
	 
	        // Multiple null values allowed

	        map.put(104, null);
	 
	        System.out.println("HashMap data:");

	        System.out.println(map);
	 
	        // GET operation (retrieval by key)

	        System.out.println("Value for key 101: " + map.get(101));
	 
	        // CONTAINS KEY

	        System.out.println("Contains key 103? " + map.containsKey(103));
	 
	        // CONTAINS VALUE

	        System.out.println("Contains value Sara? " + map.containsValue("Sara"));
	 
	        // REMOVE operation

	        map.remove(104);

	        System.out.println("After removing key 104: " + map);
	 
	        // SIZE

	        System.out.println("Size of HashMap: " + map.size());
	 
	        // ITERATION (best way)

	        System.out.println("Iterating HashMap:");

	        for (Map.Entry<Integer, String> entry : map.entrySet()) {

	            System.out.println(entry.getKey() + " -> " + entry.getValue());

	        }

	    }

}


