package restaurantManagementSystem.menuAndAssociatedClasses;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Menu {
	private int menuId;
	private String title;
	private String description;

	private List<MenuSection> menuSections = new ArrayList<MenuSection>();

	public boolean addMenuSection(MenuSection menuSection) {
		menuSections.add(menuSection);
		return true;
	}

	public void print() {
		System.out.println("Printing the menu in the Menu Class...");
	}
}
