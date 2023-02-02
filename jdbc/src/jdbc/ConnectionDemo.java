package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conn = DriverManager.getConnection(
				"jdbc" + ":sqlserver://" + "localhost:1433;databasename=Northwind;encrypt=false", "banana", "1234")) {

			System.out.println("OK");

			//conn.close(); //可寫可不寫，會自動幫忙關

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
