package first_sprint;

import java.io.IOException;

import order.Order;

public interface Observer {
	public void update(String email,String state) throws IOException;
}
