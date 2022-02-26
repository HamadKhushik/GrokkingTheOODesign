package restaurantManagementSystem.orderMealAndMealItem;

import restaurantManagementSystem.menuAndAssociatedClasses.MenuItem;

/**
 * @author Hammad: 26-Feb-2022
 */
public class MealItem {
	private int mealItemId;
	private int quantity;

	private MenuItem menuItem;

	public boolean updateQuantity(int quantity) {
		System.out.println("Updating quantity in the MealItem Class...");
		return true;
	}
}
