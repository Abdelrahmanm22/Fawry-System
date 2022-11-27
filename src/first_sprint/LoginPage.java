package first_sprint;

import java.io.IOException;
import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		User user;
		
		while(true) {
			System.out.println(" if you want to sign in please enter 1 or if u have an account already enter 0 ");
			Scanner input=new Scanner(System.in);
			Boolean ok;
			ok=input.nextBoolean();
			if(ok) {
			         System.out.println("Email:");
			
			         String email = scanner.nextLine();
			
			         System.out.println("Password:");
			
			         String password = scanner.nextLine();
			
			         Login login = new Login(email, password);
			
		     if(login.verify()) {
		    	 
				 user = login.userLogin();
				
				 System.out.println(user.toString());
				
				 System.out.println("Welcome back!");
			}
		
			else
				System.out.println("Email or password is incorrect");
			}
			else { System.out.println("Email:");
			
			      String email = scanner.nextLine();
			
			      System.out.println("Password:");
			
			      String password = scanner.nextLine();
			
			      System.out.println("User name:");
			
			      String uname = scanner.nextLine();
			
			      Register r=new Register(email,password,uname);
			
			      r.register();
			}
		}
	}
}
