package net.konic.corejava.has;

class Adress {
	String City;
	int pincode;

	public Adress(String c, int a) {
		this.City = c;
		this.pincode = a;
	}
}

public class Student {
	String name;
	Adress adress;

	public Student(String n) {
		this.name = n;
	

	}
	public static void main(String[] args) {
		Student std=new Student("Siddiq");
		System.out.println("Name :"+std.name);
		
		Adress add= new Adress("Hyderabad", 500001);
		System.out.println("City :"+add.City);
		System.out.println("Pin Code :"+add.pincode);
		
		
	}

}
