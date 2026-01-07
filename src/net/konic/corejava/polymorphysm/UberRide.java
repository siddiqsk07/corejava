package net.konic.corejava.polymorphysm;

public class UberRide {
	String bookRide(String strt, String destination) {
		return strt + destination;

	}

	String bookRide(String cartype, String strt, String destiny) {
		return cartype + strt + destiny;

	}

	String bookRide(int x, String strt, String destiny) {
		return x + strt + destiny;
	}

	public static void main(String[] args) {
		UberRide ride = new UberRide();
		System.out.println("Ride Booked From " + ride.bookRide("Ameerpet to ", "Hitech City"));
		System.out.println(ride.bookRide("Suv ", "Ride booked From Ameerpet to ", "Hitech City"));
		System.out.println("Ride booked for " + ride.bookRide(3, " passenger from Ameerpet to ", "Hitech City"));

	}

}
