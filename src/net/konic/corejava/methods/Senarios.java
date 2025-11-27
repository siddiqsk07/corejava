package net.konic.corejava.methods;

public class Senarios {
	public void add() {
		int a=7;
		int b=4;
		int c=a+b;
		System.out.println("Add :"+c);
	}
	public void sub(int g,int h) {
		int i=g-h;
		System.out.println("subract :"+i);
	}
	public int mul() {
		int x=2;
		int y=5;
		int z=x*y;
		System.out.println(z);
		return z;
	}
	
	public float div(int s,int t) {
		int u=s/t;
		System.out.println(u);
		return u;
	}
	
	public boolean age(int age) {
		System.out.println("Age :"+age);
		if(age >=18) {
			System.out.println("Eligible");
			return true;
		}else {
			System.out.println("not eligible ");
			return false;
			
		}
		
	}
	public static void main(String[] args) {
		Senarios senarios=new Senarios();
		senarios.add();
		senarios.sub(4, 2);
		senarios.mul();
		senarios.div(10, 2);
		senarios.age(15);
	}
	
	
	
	
		
	

}
