package net.konic.corejava.inherit;

class Manager {
	void Department(String sector) {
		System.out.println("Department :" + sector);
	}
}

class Employee extends Manager {
	void setDetails(String name, int salary) {
		System.out.println("Name :" + name);
		System.out.println("Salary :" + salary);

	}
}

public class EmployeeDetails {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setDetails("Siddiq", 50000);
		emp.Department("IT");
	}
}