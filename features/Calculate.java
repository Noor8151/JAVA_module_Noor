package features;

import entity.Flight;
import entity.Customer;
import entity.Booking;

public class Calculate {
	double cost;
	
	
	public Calculate(double cost) {
		super();
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double TotalCost(Flight flight,Booking booking)
	{
		 cost=flight.getTicketPrice() *( (booking.getAddFlight()) *( booking.getNumTickets()));
		return cost;
	}
	public void receipts(Calculate cost,Flight flight) {
		
		System.out.println("total ticket price is "+cost.getCost());
		System.out.println("Your destination is   "+flight.getDestination() );
	}

}
