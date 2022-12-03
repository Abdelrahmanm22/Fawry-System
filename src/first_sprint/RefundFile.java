package first_sprint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import order.Order;

public class RefundFile implements Observer{
	
	String email;
	String State;
	public void update(String email,String state) throws IOException {
//		BufferedWriter writer = new BufferedWriter(new FileWriter("RefundRequest.txt", true));
		this.State=state;
		this.email=email;
		System.out.println(email+" "+state);
		 ArrayList<String>arr=new ArrayList<String>();
			try {
			      File myObj = new File("RefundRequest.txt");
			      Scanner myReader = new Scanner(myObj);
			     
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        arr.add(data);
			    		    }
			      myReader.close();
			      
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			double refund = 0;
			File inputFile = new File("RefundRequest.txt");
			File tempFile = new File("Temp.txt");
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
			String lineToRemove = null;
		for(String i:arr){
			String arr1[]=(i).split("\\s");
			   
			if(arr1[0].equals(email)) {
				lineToRemove = i;
				BufferedWriter writer1 = new BufferedWriter(new FileWriter("Response.txt", true));
			    writer1.append(email+" "+arr1[1]+" " + arr1[2] + " "+state);
			    writer1.append('\n');
			    writer1.close();
			    refund = Double.valueOf(arr1[2]);
			    String currentLine;

				while((currentLine = reader.readLine()) != null) {
				    // trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.equals(lineToRemove)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				}
				writer.close(); 
				reader.close(); 
				inputFile.delete();
				boolean successful = tempFile.renameTo(inputFile);
	    	   break;
			}
			
    	
    	  
    	    // output: 25461234
    	}
		
		if(state.equals("accepted"))
		{
			File inputFile2 = new File("Users.txt");
			File tempFile2 = new File("Temp.txt");
			BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));
			BufferedWriter writer2 = new BufferedWriter(new FileWriter(tempFile2));
			String lineToRemove2 = null;
			//Scanner input = new Scanner(inputFile2);
			String line;
			while((line = reader2.readLine()) != null)
			{
				//line = reader2.readLine();
				String a[] = line.split("\\s");
				if(a[0].equals(email))
				{
					lineToRemove2 = line;
					String currentLine;
					while((currentLine = reader2.readLine()) != null) {
					    // trim newline when comparing with lineToRemove
					    String trimmedLine = currentLine.trim();
					    if(trimmedLine.equals(lineToRemove2)) continue;
					    writer2.write(currentLine + System.getProperty("line.separator"));
					}
					double finalrefund = Double.valueOf(a[4])+refund;
					String newclient = a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+finalrefund;
					writer2.write(newclient + System.getProperty("line.separator"));	
		    	   break;
				}
				
				else
				{
					continue;
				}
			}
			writer2.close(); 
			reader2.close(); 
			inputFile2.delete();
			boolean successful = tempFile2.renameTo(inputFile2);
		}
		
	// output: 25461234
	}
	
	public void changeInFile(Order order) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("RefundRequest.txt", true));
		writer.append(order.getEmail()+" "+order.getServiceName()+" "+order.getServiceePrice()+" Pending");
		writer.append('\n');
		writer.close();
		
		System.out.println("Your Request is Done..");
		
	}
	

}
