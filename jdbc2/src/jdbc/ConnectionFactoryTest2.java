package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;


public class ConnectionFactoryTest2 {
	public static void main(String[] args) {

		ConnectionFactory connF = new ConnectionFactory();
				
		String sql = "SELECT [EmployeeID],[Lastname],[Firstname]"+"FROM [dbo].[Employees]";//SSMS直接建立

		/*******/
		try (Connection conn = connF.getConnection()) {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			//
			ResultSet rs = stmt.executeQuery(sql);
//			rs.next(); //移至下一行     
//			System.out.printf("%3S  %10S  %10S %n",rs.getString(1),rs.getString(2), rs.getString(3));
//			/*******/
			//while一開始在第0行，沒有值就跳過
			while (rs.next()) {
				System.out.printf("%3S  %10S  %10S %n",rs.getString(1),rs.getString(2), rs.getString(3));
			}
			rs.first();//移至第一行
			System.out.printf("%3S  %10S  %10S %n",rs.getString(1),rs.getString(2), rs.getString(3));
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
