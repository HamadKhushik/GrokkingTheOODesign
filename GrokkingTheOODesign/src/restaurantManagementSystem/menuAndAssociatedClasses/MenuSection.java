package restaurantManagementSystem.menuAndAssociatedClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 26-Feb-2022
 */
public class MenuSection {
	private int menuSectionId;
	private String title;
	private String description;

	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public boolean addMenuItems() {
		System.out.println("Adding menu items in the MenuSection Class...");
		return true;
	}
}
