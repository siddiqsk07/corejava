package net.konic.co1rejava.constructors;

public class CollegeStudent {
	static String CollegeName = "Narayana";
	String StudentName;
	int RollNo;

	CollegeStudent(String sname,int No) {
		StudentName=sname;
		RollNo=No;

	}
	public static void changecollege(String name) {
		CollegeName=name;
	}
	public static void main(String[] args) {
		CollegeStudent col=new CollegeStudent("Siddiq", 10);
		System.out.println("College Name :"+col.CollegeName);
		System.out.println("Student Name :"+col.StudentName);
		System.out.println("Rpll No :"+col.RollNo);
		
	}

}
