package first_sprint;

import java.util.ArrayList;
import java.util.List;

public abstract class Services {
	
	List<String> providers = new ArrayList<>();
	public abstract void payment();
	public void showProviders() {
		int i=1;
		for(String p: providers) {
		    	System.out.println(i+". "+p);
		    	i++;
		}
	}
	public abstract void get_Providers();
	

}
