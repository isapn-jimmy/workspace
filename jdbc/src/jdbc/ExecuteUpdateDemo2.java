package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo2 {

	public static void main(String[] args) {
		//sql
		String sql="CREATE TABLE  Errrr"
				+ "( id int primary key not null, "
				+ "	username nvarchar(30) NOT NULL, "
				+ "	pwd nvarchar(30) NOT NULL"
				+ ")";//SSMS直接建立
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try(Connection conn = connectionFactory.getConnection()){
			Statement stmt = conn.createStatement();
			int updateCount = stmt.executeUpdate(sql);
			System.out.println("新增了"+updateCount+"筆資料");	
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
