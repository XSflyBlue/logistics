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
			<td width="100%" height="52" colspan="4" align="center">车辆信息展示</td>
		</tr>
		<%
			CarMessage carMessage = (CarMessage) session.getAttribute("carMessage");
			if (carMessage != null) {
		%>
		<tr>
			<td width="17%" height="29" align="center">车牌号</td>
			<td width="36%" height="29" align="center"><%=carMessage.getLicencenumber()%></td>
			<td width="17%" height="29" align="center" valign="middle">车品名</td>
			<td width="30%" height="29" align="center"><%=carMessage.getBrand()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">车辆类型</td>
			<td width="36%" height="29" align="center"><%=carMessage.getStyle()%>
			</td>
			<td width="17%" height="29" align="center" valign="middle">车辆载重</td>
			<td width="30%" height="29" align="center"><%=carMessage.getCarload()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">使用时间</td>
			<td width="36%" height="29" align="center"><%=carMessage.getUsedtime()%></td>
			<td width="17%" height="29" align="center" valign="middle">驾驶员姓名</td>
			<td width="30%" height="29" align="center"><%=carMessage.getDrivername()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">驾驶时间</td>
			<td width="36%" height="29" align="center"><%=carMessage.getDrivertime()%></td>
			<td width="17%" height="29" align="center" valign="middle">驾照号码</td>
			<td width="30%" height="29" align="center"><%=carMessage.getLicencenumber()%></td>
		</tr>
		<tr>
			<td width="17%" height="30" align="center">驾照类型</td>
			<td width="36%" height="30" align="center"><%=carMessage.getLicencestyle()%></td>
			<td width="17%" height="30" align="center" valign="middle">运输类型</td>
			<td width="30%" height="30" align="center"><%=carMessage.getTransportstyle()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">联系人</td>
			<td width="36%" height="29" align="center"><%=carMessage.getLinkman()%></td>
			<td width="17%" height="29" align="center" valign="middle">联系电话</td>
			<td width="30%" height="29" align="center"><%=carMessage.getLinkphone()%>
			</td>
		</tr>
		<tr>
			<td width="17%" height="31" align="center">发布时间：</td>
			<td width="36%" height="31" align="left" colspan="3"><%=carMessage.getIssuedate()%></td>

		</tr>
		<tr>
			<td width="17%" height="1" align="center">备注：</td>
			<td width="83%" height="1" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=carMessage.getRemark()%></textarea>
			</td>
		</tr>

		<tr>
			<%
				userName = customer.getName();
			%>
			<td width="17%" height="31" align="center">发布人：</td>
			<td width="36%" height="31" align="left" colspan="3"><%=userName%></td>

		</tr>
		<%
			if (userName.equals(username) || "2".equals(customer.getPow())) {
		%>
		<tr>
			<td width="100%" height="45" colspan="4" align="center"><a
				href="carChange?id=<%=carMessage.getCode()%>">修改</a>&nbsp;&nbsp; <a
				href="carDelete?id=<%=carMessage.getCode()%>">删除</a></td>
		</tr>

		<%
			}
		}
		%>
	</table>
</body>
</html>
