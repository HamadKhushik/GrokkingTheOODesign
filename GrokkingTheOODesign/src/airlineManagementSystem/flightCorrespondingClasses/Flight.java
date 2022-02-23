package airlineManagementSystem.flightCorrespondingClasses;

import java.util.List;

import airlineManagementSystem.airportAircraftSeatAndFlightSeat.Airport;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Flight {
	private String flightNumber;
	private Airport departure;
	private Airport arrival;
	private int durationInMinutes;

	private List<WeeklySchedule> weeklySchedules;
	private List<WeeklySchedule> customSchedules;
	private List<WeeklySchedule> flightInstances;
}
