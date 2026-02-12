package net.konic.corejava.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.konic.corejava.collections.Employee;

public class GetEmployeeById {
	//Map<Integer, Employee> map = new LinkedHashMap();

	Employee adddetails() {
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

		Map<Integer,Employee> map = new HashMap<>();
		map.put(101, emp);
		map.put(102, emp1);
		map.put(103, emp2);
		
		return  map.get(102);
		
		
		
	
	}

	public static void main(String[] args) {
		GetEmployeeById id = new GetEmployeeById();

		Employee details=id.adddetails();
		System.out.println("Employee Found :"+id.adddetails());

	}

}
