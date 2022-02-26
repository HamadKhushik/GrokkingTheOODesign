package restaurantManagementSystem.restaurantBranchKitchenTableChart;

import java.util.ArrayList;
import java.util.List;

import restaurantManagementSystem.accountPersonAndAssociated.Chef;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Kitchen {
	private String name;
	private List<Chef> chefs = new ArrayList<Chef>();

	private boolean assignChef() {
		System.out.println("Assigning chef in the Kitchen Class...");
		return true;
	}
}
