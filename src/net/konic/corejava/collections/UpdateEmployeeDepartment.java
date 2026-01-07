package net.konic.corejava.collections;

import java.util.*;

public class UpdateEmployeeDepartment {

	Employee updateDetails() {
		Employee emp = new Employee();
		emp.setEmployeeName("Ayaan");
		emp.setId(101);
		emp.setRole("IT");

		Employee emp1 = new Employee();
		emp1.setEmployeeName("Rahim");
		emp1.setId(102);
		emp1.setRole("HR");

		Employee emp3 = new Employee();
		emp3.setEmployeeName("Sara");
		emp3.setId(103);
		emp3.setRole("Finance");

		List list = new ArrayList<>();

		list.add(emp);
		list.add(emp1);
		list.add(emp3);

		Employee role = new Employee();
		role.setRole("admin");

		return role;

	}

	public static void main(String[] args) {
		UpdateEmployeeDepartment update = new UpdateEmployeeDepartment();

	}

}
