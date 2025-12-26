package net.konic.corejava.variable;

public class InstanceandLocal {
	int age;
	
	void age() {
		int age2=20;
		System.out.println("Age2 :"+age2);
		age=age2;
		
	}
	public static void main(String[] args) {
		
		InstanceandLocal instanceandLocal=new InstanceandLocal();
		
		instanceandLocal.age=30;
		instanceandLocal.age();
		
	}

}
