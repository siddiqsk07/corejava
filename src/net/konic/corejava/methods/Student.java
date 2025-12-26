package net.konic.corejava.methods;



public class Student {
	String name;
	int age;
	String Branch;
	double percentage;
	
	public void Details() {
		System.out.println("Student Details");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Branch :"+Branch);
		System.out.println("Percentage :"+percentage);
	
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.name="Siddiq";
		student.age=22;
		student.Branch="BCA";
		student.percentage=78.9;
		student.Details();
		
	}

}
