package first_sprint;

public class Admin extends User{

	private int adminId;

	public Admin(String name, int age, String email, String password, int adminId) {
		super(name, age, email, password);
		this.adminId = adminId;
	}

	public int getAdminId() {
		return adminId;
	}
	
	public void addService() {
		
	}
	
	public void addDiscount() {
		
	}
	
	public void showRefunds() {
		
	}
}
