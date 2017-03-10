<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>car page</title>
</head>
<%!int code;
	int pagesize = 10;
	int rowcount = 0;
	int pagecount = 1;%>

<body bgcolor="#ffffff">
    <jsp:include page="../top.jsp" />
	<table width="786" border="1" align="center" cellpadding="0"
		cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
		bordercolorlight="#FFFFFF">
		<tr>
			<td width="786" colspan="9">

				<p align="center">车辆信息
			</td>
		</tr>
		<tr>
			<td width="786" height="30" colspan="9" align="right"><a
				href="carAdd">发布信息...</a></td>
		</tr>
		<tr align="center">
			<td width="786" height="29" align="center">车牌号码</td>
			<td width="786" height="29" align="center">车辆品名</td>
			<td width="786" height="29" align="center">类型</td>
			<td width="786" height="29" align="center">车辆限量</td>
			<td width="786" height="29" align="center">已使用</td>
			<td width="786" height="29" align="center">驾驶员驾龄</td>
			<td width="786" height="29" align="center">运输类型</td>
			<td width="786" height="29" align="center">操作</td>
			
		</tr>
		<%
			List<CarMessage> carMsgListAll = (List<CarMessage>) session.getAttribute("carMsgListAll");
			if (carMsgListAll == null || carMsgListAll.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
				rowcount = carMsgListAll.size();
				int showpage = 1;
				pagecount = ((rowcount % pagesize) == 0 ? (rowcount / pagesize) : (rowcount / pagesize) + 1);
				String topage = request.getParameter("topage");
				if (topage != null) {
					showpage = Integer.parseInt(topage);
					if (showpage > pagecount) {
						showpage = pagecount;
					} else if (showpage <= 0) {
						showpage = 1;
					}
				}
				int i = ((showpage - 1) * pagesize + 1) - 1;
				int index = i;
				for (; i < carMsgListAll.size() && i < index + 10; i++) {
					CarMessage CarMessage = carMsgListAll.get(i);
		%>
		<tr>
			<td width="786" height="29" align="center"><%=CarMessage.getLicencenumber()%></td>
			<td width="786" height="29" align="center"><%=CarMessage.getBrand()%></td>
			<td width="786" height="29" align="center"><%=CarMessage.getStyle() %></td>
			<td width="786" height="29" align="center"><%=CarMessage.getCarload()%></td>
			<td width="786" height="29" align="center"><%=CarMessage.getUsedtime() %></td>
			<td width="786" height="29" align="center"><%=CarMessage.getDrivertime() %></td>
			<td width="786" height="29" align="center"><%=CarMessage.getTransportstyle() %></td>
			<td width="786" height="29">
				<p align="center">
					<a href="carDetail?id=<%=CarMessage.getCode()%>">详细</a>
			</td>
		</tr>

		<%
			}
		%>
		<tr>
			<td height="30" colspan="9" align="right">

				<table width="786" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="786" height="30" colspan="9" align="right">共<%=pagecount%>页&nbsp;&nbsp;
							<a href="carShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="carShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp;
							<a href="carShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp;
							<a href="carShow?topage=<%=pagecount%>">最后一页</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
