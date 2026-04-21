package javaSwing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User  {
	public void registerUser (String username, String password) {
		String sql = "INSERT INTO user(user_name,password) values (?,?)";
		try (Connection conn = DatabaseConnection.getConnection();
		         PreparedStatement pstmt = conn.prepareStatement(sql)) {
		        
		        pstmt.setString(1, username);
		        pstmt.setString(2, password); // Note: Always hash passwords in production!
		        pstmt.executeUpdate();
		        
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	}
	public boolean checkLogin(String username, String password) {
	    String sql = "SELECT * FROM user WHERE user_name = ? AND password = ?";
	    try (Connection conn = DatabaseConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        
	        pstmt.setString(1, username);
	        pstmt.setString(2, password);
	        
	        ResultSet rs = pstmt.executeQuery();
	        return rs.next(); // Returns true if user exists
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	

}
}
