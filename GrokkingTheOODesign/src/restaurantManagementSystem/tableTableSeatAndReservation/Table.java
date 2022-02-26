package restaurantManagementSystem.tableTableSeatAndReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import restaurantManagementSystem.enumsAndConstants.TableStatus;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Table {
	private int tableId;
	private TableStatus status;
	private int maxCapacity;
	private int locationIdentifier;

	private List<TableSeat> seats;

	public boolean isTableFree() {
		System.out.println("Checking if Table is free in the Table Class...");
		return true;
	}

	public boolean addReservation() {
		System.out.println("Adding reservation in the Table Class...");
		return true;
	}

	public static List<Table> search(int capacity, Date startTime) {
		System.out.println("Searching Table in the Table Class...");
		return new ArrayList<Table>();
	}
}
