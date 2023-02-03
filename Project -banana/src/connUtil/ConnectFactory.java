package connUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectFactory {
	String url = "jdbc:sqlserver://localhost:1433;databasename=MyTest;encrypt=false";
	String username ="banana";
	String pwd ="1234";

	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username,pwd);
	}
	
}
