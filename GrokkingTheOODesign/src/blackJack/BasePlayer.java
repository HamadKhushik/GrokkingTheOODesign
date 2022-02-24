package blackJack;

import java.util.List;

/**
 * @author Hammad: 23-Feb-2022
 */
public abstract class BasePlayer {
	private String id;
	private String password;
	private double balance;
	private AccountStatus status;
	private Person person;
	protected List<Hand> hands;

	public boolean resetPassword() {
		System.out.println("Reseting password in the BasePlayer Class...");
		return true;
	}

	public List<Hand> getHands() {
		return hands;
	}

	public void addHand(Hand hand) {
		hands.add(hand);
	}

	public void removeHand(Hand hand) {
		hands.remove(hand);
	}

}
