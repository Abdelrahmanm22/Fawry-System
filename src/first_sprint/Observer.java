package first_sprint;

import order.Order;

public interface Observer {
	public void update(Order order ,String state);
}
