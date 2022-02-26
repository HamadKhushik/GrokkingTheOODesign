package restaurantManagementSystem.tableTableSeatAndReservation;

import java.util.Date;

import restaurantManagementSystem.accountPersonAndAssociated.Customer;
import restaurantManagementSystem.enumsAndConstants.ReservationStatus;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Reservation {
	private int reservationId;
	private Date timeOfReservation;
	private int peopleCount;
	private ReservationStatus status;
	private String notes;
	private Date checkinTime;
	private Customer customer;

	private Table[] tables;
//	private List<Notification> notifications;

	public boolean updatePeopleCount(int count) {
		this.peopleCount = count;
		return true;
	}
}
