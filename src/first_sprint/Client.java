package first_sprint;

public class Client extends User{
	
	private double walletBalance;

	public Client(String email, String type, String password, String username, double walletBalance) {
		super(email, type, password, username);
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	@Override
	public String toString() {
		return "Client [walletBalance=" + walletBalance + ", username=" + username + ", email=" + email + ", password="
				+ password + ", type=" + type + "]";
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
	
	
	@Override
	public Services fawryPayment(String type) {
		Services services;
		services = createServices(type);
		services.payment();
		return services;
	}

	
	
	
}
