package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnFactoryTest3 {

	public static void main(String[] args) {
		ConnectionFactory connF = new ConnectionFactory();
		String lastName=JOptionPane.showInputDialog("LastName");
		String firstName=JOptionPane.showInputDialog("FirstName");
		/*****///read查詢
		String sql="SELECT [EmployeeID],[LastName],[FirstName]"
				+ "  FROM [dbo].[Employees] where Lastname= ? and FirstName = ?";
		System.out.println(sql);
		/*****/
		try (Connection conn = connF.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			
			

			System.out.println("OK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
