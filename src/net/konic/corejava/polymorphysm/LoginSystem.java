package net.konic.corejava.polymorphysm;

public class LoginSystem {
	void username(String name,int pass) {
		System.out.println("Login Sucesses uning username :"+name+" & Password :"+pass);
		
	}
	void otp(long num,int otp) {
		System.out.println("Login Sucesses using Mobile Otp :"+otp);
	}
	public static void main(String[] args) {
		LoginSystem login=new LoginSystem();
		login.username("siddiq07", 78612);
		login.otp(9866658653L, 8865);
		
	}

}
