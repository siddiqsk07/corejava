package net.konic.corejava.polymorphysm;

public class AreaCalculate {
	int area(int side) {
		return side*side;
	}
	int area(int lenghth,int width) {
		return lenghth*width;
	}
	double area(double pi,double radius) {
		return pi*radius*radius;
	}
	public static void main(String[] args) {
		AreaCalculate area=new AreaCalculate();
		System.out.println("Area of square :"+area.area(5));
		System.out.println("Area of rectangle :"+area.area(5, 10));
		System.out.println("Area of Circle :"+area.area(3.14, 7));
		
		
	}

}
