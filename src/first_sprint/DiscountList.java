package first_sprint;

import java.util.ArrayList;
import java.util.HashMap;

import order.DiscountCondition;

public class DiscountList {
	
	private static DiscountList instance = new DiscountList();
	
	private static HashMap<String, Double> discountList = new HashMap<>();

	private DiscountList() {}

	public static  DiscountList getInstance() {
		return instance;
	}

	public HashMap<String, Double> getDiscountList() {
		return discountList;
	}
	
	public void addDiscount(String serviceName, double discount) {
		discountList.put(serviceName, discount);
	}

}
