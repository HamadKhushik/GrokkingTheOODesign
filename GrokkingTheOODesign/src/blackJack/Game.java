package blackJack;

import java.util.List;
import java.util.Scanner;

/**
 * @author Hammad: 24-Feb-2022
 */
public class Game {
	private Player player;
	private Dealer dealer;
	private Shoe shoe;
	private final int MAX_NUM_OF_DECKS = 3;

	public Game(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
		shoe = new Shoe(MAX_NUM_OF_DECKS);
	}

	private void playAction(String action, Hand hand) {
		switch (action) {
		case "hit":
			hit(hand);
			break;
		case "split":
			split(hand);
			break;
		case "stand pat":
			break; // do nothing
		case "stand":
			stand();
			break;
		default:
			System.out.println("wrong input");

		}
	}

	private void hit(Hand hand) {
		hand.addCard(shoe.dealCard());
	}

	private void stand() {
//		int playerScore = player.getTotalScore();  redundant code
		int dealerScore = dealer.getTotalScore();
		List<Hand> hands = player.getHands();
		for (Hand hand : hands) {
			int bestScore = hand.resolveScores();
			System.out.println("Player hands=  " + hands);
			if (bestScore == 21) { // BlackJack
				System.out.println("BlackJack! player gets 3:2 of the bet");
			} else if (bestScore > dealerScore) {
				System.out.println("Player score = " + bestScore + " Dealer score = " + dealerScore);
				System.out.println("Player wins and gets equal to the bet");
			} else if (bestScore < dealerScore) {
				System.out.println("Player score = " + bestScore + " Dealer score = " + dealerScore);
				System.out.println("Player loses and the bet is collected from the player");
			} else {
				System.out.println("This game is a tie");
			}
		}
	}

	private void split(Hand hand) {
		List<BlackJackCard> cards = hand.getCards();
		player.addHand(new Hand(cards.get(0), shoe.dealCard()));
		player.addHand(new Hand(cards.get(1), shoe.dealCard()));
		player.removeHand(hand);
	}

	public String getUserAction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the action as 'hit', 'split', 'stand pat', 'stand'");
		String action = scanner.next();
		scanner.nextLine();
		return action;
	}

	public void start() {
		player.placeBet();

		Hand playerHand = new Hand(shoe.dealCard(), shoe.dealCard());
		player.addHand(playerHand);

		Hand dealerHand = new Hand(shoe.dealCard(), shoe.dealCard());
		dealer.addHand(dealerHand);

		while (true) {
			List<Hand> hands = player.getHands();
			for (Hand hand : hands) {
				String action = getUserAction();
				playAction(action, hand);
				if (action.equals("stand")) {
					break;
				}
			}
			break;
		}
	}

	public static void main(String[] args) {
		Player player = new Player();
		Dealer dealer = new Dealer();

		Game game = new Game(player, dealer);
		game.start();
//		Shoe shoe = new Shoe(2);
//		player.placeBet();
//		Hand hand = new Hand(shoe.dealCard(), shoe.dealCard());
//		System.out.println("Hello");
	}
}
