package hotelManagementSystem.accountAndCorrespondingClasses;

import hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping.Room;
import hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping.RoomHouseKeeping;

/**
 * @author Hammad: 25-Feb-2022
 */
public class HouseKeeper {

	public boolean assignToRoom() {
		System.out.println("Assigning HouseKeeper to room in HouseKeeper Class...");
		return true;
	}

	public boolean performDuties(RoomHouseKeeping houseKeeping, Room room) {
		System.out.println("performing house keeping duties for the assigned room in class HouseKeeper");
		return true;
	}
}
