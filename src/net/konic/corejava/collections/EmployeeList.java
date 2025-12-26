package net.konic.corejava.collections;

import java.util.*;

public class EmployeeList {
	List<Employee> addemployeedata() {
		Employee emp=new Employee();
		emp.setEmployeeName("Siddiq");
		emp.setId(01);
		emp.setSalary(52652);
		
		Employee emp1=new Employee();
		emp1.setEmployeeName("srikanth");
		emp1.setId(55);
		emp1.setSalary(90000);
		
		List list=new ArrayList<>();
		
		list.add(emp);
		list.add(emp1);
		
		return list;
		
		

	}

	public static void main(String[] args) {
		EmployeeList emp2=new EmployeeList();
		List<Employee> output=emp2.addemployeedata();
		System.out.println(output.get(0));
		

	}

}
