package restaurantManagementSystem.accountPersonAndAssociated;

import java.util.Date;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Customer extends Person {

	public Date lastVisited() {
		System.out.println("Returning last visited Date in the Customer Class...");
		return new Date();
	}
}
