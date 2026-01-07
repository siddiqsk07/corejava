package net.konic.corejava.collections;

import java.util.*;

public class GetStudentByIndex {
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
		GetStudentByIndex get = new GetStudentByIndex();
		String Index = get.addStudents().get(2);
		System.out.println("Student at index 2 :" + Index);

	}

}
