package net.konic.corejava.variable;

public class StudentMArks {
	int marks;

	public void marks(int m1) {
		marks = m1;

	}

	public String Resultcheck() {
		
		if(marks >= 40) {
			return "Pass";
			
		}else {
			return "Fail";
		}
		
	}

	public static void main(String[] args) {
		StudentMArks studentMArks = new StudentMArks();
		studentMArks.marks = 35;
		studentMArks.Resultcheck();
		String result = studentMArks.Resultcheck();
		System.out.println("Result :" + result);

	}

}
