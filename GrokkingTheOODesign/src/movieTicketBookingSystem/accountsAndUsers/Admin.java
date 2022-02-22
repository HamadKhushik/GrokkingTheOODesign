package movieTicketBookingSystem.accountsAndUsers;

import movieTicketBookingSystem.showAndMovie.Movie;
import movieTicketBookingSystem.showAndMovie.Show;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Admin extends Person {

	public boolean addMovie(Movie movie) {
		System.out.println("Adding a movie in the Admin Class...");
		return true;
	}

	public boolean addShow(Show show) {
		System.out.println("Adding a Show in the Admin Class...");
		return true;
	}

	public boolean blockUser(Customer customer) {
		System.out.println("Blocking user in the Admin Class...");
		return true;
	}
}
