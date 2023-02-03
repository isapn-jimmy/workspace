package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;

public class ConnFactoryTest2 {

	public static void main(String[] args) {
		ConnectionFactory connF = new ConnectionFactory();
		String sql="SELECT [EmployeeID],[LastName],[FirstName]"
				+ "  FROM [dbo].[Employees] ";
		try (Connection conn = connF.getConnection()) {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			//rs
			ResultSet rs = stmt.executeQuery(sql);
//			rs.next();//=>移至下一行
//			System.out.printf("%3s  %10s %10s %n",rs.getString(1),rs.getString(2),rs.getString(3));
			//第0行開始
			while(rs.next()) {
				System.out.printf("%3s  %10s %10s %n",rs.getString(1),rs.getString(2),rs.getString(3));
			}
			rs.first();
			System.out.printf("%3s  %10s %10s %n",rs.getString(1),rs.getString(2),rs.getString(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
