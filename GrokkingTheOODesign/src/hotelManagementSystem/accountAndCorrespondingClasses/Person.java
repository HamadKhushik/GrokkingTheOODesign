package hotelManagementSystem.accountAndCorrespondingClasses;

import hotelManagementSystem.enumsAndConstants.AccountType;
import hotelManagementSystem.enumsAndConstants.Address;

/**
 * @author Hammad: 25-Feb-2022
 */
public abstract class Person {
	private String name;
	private Address address;
	private String email;
	private String phone;

	private AccountType accountType;
}
