package first_sprint;

public class pay_with_card extends payment_method {


	pay_with_card(String amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void performpay() {
		System.out.println("Successfully pay with card "+amount);
		
	}

}
