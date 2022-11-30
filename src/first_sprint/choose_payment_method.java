package first_sprint;

import java.util.Scanner;

public class choose_payment_method {
	
	public choose_payment_method(String amount,Client client) {
		
		System.out.println("Choose method for payment : ");
		System.out.println("1. Cash");
		System.out.println("2. Cridit Card");
		System.out.println("3. Wallet Balance");
		Scanner input=new Scanner(System.in);
		String option = input.nextLine();
		
		payment_method pm;
		
		if(option.equals("1"))
		{
			pm = new pay_cash(amount);
			pm.performpay();
		}
		else if(option.equals("2"))
		{
			pm = new pay_with_card(amount);
			pm.performpay();
		}
		else if(option.equals("3"))
		{
			pm = new pay_with_wallet(amount,client);
			pm.performpay();
		}
	};
	

}
