package restaurantManagementSystem.menuAndAssociatedClasses;

/**
 * @author Hammad: 26-Feb-2022
 */
public class MenuItem {
	private int menuItemId;
	private String title;
	private String description;
	private double price;

	public boolean updatePrice(double price) {
		this.price = price;
		return true;
	}
}
