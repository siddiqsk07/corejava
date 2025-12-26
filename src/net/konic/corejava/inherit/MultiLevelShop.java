package net.konic.corejava.inherit;


class Shop{
	void feature() {
		System.out.println("This is a shop");
	}
}
class Grocery extends Shop{
	void shop(){
		System.out.println("This is a Grocery Shop");
	}
}
class  OnlineGrocery extends Grocery{
	void online() {
		System.out.println("This is a Online Grocery Service");
		
	}
}
public class MultiLevelShop {
	public static void main(String[] args) {
		OnlineGrocery shop=new OnlineGrocery();
		shop.feature();
		shop.shop();
		shop.online();
	}

}