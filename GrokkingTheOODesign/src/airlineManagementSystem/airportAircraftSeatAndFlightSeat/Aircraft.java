package airlineManagementSystem.airportAircraftSeatAndFlightSeat;

import java.util.ArrayList;
import java.util.List;

import airlineManagementSystem.flightCorrespondingClasses.FlightInstance;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Aircraft {
	private String name;
	private String model;
	private String manufacturingYear;

	private List<Seat> seats;

	private List<FlightInstance> getFlights() {
		System.out.println("Returning FlightInstances from the Aircraft Class...");
		return new ArrayList<FlightInstance>();
	}
}
