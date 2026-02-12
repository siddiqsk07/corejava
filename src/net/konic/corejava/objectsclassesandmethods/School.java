package net.konic.corejava.objectsclassesandmethods;

public class School {
	
	String schoolName;
	int noofclasses;
	int noofstaff;
	String boardofschool;
	int noofstudents;
	
	
	public void Study() {
		System.out.println("Name of the school :"+schoolName);
		System.out.println("No of classes :"+noofclasses);
		System.out.println("No of staff :"+noofstaff);
		System.out.println("Board of school :"+boardofschool);
		System.out.println("No of students :"+noofstudents);
	}
	
	public static void main(String[] args) {
		
		School school=new School();
		school.schoolName="vidyodaya";
		
		school.boardofschool="CBSC";
		school.noofclasses=15;
		school.noofstaff=35;
		school.noofstudents=450;
		school.Study();
	}
	
	
}
