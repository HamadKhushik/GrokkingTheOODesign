package atmSystem.bankAtmAndCorrespondingClasses;

import atmSystem.customerCardAndAccount.Customer;
import atmSystem.enumsAndDataTypes.Address;
import atmSystem.transactionAndSubClasses.Transaction;

/**
 * @author Hammad: 22-Feb-2022
 */
public class ATM {
	private int atmId;
	private Address location;

	private CashDispenser cashDispenser;
	private Keypad keypad;
	private Screen screen;
	private Printer printer;
	private CardReader cardReader;
	private DepositSlot depositSlot;
	private ChequeDepositSlot chequeDepositSlot;
	private CashDepositSlot cashDepositSlot;

	public boolean authenticateUser() {
		System.out.println("Authenticating User in the ATM Class...");
		return true;
	}

	// this is alse encapsulate in the customer class without the arguments
	public boolean makeTransaction(Customer customer, Transaction transaction) {
		System.out.println("Making Transaction in the ATM Class...");
		return true;
	}
}
