package features;

import entity.Flight;
import entity.Customer;

import java.util.ArrayList;

import entity.Booking;

public class Features {

	public static Object features;
	ArrayList<Flight> flights = new ArrayList<>();

	public void add(Booking booking) {
		booking.getAddFlight();

	}

	public void update(Booking booking) {
		booking.getUpdateFlight();
	}

	public void cancel(Booking booking) {
		booking.getCancleFlight();
	}

	public boolean display() {
		for(Flight flight :flights ) {
			System.out.println(flight);
			
		}
		return true;
	
  
	}

}