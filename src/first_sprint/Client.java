package first_sprint;

public class Client extends User{
	
	private double walletBalance;

	public Client(String name, int age, String email, String password, double walletBalance) {
		super(name, age, email, password);
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	@Override
	public String toString() {
		return "Client [walletBalance=" + walletBalance + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}
