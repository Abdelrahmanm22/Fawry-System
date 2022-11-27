package first_sprint;

public class User {

	protected String username;
	protected String email;
	protected String password;
	protected boolean type;
	
	public User(String email, boolean type, String password, String username) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public String getUserame() {
		return username;
	}


	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [name=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
