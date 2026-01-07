package net.konic.corejava.ststicandnonstatic;

public class School {
	
	public String Student(String name) {
		return name;
	}
	public static String SchoolName(String schlname) {
		return schlname;
	}
	public static void main(String[] args) {
		System.out.println("School Name :"+School.SchoolName("Narayana"));
		School schl=new School();
		String Name=schl.Student("Siddiq");
		System.out.println("Student Name :"+Name);
	}

}
