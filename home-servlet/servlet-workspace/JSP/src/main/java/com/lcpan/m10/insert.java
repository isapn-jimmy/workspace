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

@WebServlet("/insert")
public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String DB_URL="jdbc:sqlserver://localhost:1433;databasename=jdbc;encrypt=false";
	String USER="sa1";
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

		
		String sql = "insert into [employee] (empno,ename,hiredate,salary,deptno,title) values(?,?,?,?,?,?) ";
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,USER,PASSWARD);
			PreparedStatement stmt = conn.prepareStatement(sql);
			   stmt.setString(1, empno);
		        stmt.setString(2, ename);
		        stmt.setString(3, hiredate);
		        stmt.setString(4, salary);
		        stmt.setString(5, deptno);
		        stmt.setString(6, title);

		        int updateCount = stmt.executeUpdate();
		        if(updateCount>0) {
		        	EmpBean emp= new EmpBean();
		        	emp.setEmpno(empno);
		        	emp.setEmpno(ename);
		        	emp.setEmpno(hiredate);
		        	emp.setEmpno(salary);
		        	emp.setEmpno(deptno);
		        	emp.setEmpno(title);
					request.setAttribute("emp", emp);
					request.getRequestDispatcher("/m10/insert.jsp").forward(request, response);
		        }
				
		        stmt.close();
		        conn.close();

		        response.setContentType("text/html; charset=UTF-8");
		        response.getWriter().write("新增成功！");
		

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
