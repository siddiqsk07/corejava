package net.konic.corejava.variable;

public class Evenoddcheck {
	int number;
	
	public void readnumbers() {
		int number=1;
		
		
	}
	public boolean isEven() {
		if(number % 2==0) {
			System.out.println("Number is even");
			return true;
		}else {
			System.out.println("Number is odd");
			return false;
		}
	}
	public static void main(String[] args) {
		Evenoddcheck eveodd=new Evenoddcheck();
		eveodd.isEven();
		eveodd.readnumbers();
	}

}
