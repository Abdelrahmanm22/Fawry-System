package first_sprint;

public class ClientCreator {

	Client client;
	
	public ClientCreator(Client client) {
		this.client = client;
	}
	public  Services createServices(String type){
        if (type.equals("Mobile")) {
            return new MobileRecharge();
        } else if (type.equals("Internet")) {
            return new InternetPayment();
        } else if (type.equals("Landline")) {
            return new Landline();
        } else if (type.equals("Donations")) {
         return new Donations();
        }
        return null;
    }
	
	
	
	public Services fawryPayment(String type) {
		Services services;
		services = createServices(type);
		services.payment();
		return services;
	}
}
