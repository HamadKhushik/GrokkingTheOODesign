package blackJack;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Hammad: 22-Feb-2022
 */
public class Deck {
	private List<BlackJackCard> cards;
	private Date creationDate;

	public Deck() {
		this.creationDate = new Date();
		cards = new ArrayList<BlackJackCard>();
		for (int value = 1; value <= 13; value++) {
			for (Suit suit : Suit.values()) {
				this.cards.add(new BlackJackCard(suit, value));
			}
		}
	}

	public List<BlackJackCard> getCards() {
		return cards;
	}
}
