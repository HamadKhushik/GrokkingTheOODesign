package movieTicketBookingSystem.cityCinemaAndCinemaHall;

import java.util.List;

import movieTicketBookingSystem.bookingShowSeatAndPayment.CinemaHallSeat;
import movieTicketBookingSystem.showAndMovie.Show;

/**
 * @author Hammad: 21-Feb-2022
 */
public class CinemaHall {
	private String name;
	private int totalSeats;

	private List<CinemaHallSeat> seats;
	private List<Show> shows;
}
