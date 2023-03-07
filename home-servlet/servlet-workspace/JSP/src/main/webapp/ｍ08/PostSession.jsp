<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Session資訊</h2>
    <%request.setCharacterEncoding("UTF-8");//對照Servlet，m07，seesionifo.java。我輸入的時候有亂碼轉成中文
    String attName = request.getParameter("attrName");//有些東西不用寫像是sessoin、out因為預設有了所以不用寫
    if (attName != null && attName.length() > 0) {
		String attValue = request.getParameter("attrValue");
		session.setAttribute(attName, attValue);
	}
    Date created = new Date(session.getCreationTime());
	Date accessed = new Date(session.getLastAccessedTime());
    %>
	<h2>Session資訊</h2> 
	ID : <%= session.getId()%>"<br>
	Created :<%= created %>"<br>
	Last Accessed :<%= accessed %>"<br>
	<%	Enumeration<String> names = session.getAttributeNames();
		while (names.hasMoreElements()){
		String name = names.nextElement();
		String value = session.getAttribute(name).toString();
	%>
	<%= name %>=<%=value %><br>
	<% } %>
	 
</body>
</html>