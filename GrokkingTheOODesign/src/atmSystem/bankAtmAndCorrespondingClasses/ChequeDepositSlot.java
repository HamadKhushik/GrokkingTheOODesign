package atmSystem.bankAtmAndCorrespondingClasses;

/**
 * @author Hammad: 22-Feb-2022
 */
public class ChequeDepositSlot extends DepositSlot {

	public double getChequeAmount() {
		System.out.println("Returning Cheque Amount in the Cheques Deposit Class...");
		return super.getTotalAmount();
	}
}
