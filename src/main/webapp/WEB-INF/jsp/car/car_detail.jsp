<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="CSS/style.css">
<title>car_xiangxi page</title>
</head>
<%!String sql;
	String code, userName;
	String username, login;
	int num;%>

<body bgcolor="#ffffff">
	<%
		login = (String) session.getAttribute("login");
		Customer customer = (Customer) session.getAttribute("customer");
		if (customer == null || username == null || login == null) {
			
	%>
	<%
		}
		username = customer.getName();
	%>
	<jsp:include page="../top.jsp" />
	<table width="785" height="480" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td width="100%" height="52" colspan="4" align="center">������Ϣչʾ</td>
		</tr>
		<%
			CarMessage carMessage = (CarMessage) session.getAttribute("carMessage");
			if (carMessage != null) {
		%>
		<tr>
			<td width="17%" height="29" align="center">���ƺ�</td>
			<td width="36%" height="29" align="center"><%=carMessage.getLicencenumber()%></td>
			<td width="17%" height="29" align="center" valign="middle">��Ʒ��</td>
			<td width="30%" height="29" align="center"><%=carMessage.getBrand()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">��������</td>
			<td width="36%" height="29" align="center"><%=carMessage.getStyle()%>
			</td>
			<td width="17%" height="29" align="center" valign="middle">��������</td>
			<td width="30%" height="29" align="center"><%=carMessage.getCarload()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">ʹ��ʱ��</td>
			<td width="36%" height="29" align="center"><%=carMessage.getUsedtime()%></td>
			<td width="17%" height="29" align="center" valign="middle">��ʻԱ����</td>
			<td width="30%" height="29" align="center"><%=carMessage.getDrivername()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">��ʻʱ��</td>
			<td width="36%" height="29" align="center"><%=carMessage.getDrivertime()%></td>
			<td width="17%" height="29" align="center" valign="middle">���պ���</td>
			<td width="30%" height="29" align="center"><%=carMessage.getLicencenumber()%></td>
		</tr>
		<tr>
			<td width="17%" height="30" align="center">��������</td>
			<td width="36%" height="30" align="center"><%=carMessage.getLicencestyle()%></td>
			<td width="17%" height="30" align="center" valign="middle">��������</td>
			<td width="30%" height="30" align="center"><%=carMessage.getTransportstyle()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">��ϵ��</td>
			<td width="36%" height="29" align="center"><%=carMessage.getLinkman()%></td>
			<td width="17%" height="29" align="center" valign="middle">��ϵ�绰</td>
			<td width="30%" height="29" align="center"><%=carMessage.getLinkphone()%>
			</td>
		</tr>
		<tr>
			<td width="17%" height="31" align="center">����ʱ�䣺</td>
			<td width="36%" height="31" align="left" colspan="3"><%=carMessage.getIssuedate()%></td>

		</tr>
		<tr>
			<td width="17%" height="1" align="center">��ע��</td>
			<td width="83%" height="1" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=carMessage.getRemark()%></textarea>
			</td>
		</tr>

		<tr>
			<%
				userName = customer.getName();
			%>
			<td width="17%" height="31" align="center">�����ˣ�</td>
			<td width="36%" height="31" align="left" colspan="3"><%=userName%></td>

		</tr>
		<%
			if (userName.equals(username) || "2".equals(customer.getPow())) {
		%>
		<tr>
			<td width="100%" height="45" colspan="4" align="center"><a
				href="carChange?id=<%=carMessage.getCode()%>">�޸�</a>&nbsp;&nbsp; <a
				href="carDelete?id=<%=carMessage.getCode()%>">ɾ��</a></td>
		</tr>

		<%
			}
		}
		%>
	</table>
</body>
</html>
