<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>enerprise page</title>
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
			<td width="786" colspan="6">

				<p align="center">企业信息
			</td>
		</tr>
		<tr>
			<td width="786" height="30" colspan="6" align="right"><a
				href="enterpriseAdd">发布信息...</a></td>
		</tr>
		<tr align="center">
			<td width="786" height="29" align="center">企业类型</td>
			<td width="786" height="29" align="center">企业风格</td>
			<td width="786" height="29" align="center">经营范围</td>
			<td width="786" height="29" align="center">所属区域</td>
			<td width="786" height="29" align="center">地址</td>
			<td width="786" height="29" align="center">操作</td>
			
		</tr>
		<%
			List<Enterprise> enterpriseListAll = (List<Enterprise>) session.getAttribute("enterpriseListAll");
			if (enterpriseListAll == null || enterpriseListAll.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
				rowcount = enterpriseListAll.size();
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
				for (; i < enterpriseListAll.size() && i < index + 10; i++) {
					Enterprise enerprise = enterpriseListAll.get(i);
		%>
		<tr>
			<td width="786" height="29" align="center"><%=enerprise.getEnterprisesort()%></td>
			<td width="786" height="29" align="center"><%=enerprise.getEnterprisename()%></td>
			<td width="786" height="29" align="center"><%=enerprise.getOperation() %></td>
			<td width="786" height="29" align="center"><%=enerprise.getWorkarea()%></td>
			<td width="786" height="29" align="center"><%=enerprise.getAddress() %></td>
			<td width="786" height="29">
				<p align="center">
					<a href="enterpriseDetail?id=<%=enerprise.getId()%>">详细</a>
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
							<a href="enerpriseShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="enerpriseShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp;
							<a href="enerpriseShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp;
							<a href="enerpriseShow?topage=<%=pagecount%>">最后一页</a>
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
