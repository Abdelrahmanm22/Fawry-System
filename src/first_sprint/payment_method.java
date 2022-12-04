package first_sprint;

import order.BaseReciept;
import order.Order;

public abstract class payment_method {
	
	//double amount;
	BaseReciept reciept;
	DiscountList discountList= DiscountList.getInstance();
	protected Client creator;
	payment_method(BaseReciept reciept, Client creator){
		this.reciept = reciept;
		this.creator = creator;
	}
	
	
	public abstract String performpay();
	

}
