package stackOverflow;

import java.util.List;

import stackOverflow.questionCommentAndAnswer.Question;

/**
 * @author Hammad: 21-Feb-2022
 */
public interface Search {

	public List<Question> search(String query);
}
