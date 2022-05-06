package facade;

public class Flight {
	
	private String initialLocation;
	
	private String destination;
	
	private Airline airLine;

	public Flight(String initialLocation, String destination, Airline airLine) {
		super();
		this.initialLocation = initialLocation;
		this.destination = destination;
		this.airLine = airLine;
	}

	public String getInitialLocation() {
		return initialLocation;
	}

	public void setInitialLocation(String initialLocation) {
		this.initialLocation = initialLocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Airline getAirLine() {
		return airLine;
	}

	public void setAirLine(Airline airLine) {
		this.airLine = airLine;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	

}
