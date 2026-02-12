package net.konic.corejava.inherit;


class A {
	void a() {
		System.out.println("A Method");
	}
}

class B extends A {
	void b() {
		System.out.println("B Method");
	}

}

class C extends B {
	void c() {
		System.out.println("C method");
	}

}
public class ABCmethod {
	public static void main(String[] args) {
		C obj = new C();
		obj.a();
		obj.b();
		obj.c();
	}
}