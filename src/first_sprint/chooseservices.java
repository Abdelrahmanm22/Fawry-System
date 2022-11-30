package first_sprint;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chooseservices {

	ClientCreator cc;
	public chooseservices(Client client) throws FileNotFoundException {
	
		cc = new ClientCreator(client);
		Services services; //= cc.fawryPayment("Internet");
		
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


		    String option = input.nextLine();
		    
		    if(option.equals("1")) {
		    	services = cc.fawryPayment("mobile recharge");
		    
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2).get_answer();
		    }
		    else if(option.equals("2")) {
		    	services = cc.fawryPayment("internet payment");

		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2).get_answer();
		    	new choose_payment_method(answers.get(answers.size()-1),client);
		    }
		    else if(option.equals("3")) {
		    	services = cc.fawryPayment("landline");
		    	
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2).get_answer();
		    }
		    else if(option.equals("4")) {
		    	services = cc.fawryPayment("donations");
		    
		    	services.get_Providers();
		    	System.out.println("Enter the number of your provider:");
		    	services.showProviders();
		    	int option2 = input.nextInt();
		    	ArrayList<String> answers = services.providers.get(option2).get_answer();
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
					    	ArrayList<String> answers = services.providers.get(option2).get_answer();
			    		}
			    		else
			    			continue;
			    	}
			    	
			    }
			    
			    if(!foundResult) 
			    	System.out.println("Search not found");
			    
		    }
		    //new Choose_service_provider ();
		    
		}
	}

}
