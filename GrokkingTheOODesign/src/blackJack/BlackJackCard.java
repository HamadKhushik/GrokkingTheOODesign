package blackJack;

/**
 * @author Hammad: 22-Feb-2022
 */
public class BlackJackCard extends Card {
	private int gameValue;

	public BlackJackCard(Suit suit, int faceValue) {
		super(suit, faceValue);
		this.gameValue = faceValue;
		if (gameValue > 10) {
			this.gameValue = 10;
		}
	}

	public int getGameValue() {
		return gameValue;
	}
}
