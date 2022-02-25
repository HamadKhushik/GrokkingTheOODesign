package hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping;

import java.util.Date;

/**
 * @author Hammad: 25-Feb-2022
 */
public class RoomKey {
	private String keyId;
	private String barCode;
	private Date issuedAt;
	private boolean isActive;
	private boolean isMaster;

	public boolean assignRoom(Room room) {
		System.out.println("Assigning room in the RoomKey Class...");
		return true;
	}

	public boolean isActive() {
		System.out.println("Checking if the room-key is active in the RoomKey Class...");
		return true;
	}
}
