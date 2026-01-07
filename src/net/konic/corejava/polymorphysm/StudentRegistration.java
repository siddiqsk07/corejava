package net.konic.corejava.polymorphysm;

public class StudentRegistration {
	String register(String name) {
		return name;
	}
	void register(String n,int age) {
		System.out.println("Registered :"+n+" Age :"+age);
	}
	void register(String n,int age,String city) {
		System.out.println("Registered :"+n+" Age :"+ age +" City :"+city);
		
	}
	public static void main(String[] args) {
		StudentRegistration stud=new StudentRegistration();
		System.out.println("Registered :"+stud.register("Siddiq"));
		stud.register("Siddiq", 21);
		stud.register("Siddiq", 21, "Nellore");
		
	}

}
