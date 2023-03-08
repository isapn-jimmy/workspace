<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Using JavaBeans with JSP</title>
</head>
<body>
<h3>Using JavaBeans with JSP</h3>
<jsp:useBean id="stringBean" class="com.lcpan.bean.StringBean"/>
<ol>
<li><jsp:setProperty name="stringBean" property="message" value="this is a test"/>
setProperty:<br>
<i><jsp:getProperty property="message" name="stringBean"/></i>
<li><%stringBean.setMessage("123"); %>
scriptlet:<br>
<i><%=stringBean.getMessage() %></i>
</ol>



</body>
</html>