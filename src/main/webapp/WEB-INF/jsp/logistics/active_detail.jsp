<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.util.List,com.logistics.model.*" errorPage=""%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="CSS/style.css">
<title></title>
</head>

<body>
	<table width="100%" height="444" border="1" cellpadding="0"
		cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
		bordercolorlight="#FFFFFF">
		<tr>
			<td width="100%" height="39" align="center">��̬��Ϣ</td>
		</tr>
		<%
			Logistics logistics = (Logistics) session.getAttribute("logistics");
			if (logistics != null) {
		%>
		<tr>
			<td width="100%" height="37">���⣺ <%=logistics.getTitle()%></td>
		</tr>
		<tr>
			<td width="100%" height="36"><textarea rows="20" name="content"
					cols="100">
   <%=logistics.getContent()%></textarea></td>
		</tr>
		<tr>
			<td width="100%" height="27">������: <%=logistics.getAuthor()%></td>
		</tr>
		<tr>
			<td width="100%" height="27">����ʱ��: <%=logistics.getIssuedate()%></td>
		</tr>
		<tr>
			<td width="100%" height="27">���º�: <%=logistics.getId()%></td>
		</tr>
		<%
			}
		%>
		<tr>
			<td width="100%" height="20" align="center"><input type="button"
				onClick="window.close()" value="�رմ���"></td>
		</tr>
	</table>
</body>
</html>
