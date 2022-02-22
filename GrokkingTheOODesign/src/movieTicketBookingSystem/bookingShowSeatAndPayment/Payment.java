package movieTicketBookingSystem.bookingShowSeatAndPayment;

import java.util.Date;

import movieTicketBookingSystem.enumsContantsDataTypes.PaymentStatus;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Payment {
	private double amount;
	private Date createdOn;
	private int transactionId;
	private PaymentStatus status;
}
