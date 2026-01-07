package net.konic.corejava.encapsulation;

class Students {
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {

		if (marks <= 100) {
			this.marks = marks;

		} else {
			System.out.println("Invalid marks");
		}
	}

}

public class StudentsMarksValidation {
	public static void main(String[] args) {
		Students marks = new Students();
		marks.setMarks(120);
		int result = marks.getMarks();
		System.out.println("Marks :" + result);
	}

}
