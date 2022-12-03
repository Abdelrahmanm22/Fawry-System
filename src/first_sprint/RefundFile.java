package first_sprint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import order.Order;

public class RefundFile implements Observer{
	
	
	String State;
	public void update(String state) {
//		BufferedWriter writer = new BufferedWriter(new FileWriter("RefundRequest.txt", true));
		this.State=state;
		
	}
	
	public void changeInFile(Order order) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("RefundRequest.txt", true));
		writer.append('\n');
		writer.append(order.getEmail()+" "+order.getServiceName()+" "+order.getServiceePrice()+" Pending");
		writer.close();
		
		System.out.println("Your Request is Done..");
		
	}
	

}
