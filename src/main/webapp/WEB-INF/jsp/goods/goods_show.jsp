<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>placard page</title>
</head>
<%!int code;
	int pagesize = 10;
	int rowcount = 0;
	int pagecount = 1;%>

<body bgcolor="#ffffff">
	<%
   		Customer customer = (Customer) session.getAttribute("customer");
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
	<table width="786" border="1" align="center" cellpadding="0"
		cellspacing="0" bordercolor="#FFFFFF" bordercolordark="#333333"
		bordercolorlight="#FFFFFF">
		<tr>
			<td width="786" colspan="9">

				<p align="center">货物信息
			</td>
		</tr>
		<tr>
			<td width="786" height="30" colspan="9" align="right"><a
				href="goodsAdd">发布信息...</a></td>
		</tr>
		<tr align="center">
			<td width="786" height="29" align="center">货物类型</td>
			<td width="786" height="29" align="center">货物名称</td>
			<td width="786" height="29" align="center">货物数量</td>
			<td width="786" height="29" align="center">数量单位</td>
			<td width="786" height="29" align="center">起始省份</td>
			<td width="786" height="29" align="center">起始城市</td>
			<td width="786" height="29" align="center">抵达省份</td>
			<td width="786" height="29" align="center">抵达城市</td>
			<td width="786" height="29">操作</td>
		</tr>
		<%
			List<GoodsMsg> goodsMsgListAll = (List<GoodsMsg>) session.getAttribute("goodsMsgListAll");
			if (goodsMsgListAll == null || goodsMsgListAll.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
				rowcount = goodsMsgListAll.size();
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
				for (; i < goodsMsgListAll.size() && i < index + 10; i++) {
					GoodsMsg GoodsMsg = goodsMsgListAll.get(i);
		%>
		<tr>
			<td width="786" height="29" align="center"><%=GoodsMsg.getGoodsstyle()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getGoodsname()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getGoodsnumber()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getGoodsunit()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getStartprovince()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getStartcity()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getEndprovince()%></td>
			<td width="786" height="29" align="center"><%=GoodsMsg.getEndcity()%></td>
			<td width="786" height="29">
				<p align="center">
					<a href="goodsDetail?id=<%=GoodsMsg.getId()%>">详细</a>
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
							<a href="goodsShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="goodsShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp; <a
							href="goodsShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp; <a
							href="goodsShow?topage=<%=pagecount%>">最后一页</a>
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
