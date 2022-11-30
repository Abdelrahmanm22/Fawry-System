package first_sprint;

public class pay_cash extends payment_method {

	
	pay_cash(String amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performpay() {
		System.out.println("Successfully pay with cash "+amount);
	}

}
