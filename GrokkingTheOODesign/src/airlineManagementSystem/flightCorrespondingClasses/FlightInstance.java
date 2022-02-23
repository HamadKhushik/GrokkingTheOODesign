package airlineManagementSystem.flightCorrespondingClasses;

import java.util.Date;

import airlineManagementSystem.airportAircraftSeatAndFlightSeat.Aircraft;
import airlineManagementSystem.enumsConstantsAndDataTypes.FlightStatus;

/**
 * @author Hammad: 22-Feb-2022
 */
public class FlightInstance {
	private Date departureTime;
	private String gate;
	private FlightStatus status;
	private Aircraft aircraft;

	public boolean cancel() {
		System.out.println("Cancelling Flight Instance in the FlightInstance Class...");
		return true;
	}

	public boolean updateFlightStatus() {
		System.out.println("Updating Flight Status in the Flight Instance Class...");
		return true;
	}
}
