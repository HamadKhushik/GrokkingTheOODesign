package hotelManagementSystem.hotelAndHotelLocation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 25-Feb-2022
 */
public class Hotel {
	private String name;
	private List<HotelLocation> locations = new ArrayList<HotelLocation>();

	public boolean addLocation(HotelLocation hotelLocation) {
		locations.add(hotelLocation);
		return true;
	}
}
