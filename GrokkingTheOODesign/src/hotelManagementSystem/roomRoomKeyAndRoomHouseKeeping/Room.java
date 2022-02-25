package hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping;

import java.util.Date;
import java.util.List;

import hotelManagementSystem.Search;
import hotelManagementSystem.enumsAndConstants.RoomStatus;
import hotelManagementSystem.enumsAndConstants.RoomStyle;

/**
 * @author Hammad: 25-Feb-2022
 */
public class Room implements Search {
	private String roomNumber;
	private RoomStyle style;
	private RoomStatus status;
	private double bookingPrice;
	private boolean isSmoking;

	private List<RoomKey> keys;
	private List<RoomHouseKeeping> houseKeepingLog;

	public boolean isRoomAvailable() {
		System.out.println("Checking if room is available in the Room Class...");
		return true;
	}

	public boolean checkIn() {
		System.out.println("Checking in room in the Room Class...");
		return true;
	}

	public boolean checkout() {
		System.out.println("Checking out room in the Room Class...");
		return true;
	}

	@Override
	public List<Room> search(RoomStyle style, Date startDate, int duration) {
		System.out.println("Searching the rooms on the given criteria in the Room Class...");
		return null;
	}
}
