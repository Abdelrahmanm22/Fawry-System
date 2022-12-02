package order;

public class Order{
	
	private String serviceName;
	private String serviceePrice;
	
	

	public Order(String serviceName, String serviceePrice) {
		super();
		this.serviceName = serviceName;
		this.serviceePrice = serviceePrice;
	}



	public String getServiceName() {
		return serviceName;
	}



	public String getServiceePrice() {
		return serviceePrice;
	}


}
