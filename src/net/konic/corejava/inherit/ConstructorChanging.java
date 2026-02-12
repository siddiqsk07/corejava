package net.konic.corejava.inherit;



class Parent {
	Parent() {
		System.out.println("Parent Constructor");

	}
}
class Child1 extends Parent{
	Child1(){
		System.out.println("Child Constructor");
	}
}
public class ConstructorChanging {
	public static void main(String[] args) {
		new Child();
		
	}

}
