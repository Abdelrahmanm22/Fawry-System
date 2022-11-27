package first_sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

	private static Database instance = new Database();
	private Scanner scanner;
	private static File file = new File("D:\\F  C  I\\Fawry_System\\Users.txt");
	
	private Database() {
	}

	
	public ArrayList<User> getUsers() {
		ArrayList<User> users = new ArrayList<>();
		try {
		      	scanner = new Scanner(file);
		      	while (scanner.hasNextLine()) {
		            String data = scanner.nextLine();
		            String userData[] = data.split("\\s");
		            if(Boolean.valueOf(userData[1]))
		            	users.add(new Client(userData[0], Boolean.valueOf(userData[1]), userData[2], userData[3], Double.valueOf(userData[4])));
		            else
		            	users.add(new Admin(userData[0], Boolean.valueOf(userData[1]), userData[2], userData[3], userData[4]));
		            //System.out.println(data);
		          }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return users;
	}
	
	public static Database getInstance() {
		return instance;
	}
}