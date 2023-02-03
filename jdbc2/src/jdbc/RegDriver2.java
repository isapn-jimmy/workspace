package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("jdbc.drivers", "com.microsoft.sqlserver."+"jdbc.SQLServerDriver");
	try { // 有實質性的註冊, ex : 下面有兩個就是實質性的有註冊兩個
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   //自動註冊
	Enumeration<Driver> drivers = DriverManager.getDrivers()	;
	Iterator<Driver> asIterator = drivers.asIterator();
	asIterator.forEachRemaining(System.out :: println);
    
	}

}
