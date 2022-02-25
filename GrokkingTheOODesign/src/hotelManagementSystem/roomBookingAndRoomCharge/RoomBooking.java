package hotelManagementSystem.roomBookingAndRoomCharge;

import java.util.Date;

import hotelManagementSystem.enumsAndConstants.BookingStatus;
import hotelManagementSystem.roomRoomKeyAndRoomHouseKeeping.Room;

/**
 * @author Hammad: 25-Feb-2022
 */
public class RoomBooking {
	private String reservationNumber;
	private Date startDate;
	private int durationInDays;
	private BookingStatus status;
	private Date checkin;
	private Date checkout;

	private int guestId;
	private Room room;
//	private Invoice invoice;
//	private List<Notification> notification;

	public static RoomBooking fetchDetails(String reservationNumber) {
		System.out.println("Fething Room Booking Details in the RoomBooking Class...");
		return new RoomBooking();
	}
}
