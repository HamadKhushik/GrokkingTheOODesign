package stackOverflow.questionCommentAndAnswer;

import java.util.Date;
import java.util.List;

import stackOverflow.Accounts.Member;
import stackOverflow.photoAndBounty.Photo;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Answer {
	private String answerText;
	private boolean accepted;
	private int voteCount;
	private int flagCount;
	private Date creationDate;

	private Member creatingMember;
	private List<Photo> photos;

	public boolean incrementVoteCount() {
		System.out.println("Incrementing Vote Count in the Answer Class...");
		return true;
	}
}
