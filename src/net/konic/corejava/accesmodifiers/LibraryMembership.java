package net.konic.corejava.accesmodifiers;

public class LibraryMembership {
	static String LibraryName = "Abdul Kalam's library";
	String MemberName;

	public LibraryMembership() {
		MemberName = "Guest Member";

	}
	public LibraryMembership(String n) {
		 MemberName= n;
	}
	public void Selectbook(int option) {
		switch(option) {
		case 1:
			System.out.println("Book :Maths");
			break;
		case 2:
			System.out.println("Book : Science");
			break;
		case 3:
			System.out.println("Book : Chemistry");
			break;
		case 4:
			System.out.println("Book : Science Innovation");
			break;
		case 5:
			System.out.println("Book : The Life Of Abdul Kalam");
			break;
		case 6:
			System.out.println("Invalid book");
			break;
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Library Name :"+LibraryName);
		LibraryMembership library=new LibraryMembership("Ahamed");
		System.out.println("MemberName :"+library.MemberName);
		library.Selectbook(2);
		
		
		
		
		
	}

}
