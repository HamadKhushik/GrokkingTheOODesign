package restaurantManagementSystem.tableTableSeatAndReservation;

import restaurantManagementSystem.enumsAndConstants.SeatType;

/**
 * @author Hammad: 26-Feb-2022
 */
public class TableSeat {
	private int tableSeatNumber;
	private SeatType type;

	public boolean updateSeatType(SeatType type) {
		this.type = type;
		return true;
	}
}
