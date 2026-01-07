package net.konic.corejava.encapsulation;

class Email {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("@")) {
			this.email = email;
			System.out.println("Email :" + email);
		} else {
			System.out.println("Invalid Email");
		}
	}

}

public class EmailValidation {
	public static void main(String[] args) {
		Email mail = new Email();
		mail.setEmail("siddiq78@gmail.com");
		mail.getEmail();

	}

}
