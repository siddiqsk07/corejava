package net.konic.co1rejava.constructors;

public class BusTicketBooking {
	static String company = "IRCTC";
	static int TicketFare = 500;

	String Passenger;

	public BusTicketBooking(String pname) {
	 Passenger = pname;
	}

	public static void main(String[] args) {
		BusTicketBooking tckt = new BusTicketBooking("muhammed");
		System.out.println("BUS TICKET BOOKING");
		System.out.println("Passenger Name :" + tckt.Passenger);
		System.out.println("Ticket Fare :" + tckt.TicketFare);
		System.out.println("Comapany Name :" + tckt.company);
	}
}
