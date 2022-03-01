package onlineStockBrockerageSystem;

import java.util.HashMap;

import onlineStockBrockerageSystem.enumsAndConstants.OrderStatus;
import onlineStockBrockerageSystem.enumsAndConstants.TimeEnforcementType;

/**
 * @author Hammad: 01-Mar-2022
 */
public class Member extends Account {
	private double availableFundsForTrading;
	private Date dateOfMembership;

	private HashMap<String, StockPosition> stockPositions;

	private HashMap<Integer, Order> activeOrders;

	public ErrorCode placeSellLimitOrder(String stockId, float quantity, int limitPrice,
			TimeEnforcementType enforcementType) {
	    // check if member has this stock position
		if (!stockPosition.containsKey(stockId)) {
			return NO_STOCK_POSITION;
		}

		StockPosition stockPosition = stockPositions.get(stockId);
	    // check if the member has enough quantity available to sell
		if(stockPosition.getQuantity() < quantity) {
			return INSUFFICIENT_QUANTITY;
		}
		
		LimitOrder order = new LimitOrder(stockId, quantity, limitPrice, enforcementType);
		order.isBuyOrder = false;
		order.saveInDb();
		boolean success = StockExchange::placeOrder(order);
		if(success) {
			order.setStatus(OrderStatus.FAILED);
			order.saveInDb();
		}
		else {
			activeOrders.add(orderId, order);
		}
		return success;
	}

	public ErrorCode placeBuyLimitOrder(String stockId, float quantity int limitPrice, TimeEnforcementType enforcementType) {
	    // check if the member has enough funds to buy this stock
		if(availableFundsForTrading < quantity * limitPrice) {
			return INSUFFICIENT_FUNDS;
		}
		
		LimitOrder order = new LimitOrder(stockId, quantity, limitPrice, enforcementType);
		order.isBuyOrder = true;
		order.saveInDb();
		boolean sucess = StockExchange::placeOrder(order);
		if(!success) {
			order.setStatus(OrderStatus.FAILED);
			order.saveInDb();
		} else {
			activeOrders.add(orderId, order);
		}
		return success;
	}
	
	 // this function will be invoked whenever there is an update from
	  // stock exchange against an order
}
