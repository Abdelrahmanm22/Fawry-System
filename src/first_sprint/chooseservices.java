package first_sprint;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import order.BaseReciept;
import order.DiscountCondition;
import order.Order;
import order.Receipt;

public class chooseservices {

	ClientCreator cc;
	public chooseservices(Client client) throws FileNotFoundException {
	
		cc = new ClientCreator(client);
		Services services; //= cc.fawryPayment("Internet");
		Order order;
		BaseReciept reciept;
		
		DiscountList list = DiscountList.getInstance();
//		list.addDiscount("internet payment", 0.2);
//		list.addDiscount("first time",0.1);
//		list.addDiscount("mobile recharge", 0.3);
//		list.addDiscount("all", 0.5);
		
		List<String> servicesList = new ArrayList<>();
		servicesList.add("mobile recharge");
		servicesList.add("internet payment");
		servicesList.add("landline");
		servicesList.add("donations");

		while(true) {
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of the service you want:");
			System.out.println("1. Mobile Recharge");
			System.out.println("2. Internet Payment");
			System.out.println("3. Landline");
			System.out.println("4. Donations");
			System.out.println("$. Search...");
			System.out.println("#. Logout");



		    String option = input.nextLine();
		    
		    if(option.equals("1")) {
		    	services = cc.fawryPayment("mobile recharge");
		    
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2-1).get_answer();
		    	order = new Order("mobile recharge", answers.get(answers.size()-1));
		    	reciept = new Receipt(order);
		    	new choose_payment_method(reciept,client);
		    	client.addOrder(reciept.getOrderDetails());
		    }
		    else if(option.equals("2")) {
		    	services = cc.fawryPayment("internet payment");

		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2-1).get_answer();
		    	order = new Order("internet payment", answers.get(answers.size()-1));
		    	reciept = new Receipt(order);
		    	new choose_payment_method(reciept,client);
		    	client.addOrder(reciept.getOrderDetails());
		    }
		    else if(option.equals("3")) {
		    	services = cc.fawryPayment("landline");
		    	
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2-1).get_answer();
		    	order = new Order("landline", answers.get(answers.size()-1));
		    	reciept = new Receipt(order);
		    	new choose_payment_method(reciept,client);
		    	client.addOrder(reciept.getOrderDetails());
		    }
		    else if(option.equals("4")) {
		    	services = cc.fawryPayment("donations");
		    
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2-1).get_answer();
		    	order = new Order("donations", answers.get(answers.size()-1));
		    	reciept = new Receipt(order);
		    	new choose_payment_method(reciept,client);
		    	client.addOrder(reciept.getOrderDetails());
		    }
		    else if(option.equals("$")) {
		    	System.out.print("Search on: ");
			    String search = input.nextLine();
			    search = search.toLowerCase();
			    
			    boolean foundResult = false;
			    for(String i: servicesList) {
			    	if(i.contains(search)) {
			    		System.out.println(i);
			    		foundResult = true;

			    		System.out.println("Do you want this service?(answer 0 or 1)");
			    		option = input.nextLine();
			    		if(option.equals("1")) {
			    			services = cc.fawryPayment(i);
			    			
			    			services.get_Providers();
					    	System.out.println("Enter the number of your provider:");
					    	services.showProviders();
					    	int option2 = input.nextInt();
					    	ArrayList<String> answers = services.providers.get(option2-1).get_answer();
					    	order = new Order(i, answers.get(answers.size()-1));
					    	reciept = new Receipt(order);
					    	new choose_payment_method(reciept,client);
					    	client.addOrder(order);
					    	
			    		}
			    		else
			    			continue;
			    	}
			    	
			    }
			    
			    if(!foundResult) 
			    	System.out.println("Search not found");
			    
		    }
		    else if(option.equals("#")) {
		    	break;
		    }
		    //new Choose_service_provider ();
		    
		}
	}

}
