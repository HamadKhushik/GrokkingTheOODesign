package hotelManagementSystem.accountAndCorrespondingClasses;

import java.util.ArrayList;
import java.util.List;

import hotelManagementSystem.roomBookingAndRoomCharge.RoomBooking;

/**
 * @author Hammad: 25-Feb-2022
 */
public class Guest extends Person {
	private int totalRoomsCheckedIn;

	private List<RoomBooking> roomBooking = new ArrayList<RoomBooking>();

	public List<RoomBooking> getRoomBooking() {
		return roomBooking;
	}
}
