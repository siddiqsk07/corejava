package net.konic.corejava.polymorphysm;

public class MarksCalculate {
	int calculateMarks(int maths) {
		return maths;
		
	}
	int calculateMarks(int math,int physics) {
		return math+physics;
		
	}
	void calculateMarks(int java,int python,int spring) {
		System.out.println("Total Marks :"+(python + java + spring));
		
	}
	public static void main(String[] args) {
		MarksCalculate marks=new MarksCalculate();
		System.out.println("Total MArks :"+marks.calculateMarks(80));
		int totalmarks=marks.calculateMarks(80, 90);
		System.out.println("Total Marks :"+totalmarks);
		marks.calculateMarks(90, 80, 85);
		
	}

}
