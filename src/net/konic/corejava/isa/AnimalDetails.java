package net.konic.corejava.isa;
class Animal{
	void breathing() {
		
	}
}
class Dog extends Animal{
	void breathing() {
		System.out.println("Dog is Breathing");
	}
	void sound() {
		System.out.println("Dogs barks");
	}
}

public class AnimalDetails {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.breathing();
		dog.sound();
		
	}

}
