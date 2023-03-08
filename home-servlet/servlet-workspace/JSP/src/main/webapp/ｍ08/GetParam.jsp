<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
<%request.setCharacterEncoding("UTF-8");
String attName = request.getParameter("attrName");
if (attName != null && attName.length() > 0) {
	String attValue = request.getParameter("attrValue");
	session.setAttribute(attName, attValue);
}
Date created = new Date(session.getCreationTime());
Date accessed = new Date(session.getLastAccessedTime());
%>
ID:<%=session.getId() %><br>
Created :<%=created %><br>
Last Accessed :<%=accessed %><br>
<%Enumeration<String> names = session.getAttributeNames();
while (names.hasMoreElements()) {
	String name = names.nextElement();
	String value = session.getAttribute(name).toString();
	%>
	<%=name%>=<%=value%><br>
<%}%>


	

</body>
</html>