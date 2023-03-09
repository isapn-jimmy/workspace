<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>員工資料</title>
</head>
<body style="background-color:#fdf5e6">
<div align="center">
<h2>刪除員工資料</h2>
<jsp:useBean id="emp" scope="request" class="com.lcpan.bean.EmpBean"/>
<table>
<tr><td>員工編號<td><input type="text" disabled value="<%=request.getParameter("empno")%>">
<!-- 直接接住html的request -->
<tr><td>結果是<td><input type="text" disabled value="<%= request.getAttribute("result") %>">

</table>
</div>
</body>
</html>