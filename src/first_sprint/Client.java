package first_sprint;

public class Client extends User{
	
	private double walletBalance;

	public Client(String email, boolean type, String password, String username, double walletBalance) {
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

	
	
	
}
