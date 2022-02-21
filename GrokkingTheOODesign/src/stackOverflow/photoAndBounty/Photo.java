package stackOverflow.photoAndBounty;

import java.util.Date;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Photo {
	private int photoId;
	private String photoPath;
	private Date creationDate;

//	private Member creatingMember;   Not reflected in the UML DiagramS  

	public boolean delete() {
		System.out.println("Deleting photo in the Photo Class...");
		return true;
	}
}
