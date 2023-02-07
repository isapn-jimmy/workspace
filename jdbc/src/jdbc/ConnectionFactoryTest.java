package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;


public class ConnectionFactoryTest {
	public static void main(String[] args) {

		ConnectionFactory connF = new ConnectionFactory();
		
		String lastname = JOptionPane.showInputDialog("Lastname");
		String firstname = JOptionPane.showInputDialog("Firstname");
		
		String sql = "SELECT [EmployeeID]" + "      ,[LastName]" + "      ,[FirstName]" + "      ,[Title]"
				+ "      ,[TitleOfCourtesy]" + "      ,[BirthDate]" + "      ,[HireDate]" + "      ,[Address]"
				+ "      ,[City]" + "      ,[Region]" + "      ,[PostalCode]" + "      ,[Country]"
				+ "      ,[HomePhone]" + "      ,[Extension]" + "      ,[Photo]" + "      ,[Notes]"
				+ "      ,[ReportsTo]" + "      ,[PhotoPath]" + "  FROM [dbo].[Employees] where Lastname= '"+lastname+"' and FirstName = '"+firstname+"'" ;
		

		/*******/
		try (Connection conn = connF.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			/*******/
			while (rs.next()) {
				System.out.println(rs.getString(2)+ rs.getString(3));
			}
			System.out.println("OK");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
