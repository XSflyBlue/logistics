<%@ page contentType="text/html; charset=gb2312"%>
<%@ page import="java.util.List,com.logistics.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link rel="stylesheet" href="../CSS/style.css">
<title>placard_show page</title>
</head>
<script language="javascript">
	function check() {
		if (form1.title.vlaue == "") {
			alert("请填写标题！！！");
			form1.title.focus();
		}
		if (form1.content.value == "") {
			alert("请填写内容！！！");
			form1.content.focus();
		}
	}
</script>
		<%
			Knowledge knowledge = (Knowledge) session.getAttribute("knowledge");
			if (knowledge != null) {
		%>
<body bgcolor="#ffffff"><jsp:include page="../top.jsp" />
	<form method="POST" action="knowledgeChangeConfig" name="form1">
		<table width="785" height="238" border="1" align="center"
			cellpadding="0" cellspacing="0" bordercolor="#FFFFFF"
			bordercolordark="#333333" bordercolorlight="#FFFFFF">
			<tr>
				<td width="100%" height="39">
					<p align="center">物流信息修改
				</td>
			</tr>
			<tr>
				<td width="100%" height="37">标题： <input type="text"
					name="title" size="37" value="<%=knowledge.getTitle()%>"></td>
			</tr>
			<tr>
				<td width="100%" height="37">* 注意以下内容最多可以写1000个字</td>
			</tr>
			<tr>
				<td width="100%" height="36"><textarea rows="10" name="content"
						cols="100">
   <%=knowledge.getContent()%></textarea></td>
			</tr>
			<tr>
				<td width="100%" height="16">发布人: <input type="text"
					name="author" size="37" value="<%=knowledge.getAuthor()%>">
				</td>
			</tr>
			<tr>
				<td width="100%" height="16">发布时间: <%=knowledge.getIssuedate()%>
				<input type="hidden"
					name="issuedate" size="37" value="<%=knowledge.getIssuedate()%>">
				</td>
			</tr>
			<tr>
				<td width="100%" height="16">文章号: <input type="hidden"
					name="id" size="37" value="<%=knowledge.getId()%>">
				</td>
			</tr>
			<tr>
				<td width="30%" height="16"><input type="submit" value="修改"
					name="B1" onClick="return check()"> <input type="reset"
					value="重写" name="B2"> &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;
					<a href="knowledgeShow">返回</a></td>
			</tr>
		</table>
		<%}%>
	</form><jsp:include page="../down.jsp" />
</body>
</html>
