package airlineManagementSystem.flightCorrespondingClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import airlineManagementSystem.accountPersonCustomerAndPassenger.Passenger;
import airlineManagementSystem.airportAircraftSeatAndFlightSeat.FlightSeat;
import airlineManagementSystem.enumsConstantsAndDataTypes.ReservationStatus;

/**
 * @author Hammad: 22-Feb-2022
 */
public class FlightReservation {
	private String reservationNumber;
	private FlightInstance flight;
	private Map<Passenger, FlightSeat> seatMap;
	private Date creationDate;
	private ReservationStatus status;

	public static FlightReservation fetchReservationDetails(String reservationNumber) {
		System.out.println("Returning Flight Reservation Details in the Flight Reservation Class...");
		return new FlightReservation();
	}

	public List<Passenger> getPassengers() {
		System.out.println("Returning List<Passenger> in the FlightReservation class...");
		return new ArrayList<Passenger>();
	}
}
