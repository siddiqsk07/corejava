package net.konic.corejava.polymorphysm;

public class BillGeneration {

	    void generateBill(int amount) {
	        System.out.println("Final Bill: ₹" + amount);
	    }

	   
	    void generateBill(int amount, int discount) {
	        double finalAmt = amount - (amount * discount / 100);
	        System.out.println("Final Bill after discount: ₹" + finalAmt);
	    }

	  
	    void generateBill(int amount, int discount, int tax) {
	        double discounted = amount - (amount * discount / 100);
	        double finalAmt = discounted + (discounted * tax / 100);
	        System.out.println("Final Bill: ₹" + finalAmt);
	    }
	

	
	    public static void main(String[] args) {

	      BillGeneration  s = new BillGeneration();

	        s.generateBill(1000);          
	        s.generateBill(1000, 10);     
	        s.generateBill(1000, 10, 5);   
	    }
	}


