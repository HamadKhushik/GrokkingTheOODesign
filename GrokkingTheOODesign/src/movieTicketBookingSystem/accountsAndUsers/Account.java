package movieTicketBookingSystem.accountsAndUsers;

import movieTicketBookingSystem.enumsContantsDataTypes.AccountStatus;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Account {
	private String id;
	private String password;
	private AccountStatus status;

	public boolean resetPassword() {
		System.out.println("Reseting password in Account Class...");
		return true;
	}
}
