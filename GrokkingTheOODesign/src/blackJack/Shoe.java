package blackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Hammad: 23-Feb-2022
 */
public class Shoe {
	private List<BlackJackCard> cards;
	private int numberOfDecks;

	public Shoe(int numberOfDecks) {
		this.numberOfDecks = numberOfDecks;
		createShoe();
		shuffle();
	}

	private void createShoe() {
		this.cards = new ArrayList<BlackJackCard>();
		for (int decks = 0; decks < numberOfDecks; decks++) {
			cards.addAll(new Deck().getCards());
		}
	}

	public void shuffle() {
		int cardSize = cards.size();
		Random rand = new Random();
		for (int i = 0; i < cardSize; i++) {
			int index = i + rand.nextInt(cardSize - i); // rand.nextInt(cardSize - i - 1);-> in the course. I used the
														// fisher - yates algorithm instead wikipaedia
			swap(i, index);
		}
	}

	private void swap(int a, int b) {
		BlackJackCard temp = cards.get(a);
		cards.add(a, cards.get(b));
		cards.add(b, temp);
	}

	// Get the next card from Shoe
	public BlackJackCard dealCard() {
		if (cards.size() == 0) {
			createShoe();
		}
		return cards.remove(0);
	}
}
