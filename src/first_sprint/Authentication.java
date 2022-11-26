package first_sprint;

import java.util.ArrayList;

public class Authentication {
	
	protected Database database;
	
	
	
	public ArrayList<User> getUsers(){
		database = Database.getInstance();
		ArrayList<User> users = new ArrayList<>();
		String arr[] = database.getLine().split("\\\\");
		for(String user: arr) {
			String userData[] = user.split(",");
			users.add(new Client(userData[2], Integer.valueOf(userData[3]), userData[0], userData[1], Double.valueOf(userData[4])));
		}
		return users;
	}
}
