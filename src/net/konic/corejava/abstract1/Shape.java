package net.konic.corejava.abstract1;

abstract public class Shape {
	abstract void draw();
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		
		Square s=new Square();
		s.draw();
	}

}


class Circle {
	void draw() {
		System.out.println("Drawing Circle");
	}
	
}

class Square {
	void draw() {
		System.out.println("Drawing Square");
	}
}
