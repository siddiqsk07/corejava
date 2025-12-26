package net.konic.corejava.collections;

import java.util.LinkedList;
import java.util.List;

public class ListWithoutGeneric {
	public static  void main(String[] args) {
		List list=new LinkedList<>();
		list.add(1);
		list.add("Siddiq Shaik");
		list.add(1.0f);
		list.add(1.520);
		list.add(9876543210L);
		list.add(null);
		
		System.out.println(list.set(3, "Siddiq"));
		
		System.out.println(list.set(5, "Wahid"));
		
		
		
		
		System.out.println(list);
	}

}
