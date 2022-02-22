package atmSystem.bankAtmAndCorrespondingClasses;

/**
 * @author Hammad: 22-Feb-2022
 */
public class CashDispenser {
	private int totalFiveGBPNotes;
	private int totaltenGBPNotes;
	private int totaltwentyGBPNotes;

	public boolean dispenseCash(double amount) {
		System.out.println("Dispensing Cash in the CashDispenser Class...");
		return true;
	}

	public boolean canDispenseCash() {
		System.out.println("Checking if ATM can Dispense cash in the CashDispenser Class...");
		return true;
	}
}
