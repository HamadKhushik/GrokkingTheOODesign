package chessEngine;

import chessEngine.enumsAndConstants.AccountStatus;

/**
 * @author Hammad: 26-Feb-2022
 */
public abstract class Account {
	private String id;
	private String password;
	private AccountStatus status;

	public boolean resetPassword() {
		System.out.println("Reseting password in the Account Class...");
		return true;
	}
}
