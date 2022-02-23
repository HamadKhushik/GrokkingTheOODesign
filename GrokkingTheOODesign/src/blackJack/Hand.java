package blackJack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 23-Feb-2022
 */
public class Hand {
	private List<BlackJackCard> cards;

	public Hand(BlackJackCard c1, BlackJackCard c2) {
		this.cards = new ArrayList<BlackJackCard>();
		this.cards.add(c1);
		this.cards.add(c2);
	}

	private List<Integer> getScores() {
		List<Integer> totals = new ArrayList<Integer>();
		totals.add(0);

		for (BlackJackCard card : cards) {
			List<Integer> newTotals = new ArrayList<Integer>();
			for (Integer score : totals) {
				newTotals.add(card.getFaceValue() + score);
				if (card.getFaceValue() == 1) {
					newTotals.add(11 + score);
				}
			}
			totals = newTotals;
		}
		return totals;
	}

	public void addCard(BlackJackCard card) {
		cards.add(card);
	}

	// get highest score which is less than or equal to 21
	public int resolveScores() {
		List<Integer> scores = getScores();
		int bestScore = 0;
		for (int score : scores) {
			if (score <= 21 && score > bestScore) {
				bestScore = score;
			}
		}
		return bestScore;
	}
}
