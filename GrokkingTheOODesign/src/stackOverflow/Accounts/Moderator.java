package stackOverflow.Accounts;

import stackOverflow.questionCommentAndAnswer.Question;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Moderator extends Member {

	public boolean closeQuestion(Question question) {
		System.out.println("Closing Question in the Moderator Class...");
		return true;
	}

	public boolean unDeleteQuestion(Question question) {
		System.out.println("UnDeleting Question in the Moderator Class...");
		return true;
	}
}
