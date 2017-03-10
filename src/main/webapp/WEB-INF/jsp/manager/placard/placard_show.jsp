<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>placard show</title>
</head>
<%! int code;
	int pagesize = 10;
	int rowcount = 0;
	int pagecount = 1;%>

<body bgcolor="#ffffff">
	<%
		String login = (String) session.getAttribute("login");
		if (login == null) {
	%>
	<script language="javascript">
		alert("您还未登录，不能浏览详细信息！！！");
	<%response.sendRedirect("index");%>
		
	</script>
	<%
		}
		String username = (String) session.getAttribute("name");
	%><jsp:include page="../mtop.jsp" />
	<table width="785" height="117" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td height="38" align="center" colspan="6">网站公告信息</td>
		</tr>
		<tr>
			<td height="30" align="right" colspan="6"><a href="placardAdd">发布公告信息</a></td>
		</tr>
		<tr>
			<td width="108" height="29" align="center">ID</td>
			<td width="108" height="29" align="center">标题</td>
			<td width="108" height="29" align="center">作者</td>
			<td width="209" height="29" align="center">发布日期</td>
			<td width="245" height="29" align="center">操作</td>

		</tr>
		<%
		    List<Placard> placardList = (List<Placard>) session.getAttribute("placardList");
			if (placardList==null ||placardList.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
					rowcount = placardList.size();
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
				    for(;i < placardList.size()&&i < index+10; i++){
				    	Placard palcard = placardList.get(i);
				    	code = palcard.getId();
		%>
		<tr>
			<td width="108" height="32" align="center"><%=code%></td>
			<td width="108" height="32" align="center"><%=palcard.getTitle()%></td>
			<td width="108" height="32" align="center"><%=palcard.getAuthor()%></td>
			<td width="209" height="32" align="center"><%=palcard.getIssuedate()%></td>
			<td width="245" height="32" align="center">
				<a href="placardChange?id=<%=palcard.getId()%>">修改</a> 
				<a href="placardDelete?id=<%=palcard.getId()%>">删除</a>
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
							<a href="placardShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="placardShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp;
							<a href="placardShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp;
							<a href="placardShow?topage=<%=pagecount%>">最后一页</a>
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
