package movieTicketBookingSystem.bookingShowSeatAndPayment;

import java.util.Date;
import java.util.List;

import movieTicketBookingSystem.enumsContantsDataTypes.BookingStatus;
import movieTicketBookingSystem.showAndMovie.Show;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Booking {
	private String bookingNumber;
	private int numberOfSeats;
	private Date createdOn;
	private BookingStatus status;

	private Show show;
	private List<ShowSeat> seats;
	private Payment payment;

	public boolean makePayment(Payment payment) {
		System.out.println("Making Payment in the Booking Class...");
		return true;
	}

	public boolean cancel() {
		System.out.println("Cancelling the Booking in the Booking Class...");
		return true;
	}

	public boolean assignSeats(List<ShowSeat> seats) {
		System.out.println("Assigning seats in the Booking Class...");
		return true;
	}
}
