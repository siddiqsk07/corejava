package net.konic.corejava.methods;

public class GreetingMessage {
	public String greet(String Greet,String Wish) {
		String  Name=Greet+Wish;
		System.out.println("Greeting Message :"+Name);
		return Name;
		
	}
	public static void main(String[] args) {
		GreetingMessage wish=new GreetingMessage();
		wish.greet("Assalamualaikum"," Team");
		
			
		
	}

}
