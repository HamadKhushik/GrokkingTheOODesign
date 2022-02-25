package hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping;

import java.util.Date;

import hotelManagementSystem.accountAndCorrespondingClasses.HouseKeeper;

/**
 * @author Hammad: 25-Feb-2022
 */
public class RoomHouseKeeping {
	private String description;
	private Date startDate;
	private int duration;
	private HouseKeeper houseKeeper;

	public boolean addHouseKeeping(Room room) {
		System.out.println("Adding House Keeping in the RoomHouseKeeping Class...");
		return true;
	}
}
