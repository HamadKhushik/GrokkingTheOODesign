package stackOverflow.Accounts;

import stackOverflow.enumsAndDataTypes.AccountStatus;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Account {
	private String id;
	private String password;
	private AccountStatus status;
	private String name;
	private String email;
	private String phone;
	private int reputation;

	public boolean resetPassword() {
		System.out.println("Password reset in  Account class...");
		return true;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
