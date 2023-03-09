package com.lcpan.m10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcpan.bean.EmpBean;

@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String DB_URL="jdbc:sqlserver://localhost:1433;databasename=jdbc;encrypt=false";
	String USER="sa";
	String PASSWARD="123";
	String SQL="select empno,ename,hiredate,salary,deptno,title from dbo.employee where empno=?";
	Connection conn;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String hiredate = request.getParameter("hiredate");
		String salary = request.getParameter("salary");
		String deptno = request.getParameter("deptno");
		String title = request.getParameter("title");

		
		String sql = "DELETE  FROM [dbo].[employee] where empno=?";
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,USER,PASSWARD);
			PreparedStatement stmt = conn.prepareStatement(sql);
			   stmt.setString(1, empno);

		        int updateCount = stmt.executeUpdate();
		        if(updateCount>0) {	  
					request.setAttribute("result", "刪除成功");
					
		        }else {
		        	request.setAttribute("result", "error");
		        }
		        stmt.close();
		        request.getRequestDispatcher("/m10/delete.jsp").forward(request, response);	

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}

		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
