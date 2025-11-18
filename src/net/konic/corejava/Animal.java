package net.konic.corejava;

public class Animal {
	public static void main(String[] args) {
		System.out.println("bismillah");

		int m1 = 55;
		int m2 = 45;
		int pm=35;
		int totalMarks=m1+m2;
		
		float percentage = (float) totalMarks/2;
		
		if(m1 > pm && m2 > pm) {
			System.out.println("passed in all the subjects");
			if (m1 >= percentage) {
				System.out.println("pass in m1 "+ percentage);
			}else if(m2 <= percentage) {
				System.out.println("Fail in m2 "+ percentage);
			}
			
		}else {
			System.out.println("Failed in all subjects");
		}
		
		for(int i =0;i <55;i++) {
			System.out.println(i);
			
		}
		
		
		
		

	}

}
