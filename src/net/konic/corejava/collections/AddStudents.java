package net.konic.corejava.collections;

import java.util.*;

public class AddStudents {
	

	public static List<String> addStudents() {
		List<String> students = new ArrayList<>();

		students.add("Ayaan");
		students.add("Rahim");
		students.add("Sara");
		students.add("John");
		students.add("Ali");

		return students;
	}

	public static void main(String[] args) {
		List<String> studentList = addStudents();
		System.out.println("Students: " + studentList);
	}


}
