package onlineStockBrockerageSystem;

import restaurantManagementSystem.orderMealAndMealItem.Order;

/**
 * @author Hammad: 28-Feb-2022
 */
public class StockExchange {

	private static StockExchange stockExchangeInstance = null;

	// private constructor to restrict for singleton
	private StockExchange() {
	}

	public static StockExchange getInstance() {
		if (stockExchangeInstance == null) {
			stockExchangeInstance = new StockExchange();
		}
		return stockExchangeInstance;
	}

	public static boolean placeOrder(Order order) {
		boolean returnStatus = getInstance().submitOrder(order);
		return returnStatus;
	}
}
