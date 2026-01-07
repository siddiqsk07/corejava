package net.konic.corejava.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

import net.konic.corejava.collections.Employee;

public class UpdateDept {
	Map<Integer, Employee> map = new HashMap();

	Map<Integer, Employee> adddetails() {
		Employee emp = new Employee();
		emp.setEmployeeName("Ayaan");
		emp.setId(101);
		emp.setRole("IT");

		Employee emp1 = new Employee();
		emp1.setEmployeeName("Rahim");
		emp1.setId(102);
		emp1.setRole("HR");

		Employee emp2 = new Employee();
		emp2.setEmployeeName("SARA");
		emp2.setId(103);
		emp2.setRole("Finance");

		map.put(emp.getId(), emp);
		map.put(emp1.getId(), emp1);
		map.put(emp2.getId(), emp2);

		return map;

	}

	public static void main(String[] args) {
		UpdateDept dept = new UpdateDept();
		dept.adddetails();
		dept.map.get(103).setRole("Admin");
		System.out.println("Update Department :" + dept.map.get(103));

//		for (Integer key : dept.map.keySet()) {
//			System.out.println(dept.map.get(key));
//		}
	}
//
}
