package net.konic.corejava.switchstatements;



public class SkipNegitiveNumbers {
	public static void main(String[] args) {
		
		int[] nums= {10,-5,8,-2,7};
		
		for(int num :nums) {
			if(num <0) {
				continue;
			}
			System.out.println(num);
		
 

		}
	}

}
