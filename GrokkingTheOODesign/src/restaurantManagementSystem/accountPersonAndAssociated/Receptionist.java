package restaurantManagementSystem.accountPersonAndAssociated;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Receptionist extends Employee {

	public boolean createReservation() {
		System.out.println("Creating Reservation in the Receptionist Class...");
		return true;
	}

	public List<Customer> searchCustomer(String name) {
		System.out.println("Searching for Customer " + name + " in the Receptionist Class...");
		return new ArrayList<Customer>();
	}
}
