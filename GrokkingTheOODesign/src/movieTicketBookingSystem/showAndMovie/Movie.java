package movieTicketBookingSystem.showAndMovie;

import java.util.Date;
import java.util.List;

import movieTicketBookingSystem.accountsAndUsers.Admin;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Movie {
	private String title;
	private String description;
	private int durationInMinutes;
	private String language;
	private Date releseDate;
	private String country;
	private String genre;
	private Admin movieAddedBy;

	private List<Show> shows;

	public List<Show> getShows() {
		return shows;
	}
}
