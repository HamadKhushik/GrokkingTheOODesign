package stackOverflow.questionCommentAndAnswer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import stackOverflow.Search;
import stackOverflow.Accounts.Member;
import stackOverflow.enumsAndDataTypes.QuestionClosingRemark;
import stackOverflow.enumsAndDataTypes.QuestionStatus;
import stackOverflow.photoAndBounty.Bounty;
import stackOverflow.photoAndBounty.Photo;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Question implements Search {
	private String title;
	private String description;
	private int viewCount;
	private int voteCount;
	private Date creationDate;
	private Date updateTime;
	private QuestionStatus status;
	private QuestionClosingRemark closingRemark;

	private Member askingMember;
	private Bounty bounty;
	private List<Photo> photos;
	private List<Comment> comments;
	private List<Answer> answers;

	public boolean close() {
		System.out.println("Closing Question in the Question Class...");
		return true;
	}

	public boolean unDelete() {
		System.out.println("UnDeleting Question in the Question Class...");
		return true;
	}

	public boolean addComment(Comment comment) {
		System.out.println("Adding Comment in the Question Class...");
		return true;
	}

	public boolean addBounty() {
		System.out.println("Adding Bounty in the Question Class...");
		return true;
	}

	@Override
	public List<Question> search(String query) {
		System.out.println("Searching a query in the Question Class and retruning an empty List<Question>");
		// return all the questions containing the String query in the title or
		// description
		return new ArrayList<Question>();
	}
}
