package collections;

public class User {
	public int id;
	public String userName;
	public double phone;
	public User(int id, String userName, double phone) {
		this.id = id;
		this.userName = userName;
		this.phone = phone;
	}
	
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", phone=" + phone + "]";
	}
	
	

}
