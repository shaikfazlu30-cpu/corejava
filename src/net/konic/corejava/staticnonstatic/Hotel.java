package net.konic.corejava.staticnonstatic;

public class Hotel {

	static String hotelname = "rrr";

	int roomnumber;

	public static void main(String[] args) {

		System.out.println("Hotel Name (without object): " + Hotel.hotelname);

		Hotel hotel = new Hotel();

		hotel.roomnumber = 200;

		System.out.println("Hotel name:" + Hotel.hotelname);
		System.out.println("roomnumber:" + hotel.roomnumber);

	}

}
