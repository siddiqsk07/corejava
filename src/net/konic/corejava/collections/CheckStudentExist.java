package net.konic.corejava.collections;

import java.util.*;

public class CheckStudentExist {
	
		List<String> students=new ArrayList();
		public boolean checkStudent(String name) {
		
		students.add("Ayaan");
		students.add("Rahim");
		students.add("Sara");
		students.add("John");
		students.add("Ali");
		
		
		return students.contains("john");
		}
	
	public static void main(String[] args) {
		CheckStudentExist check=new CheckStudentExist();
		boolean exist=check.checkStudent("john");
		if(exist) {
			System.out.println("Student Found");
		}else {
			System.out.println("Student Nott Found");
		}
		
		
	}

}
