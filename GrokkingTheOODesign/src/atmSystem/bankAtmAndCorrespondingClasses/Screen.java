package atmSystem.bankAtmAndCorrespondingClasses;

import atmSystem.enumsAndDataTypes.TransactionType;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Screen {

	public boolean showMessage(String message) {
		System.out.println("displaying message in the Screen Class...");
		return true;
	}

	public TransactionType getInput() {
		System.out.println("Getting input for transaction Type in the Screen Class...");
		return TransactionType.BALANCE_ENQUIRY;
	}
}
