package application.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	public Connection connection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/ankieta?useSSL=false","root","0rozala10");
		
	}

}
