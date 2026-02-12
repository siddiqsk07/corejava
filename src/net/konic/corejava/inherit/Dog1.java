package net.konic.corejava.inherit;

public class Dog1 extends Animal {
	void bark() {
		System.out.println("Dog is Barking");
	}
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.eat();
		dog.bark();
	}
	
}


