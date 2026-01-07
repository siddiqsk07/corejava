package net.konic.corejava.objectsclassesandmethods;

public class Calculator {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("add :" + c);

	}

	int mul(int d, int f) {

		int g = d * f;
		System.out.println("The sum of D*F :" + g);
		return g;
	}

	int sub(int d, int e) {
		int k = d - e;
		System.out.println("The sum of d-e :" + k);
		return k;

	}

	double div(int m, int n) {
		double o = m / n;
		System.out.println("The Division of m/n :" + o);
		return o;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.mul(5, 10);
		cal.add(5, 41);
		cal.div(8, 5);
		cal.sub(50, 75);

	}

}
