package net.konic.corejava.encapsulation;
class StudentProfile{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >=5 && age <=100) {
		this.age = age;
		System.out.println("Valid Age");
		}else {
			System.out.println("Invalid Age");
		}
	}
	
	
}

public class StudentAgeValidation {
	public static void main(String[] args) {
		StudentProfile age=new StudentProfile();
		age.setAge(35);
		int validage=age.getAge();
		System.out.println("Age :"+validage);
	}

}
