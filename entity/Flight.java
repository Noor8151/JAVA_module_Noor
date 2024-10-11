package entity;

public class Flight {

	private int flightId;
	private String destination;
	private double departureTime;
	private int availableSeats;
	private double ticketPrice;

	// parameterized Constructor
	public Flight(int flightId, String destination, double departureTime, int availableSeats, double ticketPrice) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.departureTime = departureTime;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", destination=" + destination + ", departureTime=" + departureTime
				+ ", availableSeats=" + availableSeats + ", ticketPrice=" + ticketPrice + "]";
	}

}
