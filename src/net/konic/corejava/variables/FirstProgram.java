package net.konic.corejava.variables;

public class FirstProgram {
public static void main(String args[]) {
		
		int h = 78;
		int j = 89;
		
		System.out.println(h > j);
		
		int n = 26;
		n= 56;
		int r = 89;
		r=56;
		System.out.println(n == r);
		System.out.println(n != r);
		n = 89;
		System.out.println(n <= r);
	    System.out.println(n >= r);
	    
	    System.out.println("Bismillah");
	    
	    String str = (String)"siddiq ";
	    String str2 =(String)"Asma";
	    
	    System.out.println(str+str2);
	    
	    String str1 =(String)"Asma";
	    int d = 3;
	    
	    System.out.println(str1 + d);
	    
	    
	  String A1 ="SIDDIQ " ;
	  String A2 = "SHAIK";
	  
	  System.out.println(A1+A2);
	  
	  int marks1=50;
	  int passmarks1=35;
	  boolean ispassed = (marks1 >= passmarks1);
	  
	 System.out.println(ispassed);
	 
	  int marks2=26;
	  int passmarks2=35;
	  boolean qualified = (marks2 >= passmarks2);
	  
	  System.out.println(qualified);
	  
	  
	  int S1=65;
	  int S2=50;
	  int S3=55;
	  int S4=54;
	  int S5=45;
	  
	 
	  
	  float avg=(float)(S1+S2+S3+S4+S5)/5;
	  
	  System.out.println(avg);
	  
	  
	  //&& operator , || are operator
	  
	  int m1 = 54;
	  int m2 = 44;
	  
	  int pm=35;
	  boolean result =(m1 >= pm && m2 <=pm);
	  
	  
	  System.out.println(result);
	  
	  /*
	   * && this operator gives true when both statements are trur otherwise it gives false
	   * || or operator this gives true if a single statement is true,it gives false when both the statements are false
	   * 
	   * 
	   * T && T = True
	   * T && F = False
	   * F && T = False
	   * F && F = False
	   * 
	   * T || T = TRUE
	   * T || F = TRUE
	   * F || T = TRUE
	   * F || F = FALSE
	   * 
	   */
	  
	  
	  //CONDITIONAL STATEMENTS 
	  /*
	   * SIMPLE If
	   * if else statement
	   * IT ACCEPTS BOOLEAN
	   * SYNTEX
	   *
	   *int m1=65;
	   *int pm = 35;
	   *
	   *if(m1 >pm){
	   *System.out.println("passed....");
	   *}
	   *}
	   *}
	   *
	   */
	  
	  int m8 = 54;
	  int m = 34;
	  
	  if (m1 > pm); {
		  System.out.println("paseed....");
	  }
	  
	  
	  
	  
}
}
