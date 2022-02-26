package restaurantManagementSystem.orderMealAndMealItem;

import java.util.Date;

import restaurantManagementSystem.accountPersonAndAssociated.Chef;
import restaurantManagementSystem.accountPersonAndAssociated.Waiter;
import restaurantManagementSystem.enumsAndConstants.OrderStatus;
import restaurantManagementSystem.tableTableSeatAndReservation.Table;

/**
 * @author Hammad: 26-Feb-2022
 */
public class Order {
	private int orderId;
	private OrderStatus status;
	private Date creationTime;

	private Meal[] meals;
	private Table table;
	private Waiter waiter;
	private Chef chef;

	public boolean addMeal(Meal meal) {
		System.out.println("Adding meal in the Order Class...");
		return true;
	}

	public boolean removeMeal(Meal meal) {
		System.out.println("Removing meal in the Order Class...");
		return true;
	}

	public OrderStatus getStatus() {
		return this.status;
	}

	public boolean setStatus(OrderStatus status) {
		this.status = status;
		return true;
	}
}
