package jdbc;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo3 {
	public static void main(String[] args) {
		String sql = "SELECT *" + " FROM [Northwind].[dbo].[Employees]";//SSMS直接建立
		ConnectionFactory connectionFactory = new ConnectionFactory();//創建連線
		try (Connection conn = connectionFactory.getConnection()) { //取得連線
			Statement stmt = conn.createStatement();//建立敘述，也就是創建SQL語句，而在課堂上的SQL語句是字串
			boolean execute = stmt.execute(sql);//回傳true or false
			System.out.print("是否有ResultSet:" + execute);
			ResultSet rs = stmt.getResultSet();
			if(execute) {
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
		} else {
			int updateCount = stmt.getUpdateCount();//如果沒有找到Firstname的話，會直接把把我們查詢到的Firstname Nancy ... Angel直接放入Errrr table裡面 
			System.out.println("新增了"+updateCount+"筆");
		}
		}
			catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
