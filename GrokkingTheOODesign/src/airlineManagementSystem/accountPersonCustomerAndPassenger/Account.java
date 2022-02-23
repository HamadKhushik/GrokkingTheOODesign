package airlineManagementSystem.accountPersonCustomerAndPassenger;

import airlineManagementSystem.enumsConstantsAndDataTypes.AccountStatus;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Account {
	private String id;
	private String password;
	private AccountStatus status;

	public boolean resetPassword() {
		System.out.println("Resetting password in the Account Class...");
		return true;
	}
}
