package first_sprint;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user;
		
		while(true) {
			
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
	}
}
