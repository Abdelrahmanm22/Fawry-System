package first_sprint;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public abstract class Services {
	
	List<Service_provider> providers;// = new ArrayList<>();
	public abstract void payment();
	public void showProviders() {
		int i=1;
		for(Service_provider p: providers) {
		    	System.out.println(i+". "+p.name);
		    	i++;
		}
	}
	public abstract void get_Providers() throws FileNotFoundException;
	

}
