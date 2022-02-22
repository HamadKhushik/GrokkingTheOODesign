package movieTicketBookingSystem.accountsAndUsers;

import java.util.ArrayList;
import java.util.List;

import movieTicketBookingSystem.bookingShowSeatAndPayment.Booking;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Customer extends Person {

	private List<Booking> bookings = new ArrayList<Booking>();

	public boolean makeBooking(Booking booking) {
		System.out.println("Making Booking in the Customer Class...");
		bookings.add(booking);
		return true;
	}

	public List<Booking> getBookings() {
		return bookings;
	}
}
