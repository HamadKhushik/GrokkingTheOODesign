package movieTicketBookingSystem.searchInterfaceAndCatalog;

import java.util.Date;
import java.util.List;

import movieTicketBookingSystem.showAndMovie.Movie;

/**
 * @author Hammad: 21-Feb-2022
 */
public interface Search {

	public List<Movie> searchByTitle(String title);

	public List<Movie> searchByLanguage(String language);

	public List<Movie> searchByGenre(String genre);

	public List<Movie> searchByReleaseDate(Date relDate);

	public List<Movie> searchByCity(String city);
}
