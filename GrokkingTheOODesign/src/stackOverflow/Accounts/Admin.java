package stackOverflow.Accounts;

/**
 * @author Hammad: 21-Feb-2022
 */
public class Admin extends Member {

	public boolean blockMember(Member member) {
		System.out.println("Blocking member in the Admin Class...");
		return true;
	}

	public boolean unBlockMember(Member member) {
		System.out.println("UnBlocking Member in the Admin Class...");
		return true;
	}
}
