package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;


public class ConnectionFactoryTest3 {
	public static void main(String[] args) {

		ConnectionFactory connF = new ConnectionFactory();
		String lastname = JOptionPane.showInputDialog("Lastname");
		String firstname = JOptionPane.showInputDialog("Firstname");
		String sql = "SELECT [EmployeeID],[Lastname],[Firstname]"+"FROM [dbo].[Employees] where Lastname= ?  and Firstname = ?";//SSMS直接建立
		System.out.println(sql);
		/*******/
		try (Connection conn = connF.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,lastname);
			pstmt.setString(2,firstname);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("%3S  %10S  %10S %n",rs.getString(1),rs.getString(2), rs.getString(3));
				
			}
			System.out.println("OK");
		}
			catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
