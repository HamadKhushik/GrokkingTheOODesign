package airlineManagementSystem.airportAircraftSeatAndFlightSeat;

import java.util.ArrayList;
import java.util.List;

import airlineManagementSystem.enumsConstantsAndDataTypes.Address;
import airlineManagementSystem.flightCorrespondingClasses.Flight;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Airport {
	private String name;
	private Address address;
	private String code;

	private List<Flight> flights = new ArrayList<Flight>();

	public List<Flight> getFlights() {
		return flights;
	}
}
