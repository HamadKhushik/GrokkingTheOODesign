package blackJack;

import java.util.ArrayList;

/**
 * @author Hammad: 23-Feb-2022
 */
public class Player extends BasePlayer {
	private int bet;
	private int totalCash;

	public Player(Hand hand) {
		this.hands = new ArrayList<Hand>();
		this.hands.add(hand);
	}
}
