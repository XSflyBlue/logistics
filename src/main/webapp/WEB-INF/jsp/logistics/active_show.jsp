<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="CSS/style.css">
<title>placard page</title>
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
		alert("����δ��¼�����������ϸ��Ϣ������");
	<%response.sendRedirect("index");%>
		
	</script>
	<%
		}
		String username = (String) session.getAttribute("name");
	%><jsp:include page="../top.jsp" />
	<table width="785" height="117" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td height="38" align="center" colspan="6">��̬��Ϣ</td>
		</tr>
		<tr>
			<td width="108" height="29" align="center">ID</td>
			<td width="108" height="29" align="center">����</td>
			<td width="108" height="29" align="center">����</td>
			<td width="209" height="29" align="center">��������</td>
			<td width="245" height="29" align="center">����</td>

		</tr>
		<%
		    List<Logistics> logisticsList = (List<Logistics>) session.getAttribute("logisticsList");
			if (logisticsList==null ||logisticsList.size() == 0) {
		%>
		<script language="javascript">
			alert("û����Ϣ");
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
			<td width="245" height="32" align="center"><a href="#"
				onClick="window.open('activeDetail?id=<%=code%>','','width=790,height=530');">��ϸ</a></td>
		</tr>
		<%
				     }
		%>
		<tr>
			<td height="30" colspan="9" align="right">

				<table width="786" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="786" height="30" colspan="9" align="right">��<%=pagecount%>ҳ&nbsp;&nbsp;
							<a href="activeShow?topage=<%=1%>">��һҳ</a>&nbsp;&nbsp; <a
							href="activeShow?topage=<%=showpage - 1%>">��һҳ</a>&nbsp;&nbsp;
							<a href="activeShow?topage=<%=showpage + 1%>">��һҳ</a>&nbsp;&nbsp;
							<a href="activeShow?topage=<%=pagecount%>">���һҳ</a>
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
