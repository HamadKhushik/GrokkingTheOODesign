package atmSystem.transactionAndSubClasses;

import java.util.Date;

import atmSystem.enumsAndDataTypes.TransactionStatus;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Transaction {
	private int transactionId;
	private TransactionStatus status;
	private Date creationDate;

	public boolean makeTransaction() {
		System.out.println("Making Transaction in the Transaction Class...");
		return true;
	}
}
