package airlineManagementSystem.flightCorrespondingClasses;

import java.util.Date;
import java.util.List;

import airlineManagementSystem.airportAircraftSeatAndFlightSeat.Airport;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Itinerary {
	private String customerId;
	private Airport startingAirport;
	private Airport finalAirport;
	private Date creationDate;
	private List<FlightReservation> reservation;

	public List<FlightReservation> getReservation() {
		return reservation;
	}

	public boolean makeReservation() {
		System.out.println("Making Reservation in the Itinerary Class...");
		return true;
	}

	public boolean makePayment() {
		System.out.println("Making Payment in the Itinerary Class...");
		return true;
	}
}
