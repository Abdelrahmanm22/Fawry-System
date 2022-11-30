package first_sprint;

public abstract class payment_method {
	
	double amount;
	payment_method(String amount){
		this.amount=Double.valueOf(amount);
		
	}
	
	protected Client creator;
	
	public abstract void performpay();
	

}
