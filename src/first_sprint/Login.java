package first_sprint;

public class Login extends Authentication{
	
	private String email;
	private String password;
	
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public User userLogin() {
		for(User user: database.getUsers()) {
			if(user.getEmail().equals(email))
				return user;
		}
		return null;
		
	}
	
	public boolean verify() {
		for(User user :database.getUsers()) {
			if(user.getEmail().equals(email)) {
				System.out.println(user.toString());
				if(user.getPassword().equals(password)) {
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}

}
