package movieTicketBookingSystem.searchInterfaceAndCatalog;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import movieTicketBookingSystem.showAndMovie.Movie;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Catalog implements Search {

	HashMap<String, List<Movie>> movieTitles;
	HashMap<String, List<Movie>> movieLanguages;
	HashMap<String, List<Movie>> movieGenres;
	HashMap<Date, List<Movie>> movieReleaseDate;
	HashMap<String, List<Movie>> movieCities;

	@Override
	public List<Movie> searchByTitle(String title) {
		return movieTitles.get(title);
	}

	@Override
	public List<Movie> searchByLanguage(String language) {
		return movieLanguages.get(language);
	}

	@Override
	public List<Movie> searchByGenre(String genre) {
		return movieGenres.get(genre);
	}

	@Override
	public List<Movie> searchByReleaseDate(Date relDate) {
		return movieReleaseDate.get(relDate);
	}

	@Override
	public List<Movie> searchByCity(String city) {
		return movieCities.get(city);
	}

}
