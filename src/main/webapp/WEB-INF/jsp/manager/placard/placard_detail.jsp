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
			<td width="100%" height="39" align="center">����</td>
		</tr>
		<%
			Placard placard = (Placard) session.getAttribute("placard");
			if (placard != null) {
		%>
		<tr>
			<td width="100%" height="37">���⣺ <%=placard.getTitle()%></td>
		</tr>
		<tr>
			<td width="100%" height="36"><textarea rows="20" name="content"
					cols="100">
   <%=placard.getContent()%></textarea></td>
		</tr>
		<tr>
			<td width="100%" height="27">������: <%=placard.getAuthor()%></td>
		</tr>
		<tr>
			<td width="100%" height="27">����ʱ��: <%=placard.getIssuedate()%></td>
		</tr>
		<tr>
			<td width="100%" height="27">���º�: <%=placard.getId()%></td>
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
