package net.konic.corejava.maps;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

import net.konic.corejava.collections.Car;

public class StudentDetails {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		System.out.println("STUDENT DATA");

		map.put(101, "Siddiq");
		map.put(102, "Srikanth");
		map.put(103, "Wahid");
		map.put(103,"Wahid Syed");
		map.put(null, "Siddiq Shaik");
	

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue()+ "->" + entry.getKey());
		}
		System.out.println("RETRIVING VALUE");
		System.out.println(map.entrySet());
		System.out.println("Removing Entry 102 :"+map.remove(102));
		System.out.println("DOES VALUE EXIST IN ENTRY "+map.containsValue("Wahid"));
		System.out.println("Size Of Entries :"+map.size());
		System.out.println("DOes key Contains :"+map.containsKey(102));
		System.out.println(map);
		
	}

}