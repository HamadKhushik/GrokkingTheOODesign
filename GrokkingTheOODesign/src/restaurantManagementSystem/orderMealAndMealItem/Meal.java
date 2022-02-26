package restaurantManagementSystem.orderMealAndMealItem;

import java.util.ArrayList;
import java.util.List;

import restaurantManagementSystem.tableTableSeatAndReservation.TableSeat;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Meal {
	private int mealId;

	private TableSeat seat;
	private List<MealItem> mealItems = new ArrayList<MealItem>();

	public boolean addMealItem(MealItem mealItem) {
		System.out.println("Adding meal item in the Meal Class...");
		return true;
	}
}
