package javaSwing;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/testdb";
			String user = "root";
			String password = "root";
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e){
			e.printStackTrace();
			}
		return conn;
	}

}
