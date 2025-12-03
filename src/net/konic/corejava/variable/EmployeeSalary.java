package net.konic.corejava.variable;



public class EmployeeSalary {
	String name;
	int Salary;
	
	public void setDetails(String n,int S) {
		name = n;
		Salary=S;
	}
	public double getYearlySalary() {
		return Salary * 12;
	}
	public static void main(String[] args) {
		EmployeeSalary sal=new EmployeeSalary();
		sal.setDetails("Asif", 25000);
		sal.getYearlySalary();
	   double yearlySalary= sal.getYearlySalary();
	   System.out.println("EmployeeName :"+sal.name);
	   System.out.println("Annual Salary :"+yearlySalary);
		
	}

}
