<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Using javaBeans with JSP</h3>
<jsp:useBean id="stringBean" class="com.lcpan.bean.StringBean" />
<ol>
<li><jsp:setProperty name="stringBean" property="message" value="This is a test"/> 
	Set and get property with jsp:setProperty: <br>
	<i><jsp:getProperty name="stringBean" property="message" /></i>
<li><% stringBean.setMessage("Learning "); %>
Set and get property with scriptlet:<br>
<i><%= stringBean.getMessage() %></i>

</ol>
</body>
</html>