package first_sprint;

import java.io.File;
import java.io.IOException;

import order.BaseReciept;
import order.Discount;
import order.Order;
public class pay_with_wallet extends payment_method {
	
	File textFile = new File("Users.txt");
	public pay_with_wallet(BaseReciept reciept ,Client creator) {
		super(reciept, creator);
		this.creator=creator;
	}

	@Override
	public void performpay() {
		double x =creator.getWalletBalance();
//		this.creator.walletBalance -= Double.valueOf(reciept.getOrderDetails().getServiceePrice());
		String y;
		String serviceName = reciept.getOrderDetails().getServiceName();
		if(discountList.getDiscountList().containsKey("all")) {
		
			double discountValue = 0.0;
			if(discountList.getDiscountList().containsKey("first time") && creator.ordersList.size()==0) {
				discountValue += discountList.getDiscountList().get("first time");
			}
			discountValue += discountList.getDiscountList().get("all");
			reciept = new Discount(reciept, discountValue);
			this.creator.walletBalance -= Double.valueOf(reciept.getOrderDetails().getServiceePrice());
			y =  creator.getWalletBalance()+"";
			System.out.println("Successfully pay with card "+reciept.getOrderDetails().getServiceePrice());
		}
		
		else if(discountList.getDiscountList().containsKey(serviceName)) {
		
			double discountValue = 0.0;
			if(discountList.getDiscountList().containsKey("first time") && creator.ordersList.size()==0) {
				discountValue += discountList.getDiscountList().get("first time");
			}
			discountValue += discountList.getDiscountList().get(serviceName);
			reciept = new Discount(reciept, discountValue);
			System.out.println("Successfully pay with card "+reciept.getOrderDetails().getServiceePrice());
		}
		else if(discountList.getDiscountList().containsKey("first time") && creator.ordersList.size()==0) {
			
			double discountValue = discountList.getDiscountList().get("first time");
			reciept = new Discount(reciept, discountValue);
			System.out.println("Successfully pay with card "+reciept.getOrderDetails().getServiceePrice());
		}
		else
			System.out.println("Successfully pay with card "+reciept.getOrderDetails().getServiceePrice());
//		try {
//            String data = FileUtils.readFileToString(textFile);
//            data = data.replace(x, y);
//            FileUtils.writeStringToFile(textFile, data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
		
		
	}

}

//
//import java.io.File;
//import java.io.IOException;
// 
//import org.apache.commons.io.FileUtils;
// 
//public class Example {
//    /**
//     * An example program to replace a string in text file
//     */
//    public static void main(String[] args) {
//        
//        
//    }
// 
//}