package net.konic.corejava.polymorphysm;

public class RechargeMobile {
	long recharge(long num) {
		return num;
	}
	void recharge(long num,int plan) {
		System.out.println("Recharge "+plan+" Suucessesful");
		
	}
	void recharge(long num,int plan,String Coupon) {
		System.out.println("Recharge "+plan+" with coupon "+Coupon+" Applied");
	}
	public static void main(String[] args) {
		RechargeMobile recharge=new RechargeMobile();
		System.out.println("Recharge sucessesful for "+recharge.recharge(9866658653L));
		recharge.recharge(9866658653L, 299);
		recharge.recharge(9866658653L, 299, "NEW50");
	}

}
