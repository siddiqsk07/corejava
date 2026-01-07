package net.konic.corejava.has;

public class Employee {
	String name;
	String mail;
	String role;
	Company company;
	Manager managersZQ;
	Address address;

	public Employee(String name, String mail, String role) {

		this.name = name;
		this.mail = mail;
		this.role = role;

	}

	public static void main(String[] args) {
		Company comp = new Company("Konic", "IT", 300, "konic7@gamil.com");
		System.out.println("Company name :" + comp.name);
		System.out.println("Department :" + comp.Department);
		System.out.println("EmployeeStrength :" + comp.EmployeeStrength);
		System.out.println("Company Email :" + comp.Email);

		Manager mng = new Manager("Razak", 98552546215l);
		System.out.println("Manager Name :" + mng.Name);
		System.out.println("Phone number :" + mng.phnNo);

		Address add = new Address("Harinath Puram", 524001, "Bismillah Masjid", 101);
		System.out.println("Street Name :" + add.streetName);
		System.out.println("Pin Code :" + add.pincode);
		System.out.println("Land MArk :" + add.LandMark);
		System.out.println("Flat No :" + add.FlatNo);

		Employee emp = new Employee("Siddiq", "siddiqsk2762@gmail.com", "Java Developper");
		System.out.println("Employee Name :" + emp.name);
		System.out.println("Employee Email :" + emp.mail);
		System.out.println("Employee Role :" + emp.role);

	}

}
