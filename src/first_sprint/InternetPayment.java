package first_sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InternetPayment extends Services{

//	List<String> providers = new ArrayList<>();
	public void payment() {
		System.out.println("InternetPayment succ");
	}
	
	public void print() {
		for(int i = 0 ; i<super.providers.size();i++) {
			System.out.println(super.providers.get(i).name);
		}
	}
	
	
	public void get_Providers() throws FileNotFoundException {
		super.providers = new ArrayList<>();
		File file = new File("D:\\F  C  I\\Fawry_System\\ServiceProviders.txt");
		Scanner scanner = new Scanner(file);
		FieldFactory f = new FieldFactory();
		while (scanner.hasNextLine()) {
		    String data = scanner.nextLine();
		    String provider[] = data.split("\\s");
//	            System.out.println(userData[1]);
//		    System.out.println(provider[0]);
		    Service_provider sp = new Internet_service_provider();
		    if(provider[0].equals("internet")) {
		   
		    	for(int i =2; i<provider.length; i++) {
		    		sp = f.createField(provider[i], sp);
		    	}
		    	sp.name = provider[1];
//		    	System.out.println(sp.name);
		    	super.providers.add(sp);
		    }
		    
		    	
		    //System.out.println(data);
		  }
	}
}
