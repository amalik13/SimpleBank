<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%  
String id=(String) session.getValue("id");

String Balance=(String) session.getAttribute("Balance");
String name=(String)session.getAttribute("Name");
session.invalidate();

%>
<head> negative balance &#9888;</head>
<table>
<tr>
<th>Name</th>
<th>Balance</th>
</tr>
<tr>
<td><%=name%></td>
<td><%=Balance%></td>

</table>
</body>
</html>