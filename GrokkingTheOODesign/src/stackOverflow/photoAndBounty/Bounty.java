package stackOverflow.photoAndBounty;

import java.util.Date;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Bounty {
	private int reputation;
	private Date expiryDate;

	public boolean modifyReputation(int reputation) {
		this.reputation = reputation;
		return true;
	}
}
