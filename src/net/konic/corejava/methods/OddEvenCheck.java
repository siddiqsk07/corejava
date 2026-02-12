package net.konic.corejava.methods;

public class OddEvenCheck {
	boolean Number(int num) {
		if(num%2==0) {
			System.out.println("Even number");
			return true;
		}else {
			System.out.println("Odd number");
			return false;
		}
	}
	public static void main(String[] args) {
		OddEvenCheck eveodd=new OddEvenCheck();
		eveodd.Number(1);
	}

}
