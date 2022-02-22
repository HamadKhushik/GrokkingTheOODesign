package atmSystem.customerCardAndAccount;

import java.util.Date;

import atmSystem.enumsAndDataTypes.Address;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Card {
	private String cardNumber;
	private String customerName;
	private Date expiryDate;
	private int pin;

	public Address getBillingAddress() {
		System.out.println("Returning Billing Address in the Card Class...");
		return new Address();
	}
}
