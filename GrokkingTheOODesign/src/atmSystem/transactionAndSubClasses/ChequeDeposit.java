package atmSystem.transactionAndSubClasses;

/**
 * @author Hammad: 22-Feb-2022
 */
public class ChequeDeposit extends Deposit {
	private String chequeNumber;
	private String bankCode;

	public String getChequeNumber() {
		System.out.println("Returning Cheque Number from ChequeDeposit Class...");
		return chequeNumber;
	}

}
