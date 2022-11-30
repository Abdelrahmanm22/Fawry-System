package first_sprint;

import java.util.ArrayList;
import java.util.List;

public class Landline extends Services{

//	List<String> providers = new ArrayList<>();
	public void payment() {
		System.out.println("Landline succ");
	}
	
	public void showProviders() {
		int i=1;
		 for(String p: providers) {
		    	System.out.println(i+". "+p);
		    	i++;
		    }
	}
	public  void get_Providers() {
		
	}
}
