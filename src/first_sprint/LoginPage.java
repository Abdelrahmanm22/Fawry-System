package first_sprint;

import java.io.IOException;
import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		User user;
		
		while(true) {
			System.out.print("If you want to sign up please enter 1 or if u have an account already enter 0: ");
			Scanner input=new Scanner(System.in);
			String ok;
			ok=input.nextLine();
			if(ok.equals("0")) {
				System.out.println("Email:");
			    String email = scanner.nextLine();
			    System.out.println("Password:");
			    String password = scanner.nextLine();			
			    Login login = new Login(email, password);
		     if(login.verify()) {
		    	 user = login.userLogin();
		    	 Client c = (Client) user;
		    	 System.out.println(c.toString());
		    	 System.out.println("Welcome back!");
		    	 //Services services = user.fawryPayment("Internet");
		    	 
		    	 new chooseservices((Client)user);
		     }else
				System.out.println("Email or password is incorrect");
			}
			else if(ok.equals("1")){
				System.out.println("Email:");
			
			    String email = scanner.nextLine();
			
			    System.out.println("Password:");
			
			    String password = scanner.nextLine();
			
			    System.out.println("User name:");
			
			    String uname = scanner.nextLine();
			
			    Register r=new Register(email,password,uname);
			
			    r.register();
			}else {
				System.out.println("Please Run Again And enter 0 or 1");
			}
		}
	}
}
