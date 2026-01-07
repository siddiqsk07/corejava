package net.konic.corejava.methods;

public class Agecheck {
	boolean age(int age) {
		System.out.println("Age :"+age);
		if(age >=18) {
			System.out.println("Eligible to vote");
			return true;
		}else {
			System.out.println("not eligible ");
			return false;
		}
	}
	public static void main(String[] args) {
		Agecheck age=new Agecheck();
		age.age(18);
	}
}
