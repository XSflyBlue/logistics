<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>Manager_index page</title>
</head>
<body bgcolor="#ffffff">
	<%
		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null || "1".equals(customer.getPow())) {
	%>
	<jsp:include page="../top.jsp" flush="true"></jsp:include>
	<%
		}
	%>
	<jsp:include page="mtop.jsp" flush="true"></jsp:include>

	<table width="100%" height="31" border="0" cellpadding="0"
		cellspacing="0" background="image/bg-8.jpg">
		<tr>
			<td><div align="center">
					<img src="image/bg-7.jpg" width="793" height="493">
				</div></td>
		</tr>
	</table>
</body>
</html>
