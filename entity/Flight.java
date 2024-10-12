package entity;

class Flight {
    private String flightNumber;
    private String destination;
    private int availableSeats;

    public Flight(String flightNumber, String destination, int availableSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.availableSeats = availableSeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() throws Exception {
        if (availableSeats <= 0) {
            throw new Exception("No seats available for flight " + flightNumber);
        }
        availableSeats--;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", availableSeats=" + availableSeats +
                '}';
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
