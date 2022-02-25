package hotelManagementSystem.accountAndCorrespondingClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 25-Feb-2022
 */
public class Receptionist {

	public List<Guest> searchGuest(String name) {
		System.out.println("Returning List of guests from Receptionist Class...");
		return new ArrayList<Guest>();
	}

	public boolean createBooking() {
		System.out.println("Creating Booking in the Receptionist Class...");
		return true;
	}
}
