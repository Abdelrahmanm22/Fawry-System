package order;

public class Order{
	
	private String email;
	private String serviceName;
	private String serviceePrice;
	
	
	

	public Order(String email,String serviceName, String serviceePrice) {
		super();
		this.email=email;
		this.serviceName = serviceName;
		this.serviceePrice = serviceePrice;
	}



	public String getServiceName() {
		return serviceName;
	}



	public String getServiceePrice() {
		return serviceePrice;
	}
	
	public void ShowOrder() {
		System.out.println("Your Orders:");
		System.out.println("Service Name: "+this.serviceName+"   Service Price: "+this.serviceePrice);
	}
	
	


}
