package stackOverflow.badgeTagAndNotification;

import java.util.Date;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Notification {
	private int notificationId;
	private Date creationDate;
	private String content;

	public boolean sendNotification() {
		System.out.println("Sending Notification from the Notification Class...");
		return true;
	}
}
