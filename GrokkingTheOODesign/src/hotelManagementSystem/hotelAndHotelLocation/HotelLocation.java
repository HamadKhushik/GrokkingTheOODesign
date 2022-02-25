package hotelManagementSystem.hotelAndHotelLocation;

import java.util.ArrayList;
import java.util.List;

import hotelManagementSystem.enumsAndConstants.Address;
import hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping.Room;

/**
 * @author Hammad: 25-Feb-2022
 */
public class HotelLocation {
	private String name;
	private Address location;

	private List<Room> rooms = new ArrayList<Room>();

	public List<Room> getRooms() {
		return rooms;
	}
}
