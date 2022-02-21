package stackOverflow.questionCommentAndAnswer;

import java.util.Date;

import stackOverflow.Accounts.Member;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Comment {
	private String text;
	private Date creationDate;
	private int flagCount;
	private int voteCount;

	private Member askingMember;

	public boolean incrementVoteCount() {
		System.out.println("Incrementing Vote Count in the Comment Class...");
		return true;
	}
}
