package restaurantManagementSystem.restaurantBranchKitchenTableChart;

import java.util.List;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Restaurant {
	private String name;
	private List<Branch> branches;

	public boolean addBranch() {
		System.out.println("Adding a branch to the restaurant in the Restaurant Class...");
		return true;
	}
}
