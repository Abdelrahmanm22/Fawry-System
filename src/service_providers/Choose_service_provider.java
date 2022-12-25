package service_providers;

import java.util.ArrayList;

public class Choose_service_provider {
	public Choose_service_provider() {
		Service_provider vodafone=new Internet_service_provider ();
		Service_provider Orange =new Internet_service_provider ();
		Service_provider Etisalat =new Internet_service_provider ();
		vodafone=new Phone_number(vodafone);
		vodafone=new Amount(vodafone);
		Orange=new Phone_number(Orange);
		Orange = new Amount(Orange);
		ArrayList<String>v=vodafone.get_answer();
		System.out.println(v);
	
	}
	

}
