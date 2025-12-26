package net.konic.corejava.ststicandnonstatic;

public class Employee {
	static String CompanyNane="Google";
	String EmployeeName;
	int EmployeeId;
	
	public Employee(String empname,int empid) {
	EmployeeName=empname;
	EmployeeId=empid;
	}
	public static void main(String[] args) {
		System.out.println("Company Name :"+CompanyNane);
		Employee emp=new Employee("Siddiq", 101);
		System.out.println("Employee Id :"+emp.EmployeeId);
		System.out.println("Employee Name :"+emp.EmployeeName);
	}

}
