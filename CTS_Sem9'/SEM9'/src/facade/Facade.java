package facade;

public class Facade {
	
	public static void reservation(String initialLocation, String destination ) {
		
		Hotel hotel = new Hotel("HILTON");
		
		hotel.roomBooking("London");
		
		Airline airLine = new Airline("BlueAir");
		
		Flight toGo = airLine.flightBooking("Bucharest", "London");
		Flight back = airLine.flightBooking("London", "Bucharest");
		
		System.out.println("Reservation completed!");
		
	}

}
