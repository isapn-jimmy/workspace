package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) {

		ConnectionFactory connF = new ConnectionFactory();

		String sql = "SELECT [EmployeeID]" + "      ,[LastName]" + "      ,[FirstName]" + "      ,[Title]"
				+ "      ,[TitleOfCourtesy]" + "      ,[BirthDate]" + "      ,[HireDate]" + "      ,[Address]"
				+ "      ,[City]" + "      ,[Region]" + "      ,[PostalCode]" + "      ,[Country]"
				+ "      ,[HomePhone]" + "      ,[Extension]" + "      ,[Photo]" + "      ,[Notes]"
				+ "      ,[ReportsTo]" + "      ,[PhotoPath]" + "  FROM [dbo].[Employees]";

		/*******/
		try (Connection conn = connF.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			/*******/
			while (rs.next()) {
				System.out.println(rs.getString(2));
			}
			System.out.println("OK");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
