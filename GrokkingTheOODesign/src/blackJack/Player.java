package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Hammad: 23-Feb-2022
 */
public class Player extends BasePlayer {
	private int bet;
	private int totalCash;

	public Player() { // public Player(Hand hand) -> in course
		this.hands = new ArrayList<Hand>();
		// this.hands.add(hand);
	}

	public boolean placeBet() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the bet in integers...");
		if (scanner.hasNextInt()) {
			bet = scanner.nextInt();
			scanner.nextLine();
			return true;
		}
		return false;
	}

	@Override
	public void addHand(Hand hand) {
		super.addHand(hand);
		System.out.println("Hand with cards: " + hand.toString() + " added to player");
	}
}
