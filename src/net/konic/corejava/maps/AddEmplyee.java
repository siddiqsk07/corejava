package net.konic.corejava.maps;

import java.util.*;

import net.konic.corejava.collections.Employee;

public class AddEmplyee {
	Map<Integer,Employee> adddetails(){
		Employee emp=new Employee();
		emp.setEmployeeName("Ayaan");
		emp.setId(101);
		emp.setRole("IT");
		
		Employee emp1=new Employee();
		emp1.setEmployeeName("Rahim");
		emp1.setId(102);
		emp1.setRole("HR");
		
		Employee emp2= new Employee();
		emp2.setEmployeeName("SARA");
		emp2.setId(103);
		emp2.setRole("Finance");
		
		Map map=new HashMap<>();
		map.put(101,emp);
		map.put(102,emp1);
		map.put(103,emp2);
		return map;
	}
	public static void main(String[] args) {
		AddEmplyee emplyee=new AddEmplyee();
		Map<Integer,Employee> details=emplyee.adddetails();
		
		System.out.println("Employee Details :"+details);
	
		
	}

}
