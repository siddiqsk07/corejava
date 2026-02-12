package net.konic.co1rejava.constructors;

public class School {
	int a;
	int b;
	
	public static int add(int a,int b) {
		return a+b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		System.out.println("Add :"+School.add(5,4));
		School schl=new School();
		int Multiply=schl.mul(5, 10);
		System.out.println("Multiply :"+Multiply);
		}

}
