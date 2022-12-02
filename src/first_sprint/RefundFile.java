package first_sprint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import order.Order;

public class RefundFile implements Observer{
	
	
	String State;
	public void update(Order order,String state) {
		BufferedWriter writer = new BufferedWriter(new FileWriter("RefundRequest.txt", true));
		this.State=state;
		
	}
	

}
