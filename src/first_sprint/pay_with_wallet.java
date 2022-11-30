package first_sprint;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
public class pay_with_wallet extends payment_method {
	
	File textFile = new File("Users.txt");
	public pay_with_wallet(String amount ,Client creator) {
		super(amount);
		this.creator=creator;
	}

	@Override
	public void performpay() {
		String x =creator.getWalletBalance()+"";
		this.creator.walletBalance -= amount;
		String y =  creator.getWalletBalance()+"";
		try {
            String data = FileUtils.readFileToString(textFile);
            data = data.replace(x, y);
            FileUtils.writeStringToFile(textFile, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
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