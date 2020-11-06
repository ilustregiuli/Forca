package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConectorDB {
	
	// method for create connection
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/forca?serverTimezone=UTC", "Programador", "654321");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	// method for close connection
	public void CloseConnection(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
