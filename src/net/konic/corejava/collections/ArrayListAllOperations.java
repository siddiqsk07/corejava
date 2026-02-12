package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAllOperations {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		long getStartTime = System.nanoTime();

		list.add(5);
		list.add(5);
		list.add(6);
		list.add(452);

		int value = list.get(2);

		long getEndTime = System.nanoTime();

		System.out.println("After Adding Element :" + list);
		System.out.println("Start Time :" + getStartTime + "ns");
		System.out.println("End Time " + getEndTime + "ns");
//Retrive
		System.out.println("Retrived Value :" + value);
		System.out.println("Update Retrive Time :" + (getEndTime - getStartTime) + "ns");
//Update Operations

		long updateStartTime = System.nanoTime();

		list.set(3, 652);
		long updateEndTime = System.nanoTime();
		System.out.println("Updated Value :" + list);
		System.out.println("Operation Time :" + (updateEndTime - updateStartTime) + "ns");

//Remove Elemenet

		long RemoveStartTime = System.nanoTime();
		list.remove(3);
		long RemoveEndTime = System.nanoTime();
		System.out.println("Removed value :" + list);

		System.out.println("REMOVE OPERATION TIME :" + (RemoveEndTime - RemoveStartTime));

//ArrayListSize
		System.out.println("Size Of ArrayList :" + list.size());

	}

}
