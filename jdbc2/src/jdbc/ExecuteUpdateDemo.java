package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo {
	public static void main(String[] args) {
		String sql = "insert into t2.dbo.student values" + "(?,?,?,?,?,?)";//?,?,?,?,?,? -> 代表6個欄位[s_id]
	 //     ,[sname],[major],[gender] ,[tel],[birth]
	    	      
	    	      
	    	     
	    	      
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (Connection conn = connectionFactory.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(sql); // 預先編譯 , 產生物件stmt
			stmt.setString(1,"s081");//再把傳回值放入欄位裡
			stmt.setString(2,"唉");
			stmt.setString(3,"EE");
			stmt.setString(4,"m");
			stmt.setString(5,"0987654333");
			stmt.setString(6,"1987-6-5");
			int updateCount = stmt.executeUpdate(); //執行更新
			System.out.println("新增了"+updateCount + "筆資料");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
