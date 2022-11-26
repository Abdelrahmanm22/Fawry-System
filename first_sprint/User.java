package first_sprint;

public class User {

	protected String name;
	protected int age;
	protected String email;
	protected String password;
	
	public User(String name, int age, String email, String password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
