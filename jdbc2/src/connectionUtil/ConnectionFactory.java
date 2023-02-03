package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private final static String url ="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
	private static final String user = "banana";
	final private static String pwd = "1234";
			
	public Connection getConnection() throws SQLException {//static or non-static都可以
		
			return DriverManager.getConnection(url,user,pwd);
		
	}
}
