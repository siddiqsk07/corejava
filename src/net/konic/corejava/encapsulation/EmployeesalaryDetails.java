package net.konic.corejava.encapsulation;
class Employee{
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class EmployeesalaryDetails {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setSalary(45000);
		double salary=emp.getSalary();
		System.out.println("Salary :"+salary);
	}

}
