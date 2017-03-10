<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>Goods_xiangxi page</title>
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
			<td width="100%" height="52" colspan="4" align="center">货物详细信息</td>
		</tr>
		<%
			GoodsMsg goodsMsg = (GoodsMsg) session.getAttribute("goodsMsg");
			if (goodsMsg != null) {
		%>
		<tr>
			<td width="17%" height="29" align="center">货物类型：</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getGoodsstyle()%></td>
			<td width="17%" height="29" align="center" valign="middle">货物名称：</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getGoodsname()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">货物数量：</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getGoodsnumber()%>
			</td>
			<td width="17%" height="29" align="center" valign="middle">数量单位：</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getGoodsunit()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">起始省份：</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getStartprovince()%></td>
			<td width="17%" height="29" align="center" valign="middle">起始城市：</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getStartcity()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">抵达省份：</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getEndprovince()%></td>
			<td width="17%" height="29" align="center" valign="middle">抵达城市：</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getEndcity()%></td>
		</tr>
		<tr>
			<td width="17%" height="30" align="center">运输类型：</td>
			<td width="36%" height="30" align="center"><%=goodsMsg.getStyle()%></td>
			<td width="17%" height="30" align="center" valign="middle">运输时间：</td>
			<td width="30%" height="30" align="center"><%=goodsMsg.getTransporttime()%></td>
		</tr>
		<tr>
			<td width="17%" height="29" align="center">联系电话：</td>
			<td width="36%" height="29" align="center"><%=goodsMsg.getPhone()%></td>
			<td width="17%" height="29" align="center" valign="middle">联系人：</td>
			<td width="30%" height="29" align="center"><%=goodsMsg.getLink()%>
			</td>
		</tr>
		<tr>
			<td width="17%" height="31" align="center">发布时间：</td>
			<td width="36%" height="31" align="left" colspan="3"><%=goodsMsg.getIssuedate()%></td>

		</tr>
		<tr>
			<td width="17%" height="1" align="center">备注：</td>
			<td width="83%" height="1" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=goodsMsg.getRemark()%></textarea>
			</td>
		</tr>
		<tr>
			<td width="17%" height="52" align="center">车辆要求：</td>
			<td width="83%" height="52" align="center" colspan="3">
				<p align="left">
					<textarea rows="3" name="S1" cols="76"><%=goodsMsg.getRequest()%></textarea>
			</td>
		</tr>
		<tr>
			<%
				userName = goodsMsg.getUsername();
			%>
			<td width="17%" height="31" align="center">发布人：</td>
			<td width="36%" height="31" align="left" colspan="3"><%=userName%></td>

		</tr>
		<%
			if (userName.equals(username) || "2".equals(customer.getPow())) {
		%>
		<tr>
			<td width="100%" height="45" colspan="4" align="center"><a
				href="goodsChange?id=<%=goodsMsg.getId()%>">修改</a>&nbsp;&nbsp; <a
				href="goodsDelete?id=<%=goodsMsg.getId()%>">删除</a></td>
		</tr>

		<%
			}
			}
		%>
	</table>
</body>
</html>
