package hotelManagementSystem;

import java.util.Date;
import java.util.List;

import hotelManagementSystem.enumsAndConstants.RoomStyle;
import hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping.Room;

/**
 * @author Hammad: 25-Feb-2022
 */
public interface Search {

	public abstract List<Room> search(RoomStyle style, Date startDate, int duration);
}
