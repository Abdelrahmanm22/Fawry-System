package first_sprint;

import java.util.Scanner;

public class AdminPage {

	public AdminPage(Admin admin) {
		DiscountList discountsList = DiscountList.getInstance();
		while(true) {
			
			System.out.println("Enter the number of Service:");
			System.out.println("1. Add Discount");
			System.out.println("2. Remove Discount");
			System.out.println("3. Review Refund Requests");
			System.out.println("$. Logout");
			
			Scanner input = new Scanner(System.in);
			String option = input.nextLine();
			double discount;
			if (option.equals("1")) {
				System.out.println("Enter the number of Service:");

				System.out.println("1. Mobile Recharge");
				System.out.println("2. Internet payment");
				System.out.println("3. Landline");
				System.out.println("4. All services");
				System.out.println("5. First Purchase");
				option = input.nextLine();
				System.out.println("Enter the percentage of the discount:");
				discount = input.nextDouble()/100;
				if (option.equals("1")) {
					discountsList.addDiscount("mobile recharge", discount);
				}
				else if (option.equals("2")) {
					discountsList.addDiscount("internet payment", discount);
				}
				else if (option.equals("3")) {
					discountsList.addDiscount("landline", discount);
				}
				else if (option.equals("4")) {
					discountsList.addDiscount("all", discount);
				}
				else if (option.equals("5")) {
					discountsList.addDiscount("first time", discount);
				}

			}
			else if (option.equals("2")) {
				System.out.println("Enter the number of Service:");

				System.out.println("1. Mobile Recharge");
				System.out.println("2. Internet payment");
				System.out.println("3. Landline");
				System.out.println("4. All services");
				
				option = input.nextLine();
				if (option.equals("1")) {
					discountsList.getDiscountList().remove("mobile recharge");
				}
				else if (option.equals("2")) {
					discountsList.getDiscountList().remove("internet payment");
				}
				else if (option.equals("3")) {
					discountsList.getDiscountList().remove("landline");
				}
				else if (option.equals("4")) {
					discountsList.getDiscountList().remove("all");
				}
				
			}
			else if (option.equals("3")) {
				
			}
			else if (option.equals("$")) {
				break;
			}

		}
	}
}
