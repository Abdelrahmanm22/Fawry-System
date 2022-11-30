package first_sprint;

public class pay_with_wallet extends payment_method {
	

	public pay_with_wallet(String amount ,Client creator) {
		this.creator=creator;
		this.amount=Double.valueOf(amount);
	}

	@Override
	public void performpay() {
		creator.getWalletBalance();
		this.creator.walletBalance -= amount;
		
	}

}
