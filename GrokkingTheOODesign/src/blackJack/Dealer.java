package blackJack;

import java.util.ArrayList;

/**
 * @author Hammad: 24-Feb-2022
 */
public class Dealer extends BasePlayer {

	public Dealer() { // in course public Dealer(Hand hand)
		this.hands = new ArrayList<Hand>();
		// this.hands.add(hand);
	}

	public int getTotalScore() {
		int totalScore = 0;
		for (Hand hand : hands) {
			totalScore += hand.resolveScores();
		}
		return totalScore;
	}

	@Override
	public void addHand(Hand hand) {
		super.addHand(hand);
		System.out.println("Hand with cards: " + hand.toString() + " added to dealer");
	}
}
