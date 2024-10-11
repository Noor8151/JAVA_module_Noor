package entity;

import entity.Flight;
import entity.Customer;

public class Booking {
	int numTickets;
	int addFlight;
	String updateFlight;
	String cancleFlight;

	public Booking(int numTickets, int addFlight, String updateFlight, String cancleFlight) {
		super();
		this.numTickets = numTickets;
		this.addFlight = addFlight;
		this.updateFlight = updateFlight;
		this.cancleFlight = cancleFlight;
		int flightId;
		int customerId;
	}

	public int getNumTickets() {
		return numTickets;
	}

	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}

	public int getAddFlight() {
		return addFlight;
	}

	public void setAddFlight(int addFlight) {
		this.addFlight = addFlight;
	}

	public String getUpdateFlight() {
		return updateFlight;
	}

	public void setUpdateFlight(String updateFlight) {
		this.updateFlight = updateFlight;
	}

	public String getCancleFlight() {
		return cancleFlight;
	}

	public void setCancleFlight(String cancleFlight) {
		this.cancleFlight = cancleFlight;
	}

	@Override
	public String toString() {
		return "Booking [numTickets=" + numTickets + ", addFlight=" + addFlight + ", updateFlight=" + updateFlight
				+ ", cancleFlight=" + cancleFlight + ", getNumTickets()=" + getNumTickets() + ", getAddFlight()="
				+ getAddFlight() + ", getUpdateFlight()=" + getUpdateFlight() + ", getCancleFlight()="
				+ getCancleFlight() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
