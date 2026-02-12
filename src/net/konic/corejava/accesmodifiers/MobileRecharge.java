package net.konic.corejava.accesmodifiers;

public class MobileRecharge {
	static String operator="Jio";
	
	long number;
	
	public static void showOperator() {
		System.out.println("Operator :"+operator);
	}

	public MobileRecharge(long phno) {
		number = phno;
	}

	public void choosePlan(int plans) {
		switch (plans) {
		case 1:
			System.out.println("₹249-1gb/day,100 sms,unlimited calls");
			break;
		case 2:
			System.out.println("₹299-1.5gb/day,100 sms,unlimited calls,hotstar mobile-28 days");
			break;
		case 3:
			System.out.println("699-2gb/day,unlimited sms,unlimited calls,netfix,hotstar,aha");
			break;
		case 4:
			System.out.println("2599-365 days unlimited calls,sms,2gb/day data,netfix 1 year");
			break;
		case 5:
			System.out.println("Invalid optionss");
			break;

		}
	}
	public static void main(String[] args) {
		System.out.println("Operator :"+operator);
		MobileRecharge mobile=new MobileRecharge(986665865);
		System.out.println("Mobile Number :"+mobile.number);
		mobile.choosePlan(2);
		
	}

}
