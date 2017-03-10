<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>enterprise page</title>
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
	<%
		if (customer != null && "2".equals(customer.getPow())) {
	%>
	<jsp:include page="../manager/mtop.jsp" flush="true"></jsp:include>
	<%
		}else {
	%>
	<jsp:include page="../top.jsp" flush="true"></jsp:include>
	<%
	}
	%>
	<table width="785" height="480" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td width="100%" height="52" colspan="4" align="center">企业信息展示</td>
		</tr>
		<%
			Enterprise enterprise = (Enterprise) session.getAttribute("enterprise");
			if (enterprise != null) {
		%>
		<tr>
			<td width="17%" height="29" align="center">企业类型</td>
			<td width="36%" height="29" align="center"><%=enterprise.getEnterprisesort()%></td>
			<td width="17%" height="29" align="center" valign="middle">企业名称</td>
			<td width="30%" height="29" align="center"><%=enterprise.getEnterprisename()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">经营范围</td>
			<td width="36%" height="29" align="center"><%=enterprise.getOperation()%>
			</td>
			<td width="17%" height="29" align="center" valign="middle">所属区域</td>
			<td width="30%" height="29" align="center"><%=enterprise.getWorkarea()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">企业地址</td>
			<td width="36%" height="29" align="center"><%=enterprise.getAddress()%></td>
			<td width="17%" height="29" align="center" valign="middle">联系电话</td>
			<td width="30%" height="29" align="center"><%=enterprise.getPhone()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">联系人</td>
			<td width="36%" height="29" align="center"><%=enterprise.getLinkman()%></td>
			<td width="17%" height="29" align="center" valign="middle">手机号</td>
			<td width="30%" height="29" align="center"><%=enterprise.getHandset()%></td>
		</tr>
		<tr>
			<td width="17%" height="30" align="center">传真号</td>
			<td width="36%" height="30" align="center"><%=enterprise.getFax()%></td>
			<td width="17%" height="30" align="center" valign="middle">电子邮箱</td>
			<td width="30%" height="30" align="center"><%=enterprise.getEmail()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">企业网址</td>
			<td width="36%" height="29" align="center"><%=enterprise.getHttp()%></td>
			<td width="17%" height="29" align="center" valign="middle">类型介绍</td>
			<td width="30%" height="29" align="center"><%=enterprise.getIntro()%>
			</td>
		</tr>
		<tr>
			<td width="17%" height="31" align="center">发布时间：</td>
			<td width="36%" height="31" align="left"><%=enterprise.getIssuedate()%></td>
			<%
				userName = enterprise.getUsername();
			%>
			<td width="17%" height="31" align="center">发布人：</td>
			<td width="30%" height="31" align="left"><%=userName%></td>
		</tr>

		<%
			if (userName.equals(username) || "2".equals(customer.getPow())) {
		%>
		<tr>
			<td width="100%" height="45" colspan="4" align="center"><a
				href="enterpriseChange?id=<%=enterprise.getId()%>">修改</a>
				&nbsp;&nbsp;<a
				href="enterpriseDelete?id=<%=enterprise.getId()%>">删除</a></td>
		</tr>

		<%
			}
			}
		%>
	</table>
</body>
</html>
