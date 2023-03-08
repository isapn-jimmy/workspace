package com.lcpan.m11;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcpan.bean.EmpBean;

/**
 * Servlet implementation class GetUserName
 */
@WebServlet("/GetAllEmpsJNDI")
public class GetAllEmpsJNDI extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String DB_URL ="jdbc:sqlserver://localhost:1433;databasename=jdbc;encrypt=false";
	private String USER = "sa";
	private String PASSWORD = "123";
    Connection conn;   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);//建立連線橋，連線完之後拆掉()51行，stmt.close()，大型專案不適用，會占用很多資源，像是如果DB只能連線20人，超過100人就毀了
			PreparedStatement stmt = conn.prepareStatement("select * from dbo.employee ");//怕會毀掉，所以要記得把連線給關掉。用final or getWithResource
			ResultSet rs = stmt.executeQuery();
			List<EmpBean> emps = new ArrayList<>();
			EmpBean emp = null;
			while (rs.next()) {
				emp=new EmpBean();
				emp.setEmpno(rs.getString("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSalary(rs.getString("salary"));
				emp.setDeptno(rs.getString("deptno"));
				emp.setTitle(rs.getString("title"));
				emps.add(emp);


			}
			request.setAttribute("emps", emps);
			stmt.close();
			request.getRequestDispatcher("/m10/GetAllEmps.jsp")
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
