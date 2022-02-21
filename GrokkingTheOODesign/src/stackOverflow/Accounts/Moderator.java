package stackOverflow.Accounts;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Moderator extends Member {

	public boolean closeQuestion() {
		System.out.println("Closing Question in the Moderator Class...");
		return true;
	}

	public boolean unDeleteQuestion() {
		System.out.println("UnDeleting Question in the Moderator Class...");
		return true;
	}
}
