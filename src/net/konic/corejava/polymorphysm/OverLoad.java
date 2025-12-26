package net.konic.corejava.polymorphysm;

public class OverLoad {
	
	void print(int x) {
		System.out.println(x);
		
	}
	void print(String x) {
		System.out.println(x);
		
	}
	void print(int x,String y) {
		System.out.println(x+y);
		
	}
	
	
	public static void main(String[] args) {
		OverLoad over=new OverLoad();
		over.print(5);
		over.print("Siddiq");
		over.print(7, " Siddiq");
		
		
	}

}
