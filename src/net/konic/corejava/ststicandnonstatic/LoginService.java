package net.konic.corejava.ststicandnonstatic;

public class LoginService {
	public static String ValidateUser(String name) {
		return name;
	}
	public void LogOut() {
		System.out.println("User Logged out");
	}
	public static void main(String[] args) {
		System.out.println("User Name :"+LoginService.ValidateUser("siddiq78"));
		LoginService log=new LoginService();
		log.LogOut();
	
	}

}
