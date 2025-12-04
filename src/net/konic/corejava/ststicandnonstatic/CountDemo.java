package net.konic.corejava.ststicandnonstatic;

public class CountDemo {
	static int count=0;
	
	public CountDemo() {
		count++;
	}
	public static void main(String[] args) {
		CountDemo object1=new CountDemo();
		CountDemo object2=new CountDemo();
		CountDemo object3=new CountDemo();
		
		System.out.println("Final count :"+object1.count);
		
		
		
	}

}
