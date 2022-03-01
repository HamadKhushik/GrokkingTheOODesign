package onlineStockBrockerageSystem;

import java.util.HashMap;

import onlineStockBrockerageSystem.enumsAndConstants.TimeEnforcementType;

/**
 * @author Hammad: 28-Feb-2022
 */
public abstract class Order {
	private String orderNumber;
	public boolean isBuyOrder;
	private OrderStatus status;
	private TimeEnforcementType timeEnforcement;
	private Date creationDate;

	private HashMap<Integer, OrderPart> parts;

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public boolean saveInDb() {
		System.out.println("Saving in DB in the Order Class...");
	}

	public void addOrderParts(OrderParts parts) {
		for (OrderParts part : parts) {
			this.parts.put(part.id, part);
		}
	}
}
