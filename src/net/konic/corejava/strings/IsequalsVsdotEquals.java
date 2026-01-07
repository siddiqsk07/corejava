package net.konic.corejava.strings;

public class IsequalsVsdotEquals {
	public static void main(String[] args) {
		String username1="admin";
		String username2=new String("admin");
		
		System.out.println("username1 == username2 :"+(username1 == username2));
		System.out.println("username1.equals(username2) :"+(username1.equals(username2)));
		
	}

}
