package restaurantManagementSystem.restaurantBranchKitchenTableChart;

import restaurantManagementSystem.enumsAndConstants.Address;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Branch {
	private String name;
	private Address location;

	private Kitchen kitchen;
	private TableChart tableChart;

	public boolean addTableChart() {
		System.out.println("Adding Table Chart in the Branch Class...");
		return true;
	}

}
