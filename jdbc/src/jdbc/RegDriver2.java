package jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Iterator;

public class RegDriver2 {

	public static void main(String[] args) {
//		System.setProperty("jdbc.drivers", "com.microsoft.sqlserver." + "jdbc.SQLServerDriver");
		try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		Iterator<Driver> asIterator = drivers.asIterator();
		asIterator.forEachRemaining(System.out::println);

		
		
		
		
		
		
		
		
		
		
		
		
		
		//yyeee2
//		Thread t = new Thread(() -> {
//			for (int i = 0; i < 500; i++) {
//				System.out.println("yee");
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 500; i++) {
//					System.out.println("yee");
//				}
//			}
//		});
		
//		t.start();
//		for (int i = 0; i < 500; i++) {
//			System.out.println("yee2");
//		}

	}

}
