<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.List,com.logistics.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<CarMessage> carMsgList = (List<CarMessage>) session.getAttribute("carMsgList");
		if (carMsgList!=null&&carMsgList.size() != 0) {
			for (CarMessage carMsg : carMsgList) {
	%>
	<table width="370" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="36" height="25">&nbsp;</td>
			<td width="334"><a href="carDetail?id=<%=carMsg.getCode()%>"> <%=carMsg.getLicencenumber()%>-
					-<%=carMsg.getLicencestyle()%>- -<%=carMsg.getStyle()%>-
					-<%=carMsg.getCarload()%>- -<%=carMsg.getTransportstyle()%></a></td>
		</tr>
		<%
			   }
			}
		%>
		<tr>
			<td width="36" height="25">&nbsp;</td>
			<td width="334" align="right"><a href="">&nbsp;>>>更多信息&nbsp;&nbsp;&nbsp;</a></td>
		</tr>
	</table>
</body>
</html>