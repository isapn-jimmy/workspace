package com.lcpan.m10;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcpan.bean.EmpBean;

/**
 * Servlet implementation class GetUserName
 */
@WebServlet("/GetEmp")
public class GetEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String DB_URL ="jdbc:sqlserver://localhost:1433;databasename=jdbc;encrypt=false";
	private String USER = "sa";
	private String PASSWORD = "123";
    Connection conn;   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno = request.getParameter("empno");
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			PreparedStatement stmt = conn.prepareStatement("select * from employee where empno = ? ");
			stmt.setString(1, empno);
			ResultSet rs = stmt.executeQuery();
			EmpBean emp = new EmpBean();
			if (rs.next()) {
				
				emp.setEmpno(rs.getString("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSalary(rs.getString("salary"));
				emp.setDeptno(rs.getString("deptno"));
				emp.setTitle(rs.getString("title"));


			}
			request.setAttribute("emp", emp);
			stmt.close();
			request.getRequestDispatcher("/m10/GetEmp.jsp")
			.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
