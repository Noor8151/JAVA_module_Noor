package airlineManagement;

import entity.Flight;
import entity.Customer;
import entity.Booking;
import features.Features;
import features.BookTickets;
import features.Calculate;

import java.util.Scanner;

public class AirLineManagement {

	private static int ch;

	public static void main(String[] args) {
		Flight flight = new Flight(101, "Banglore", 12.45, 10, 10000);
		Customer customer = new Customer(1, "Abhishek", 815067570);
		Booking booking = new Booking(5, 5, "yes", "no");
		Features features = new Features();
		BookTickets booktickets = new BookTickets();
		Calculate calculate = new Calculate(10000);

		// Scanner sc = new Scanner(System.in);
		// sc.nextLine(); //leave one line

		do {
			System.out.println("Welcome to AirLine Management");
			System.out.println("1.Display details");
			System.out.println("2.Available seats");
			System.out.println("3.Ticket price");
			System.out.println("4.Book ticket");
			System.out.println("5.Cancel ticket");
			System.out.println("4.Total ticket price");
			System.out.println("5.Print reciept");
			System.out.println("6.exit");

			int choice;
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("flightID is 101");
				System.out.println("Flight destination is Banglore");
				System.out.println("Departure time of flight is 12:45pm");
				sc.nextLine();
				System.out.println("");
				break;

			case 2:
				System.out.println("flights availble are " + flight.getAvailableSeats());
				sc.nextLine();
				System.out.println("");
				break;
			case 3:
				System.out.println("Ticket  price is " + flight.getTicketPrice());
				sc.nextLine();
				System.out.println("");
				break;
			case 4:
				System.out.println(booking.getAddFlight());
				sc.nextLine();
				System.out.println("");
				break;
			case 5:
				System.out.println(booking.getCancleFlight());
				sc.nextLine();
				System.out.println("");
				break;
			case 6:
				System.out.println("total cost of ticket is " + calculate.TotalCost(flight, booking));
				sc.nextLine();
				System.out.println("");
				break;
			case 7:
				System.out.println("Thank you Using our Airlines");
				sc.nextLine();
				System.out.println("");
				break;
			case 8:
				System.out.println("Tickets booked = 1");
				System.out.println("Departure time = 12:45 pm");
				System.out.println("ticket price   = 10000");

			default:
				System.out.println("Invalid input");
				sc.nextLine();
				System.out.println("");
				break;
			}
		} while (ch == 0);
		System.out.println("Do you want to continue(Y/N");

	}
}
