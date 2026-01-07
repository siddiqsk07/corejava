package constructor;

public class Car {

	public static String name = "tata";
	 int price ;
	 String carname;
	 
	 Car(int a,String b){
		 price = a;
		 carname = b;
		 
	 }
	
	 public static void main(String[] args) {
		
		 System.out.println("company name ="  + name);
		 Car car = new Car(45000,"punch");
		 System.out.println("price "+ car.price);
		 System.out.println("carname"+ car.carname);
	}
	  
	 
	 
	 
	 
	
}
