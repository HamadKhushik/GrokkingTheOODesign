package restaurantManagementSystem.accountPersonAndAssociated;

import java.util.Date;

/**
 * @author Hammad: 26-Feb-2022
 */
public abstract class Employee extends Person {
	private String employeeId;
	private Date dateJoined;

	private Account account;
}
