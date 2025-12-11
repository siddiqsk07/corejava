package net.konic.corejava.isa;

class person {
	void setDetails(String name, int age) {

	}
}

class Employee extends person {
	void setDetails(String name, int age) {
		System.out.println("Employee Name :"+name);
		System.out.println("Age :"+age);

	}
	double Salary(double salary) {
		System.out.println("Salary :"+salary);
		return salary;
		
	}
	

}

public class EmployeeDetails {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setDetails("Shiraz", 28);
		emp.Salary(500000);

	}

}
