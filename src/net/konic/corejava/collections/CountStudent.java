package net.konic.corejava.collections;

import java.util.*;

public class CountStudent {
	static List<String> addStudents() {
		List<String> students = new ArrayList();
		students.add("Ayaan");
		students.add("Rahim");
		students.add("Sara");
		students.add("John");
		students.add("Ali");

		return students;

	}

	public static void main(String[] args) {
		CountStudent count= new CountStudent();
		int Total=count.addStudents().size();
		System.out.println("Total Student :"+Total);

	}

}
