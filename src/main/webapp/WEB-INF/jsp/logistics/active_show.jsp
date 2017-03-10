<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>active page</title>
</head>
<%! int code;
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
	<table width="785" height="117" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td height="38" align="center" colspan="6">动态信息</td>
		</tr>
		<tr>
			<td width="108" height="29" align="center">ID</td>
			<td width="108" height="29" align="center">标题</td>
			<td width="108" height="29" align="center">作者</td>
			<td width="209" height="29" align="center">发布日期</td>
			<td width="245" height="29" align="center">操作</td>

		</tr>
		<%
		    List<Logistics> logisticsList = (List<Logistics>) session.getAttribute("logisticsList");
			if (logisticsList==null ||logisticsList.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
					rowcount = logisticsList.size();
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
					int i=((showpage - 1) * pagesize + 1)-1;
					int index = i;
				    for(;i < logisticsList.size()&&i < index+10; i++){
				    	Logistics logistics = logisticsList.get(i);
				    	code = logistics.getId();
		%>
		<tr>
			<td width="108" height="32" align="center"><%=code%></td>
			<td width="108" height="32" align="center"><%=logistics.getTitle()%></td>
			<td width="108" height="32" align="center"><%=logistics.getAuthor()%></td>
			<td width="209" height="32" align="center"><%=logistics.getIssuedate()%></td>
			<%
				if("2".equals(customer.getPow())){
			%>
			<td width="245" height="32" align="center"><a
				href="activeChange?id=<%=logistics.getId()%>">修改</a>&nbsp;&nbsp;
				<a href="activeDelete?id=<%=logistics.getId()%>">删除</a></td>
			<%
				}else{
			%>
			<td width="245" height="32" align="center"><a href="#"
				onClick="window.open('activeDetail?id=<%=code%>','','width=790,height=530');">详细</a></td>
			<%
			}
			%>
		</tr>
		<%
				     }
		%>
		<tr>
			<td height="30" colspan="9" align="right">

				<table width="786" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="786" height="30" colspan="9" align="right">共<%=pagecount%>页&nbsp;&nbsp;
							<a href="activeShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="activeShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp;
							<a href="activeShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp;
							<a href="activeShow?topage=<%=pagecount%>">最后一页</a>
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
