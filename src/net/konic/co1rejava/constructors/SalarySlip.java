package net.konic.co1rejava.constructors;

public class SalarySlip {
	String Name;
	double MonthlySalary;
	double yearlySalary;

	SalarySlip(String name, double Salary) {
		Name = name;
		MonthlySalary = Salary;
		yearlySalary=0;

	}
	public double yearlySalary() {
		return MonthlySalary * 12;
	}
	public static void main(String[] args) {
		SalarySlip sal=new SalarySlip("Siddiq", 30000);
		sal.yearlySalary();
		System.out.println("Employee :"+sal.Name);
		System.out.println("Monthly Salary :"+sal.MonthlySalary);
		System.out.println("YearlySalary :"+sal.yearlySalary());
	}

}
