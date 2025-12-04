package net.konic.corejava.ststicandnonstatic;

public class Hotel {
	static String HotelName="Season inn";
	int RoomNo;
	
	Hotel(int No){
		RoomNo=No;
	}
	public static void main(String[] args) {
		System.out.println("Hotel Name :"+HotelName);
		
		Hotel hotel=new Hotel(7);
				System.out.println("Room No :"+hotel.RoomNo);
	}

}
