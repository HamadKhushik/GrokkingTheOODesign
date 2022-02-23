package airlineManagementSystem.accountPersonCustomerAndPassenger;

import java.util.ArrayList;
import java.util.List;

import airlineManagementSystem.flightCorrespondingClasses.Itinerary;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Customer extends Person {
	private String frequentFlyerNumber;

//	private List<Itinerary> itineraries = new ArrayList<Itineraries>();   // this should be in the code

	public List<Itinerary> getItineraries() {
		System.out.println("Returning Itinerary list in the Customer Class...");
		return new ArrayList<Itinerary>();
	}
}
