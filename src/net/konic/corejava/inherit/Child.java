package net.konic.corejava.inherit;

public class Child extends Person {
	void rollNo(int roll) {
		roll = 101;
		System.out.println("Roll no :" + roll);

	}

	@Override
	void name(String name) {

		System.out.println("Name :" + name);

	}

	void age(int age) {

		System.out.println("Age :"+age);

	}

	public static void main(String[] args) {
		Child child = new Child();
		child.name("Siddiq");
		child.age(22);

		child.rollNo(101);

	}

}
