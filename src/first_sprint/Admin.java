package first_sprint;

public class Admin extends User{

	private String adminId;

	public Admin(String email, String type, String password, String username, String adminId) {
		super(email, type, password, username);
		this.adminId = adminId;
	}

	public String getAdminId() {
		return adminId;
	}
	
	public void addService() {
		
	}
	
	public void addDiscount() {
		
	}
	
	public void showRefunds() {
		
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", type=" + type + "]";
	}
	
	
}
