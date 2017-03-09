<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="CSS/style.css">
<title>会员管理</title>
</head>
<%! int code;
	int pagesize = 10;
	int rowcount = 0;
	int pagecount = 1;%>

<body bgcolor="#ffffff">
    <jsp:include page="../mtop.jsp" />
	<table width="785" height="117" border="1" align="center"
		cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
		bordercolordark="#333333" bordercolorlight="#FFFFFF">
		<tr>
			<td height="38" align="center" colspan="9">会员资料信息修改</td>
		</tr>
		<tr>
			<td width="108" height="29" align="center">ID</td>
			<td width="108" height="29" align="center">名字</td>
			<td width="108" height="29" align="center">Email</td>
			<td width="108" height="29" align="center">性别</td>
			<td width="108" height="29" align="center">电话</td>
			<td width="108" height="29" align="center">问题</td>
			<td width="108" height="29" align="center">答案</td>
			<td width="108" height="29" align="center">申请日</td>
			<td width="108" height="29" align="center">操作</td>			
		</tr>
		<%
		    List<Customer> customerListAll = (List<Customer>) session.getAttribute("customerListAll");
			if (customerListAll == null ||customerListAll.size() == 0) {
		%>
		<script language="javascript">
			alert("没有信息");
			history.back();
		</script>
		<%
			} else {
					rowcount = customerListAll.size();
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
				    for(;i < customerListAll.size()&&i < index+10; i++){
				    	Customer customer = customerListAll.get(i);
				    	code = customer.getId();
		%>
		<tr>
			<td width="108" height="32" align="center"><%=code%></td>
			<td width="108" height="32" align="center"><%=customer.getName()%></td>
			<td width="108" height="32" align="center"><%=customer.getEmail()%></td>
			<td width="108" height="32" align="center"><%=customer.getSex()%></td>
			<td width="108" height="32" align="center"><%=customer.getPhone()%></td>
			<td width="108" height="32" align="center"><%=customer.getQuestion()%></td>
			<td width="108" height="32" align="center"><%=customer.getResult()%></td>
			<td width="108" height="32" align="center"><%=customer.getIssuedate()%></td>
			<td width="108" height="32" align="center">
			    <a href="memberChange?id=<%=customer.getId()%>">修改</a> 
				<a href="memberDelete?id=<%=customer.getId()%>">删除</a>
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
							<a href="memberShow?topage=<%=1%>">第一页</a>&nbsp;&nbsp; <a
							href="memberShow?topage=<%=showpage - 1%>">上一页</a>&nbsp;&nbsp;
							<a href="memberShow?topage=<%=showpage + 1%>">下一页</a>&nbsp;&nbsp;
							<a href="memberShow?topage=<%=pagecount%>">最后一页</a>
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
