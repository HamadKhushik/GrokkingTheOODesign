package restaurantManagementSystem.accountPersonAndAssociated;

import restaurantManagementSystem.enumsAndConstants.AccountStatus;
import restaurantManagementSystem.enumsAndConstants.Address;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Account {
	private String id;
	private String password;
	private Address address;
	private AccountStatus status;

	public boolean resetPassword() {
		System.out.println("Resetting password in the Acccount Class...");
		return true;
	}
}
