package net.konic.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListWithGeneric {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Siddiq");
		list.add("Shaik");

		System.out.println("Full name :" + list);
		String FirstName = list.get(0);
		System.out.println("First Name :" + FirstName);
		String SecondName = list.get(1);
		System.out.println("Last Name :" + SecondName);
	}

}
