package atmSystem.customerCardAndAccount;

import atmSystem.enumsAndDataTypes.Address;
import atmSystem.enumsAndDataTypes.CustomerStatus;
import atmSystem.transactionAndSubClasses.Transaction;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Customer {
	private String name;
	private String email;
	private String phone;
	private Address address;
	private CustomerStatus status;

	private Card card;
	private Account acount;

	public boolean makeTransaction(Transaction transaction) {
		System.out.println("Making Transaction in the Customer Class...");
		return true;
	}

	public Address getBillingAddress() {
		System.out.println("Returning Billing Address in the Customer Class...");
		return new Address();
	}
}
