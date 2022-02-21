package stackOverflow.Accounts;

import java.util.List;

import stackOverflow.badgeTagAndNotification.Badge;
import stackOverflow.badgeTagAndNotification.Tag;
import stackOverflow.questionCommentAndAnswer.Question;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Member {
	private Account account;
	private List<Badge> badges;

	public int getReputation() {
		return account.getReputation();
	}

	public String getEmail() {
		return account.getEmail();
	}

	public boolean createQuestion(Question question) {
		System.out.println("Creating Question in the Member class...");
		return true;
	}

	public boolean createTag(Tag tag) {
		System.out.println("Creating Tag in the Member class...");
		return true;
	}
}
