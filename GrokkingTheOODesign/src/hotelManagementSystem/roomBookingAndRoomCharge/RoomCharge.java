package hotelManagementSystem.roomBookingAndRoomCharge;

import java.util.Date;

/**
 * @author Hammad: 25-Feb-2022
 */
public abstract class RoomCharge {
	public Date issuedAt;

	public boolean addInvoiceItem() {
		System.out.println("Adding Invoice Item in the RoomCharge Class...");
		return true;
	}
}
