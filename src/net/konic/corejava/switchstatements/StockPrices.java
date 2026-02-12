package net.konic.corejava.switchstatements;


public class StockPrices {
	public static void main(String[] args) {
		int[] prices= {120,135,98,-1};
		
		for(int price :prices) {
			
			if(price == -1) {
				
				break;
			}
			System.out.println("price :"+ price);
			
		}
		
	}

}
